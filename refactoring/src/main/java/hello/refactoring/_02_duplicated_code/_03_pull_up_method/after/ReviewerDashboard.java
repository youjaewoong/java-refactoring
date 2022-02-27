package hello.refactoring._02_duplicated_code._03_pull_up_method.after;

import java.io.IOException;

public class ReviewerDashboard extends Dashboard {

    public void printReviewers() throws IOException {
        super.printUsernames(30);
    }
}
