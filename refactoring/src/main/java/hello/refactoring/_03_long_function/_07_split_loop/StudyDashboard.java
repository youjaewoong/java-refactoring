package hello.refactoring._03_long_function._07_split_loop;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudyDashboard {

    private final int totalNumberOfEvents;
	private List<Participant> participants;
	private Participant[] firstParticipantsForEachEvent;

    public StudyDashboard(int totalNumberOfEvents) {
        this.totalNumberOfEvents = totalNumberOfEvents;
		participants = new CopyOnWriteArrayList<>();
		firstParticipantsForEachEvent = new Participant[this.totalNumberOfEvents];
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        StudyDashboard studyDashboard = new StudyDashboard(15);
        studyDashboard.print();
    }

    private void print() throws IOException, InterruptedException {
        checkGithubIssues(getGhepository());
        new StudyPrinter(this.totalNumberOfEvents, this.participants).execute();
        printFirstParticipants();
    }

	private void printFirstParticipants() {
		Arrays.stream(this.firstParticipantsForEachEvent).forEach(p -> System.out.println(p.username()));
	}

	private GHRepository getGhepository() throws IOException {
		return GitHub.connect().getRepository("whiteship/live-study");
	}

	private void checkGithubIssues(GHRepository ghRepository)
			throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(8);
		CountDownLatch latch = new CountDownLatch(totalNumberOfEvents);
		
		for (int index = 1 ; index <= totalNumberOfEvents ; index++) {
            int eventId = index;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        GHIssue issue = ghRepository.getIssue(eventId);
                        List<GHIssueComment> comments = issue.getComments();
                        checkHomework(comments, participants, eventId);
                        firstParticipantsForEachEvent[eventId - 1] = findFirst(comments, participants);
                        latch.countDown();
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            });
        }
		
		latch.await();
		service.shutdown();
	}
    
	private void checkHomework(List<GHIssueComment> comments, List<Participant> participants, int eventId) {
    	for (GHIssueComment comment : comments) {
    		Participant participant = findParticipant(comment.getUserName(), participants);
    		participant.setHomeworkDone(eventId);
    	}
	}

	private Participant findFirst(List<GHIssueComment> comments, List<Participant> participants) throws IOException {
		Date firstCreatedAt = null;
		Participant first = null;
		for (GHIssueComment comment : comments) {
		    Participant participant = findParticipant(comment.getUserName(), participants);
		    
		    if (firstCreatedAt == null || comment.getCreatedAt().before(firstCreatedAt)) {
		        firstCreatedAt = comment.getCreatedAt();
		        first = participant;
		    }
		}
		return first;
	}
	
    private Participant findParticipant(String username, List<Participant> participants) {
        return isNewParticipant(username, participants) ?
                createNewParticipant(username, participants) :
                findExistingParticipant(username, participants);
    }

    private Participant findExistingParticipant(String username, List<Participant> participants) {
        Participant participant;
        participant = participants.stream().filter(p -> p.username().equals(username)).findFirst().orElseThrow();
        return participant;
    }

    private Participant createNewParticipant(String username, List<Participant> participants) {
        Participant participant;
        participant = new Participant(username);
        participants.add(participant);
        return participant;
    }

    private boolean isNewParticipant(String username, List<Participant> participants) {
        return participants.stream().noneMatch(p -> p.username().equals(username));
    }

}
