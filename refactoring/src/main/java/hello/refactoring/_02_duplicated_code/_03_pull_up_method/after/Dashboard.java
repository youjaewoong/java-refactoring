package hello.refactoring._02_duplicated_code._03_pull_up_method.after;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class Dashboard {

    public static void main(String[] args) throws IOException {
        ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printReviewers();

        Dashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printUsernames(15);
    }

	public void printUsernames(int eventId) throws IOException {
	    // Get github issue to check homework
	    GHIssue issue = getGhIssue(eventId);
	
	    // Get participants
	    Set<String> participants = getUsernames(issue);
	
	    // Print participants
	    participants.forEach(System.out::println);
	}

	private Set<String> getUsernames(GHIssue issue) throws IOException {
		Set<String> usernames = new HashSet<>();
	    issue.getComments().forEach(c -> usernames.add(c.getUserName()));
		return usernames;
	}

	private GHIssue getGhIssue(int eventId) throws IOException {
		GitHub gitHub = GitHub.connect();
	    GHRepository repository = gitHub.getRepository("whiteship/live-study");
	    GHIssue issue = repository.getIssue(eventId);
		return issue;
	}
}
