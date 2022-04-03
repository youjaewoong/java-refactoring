package hello.refactoring._18_middle_man._39_replace_superclass_with_delegate.befor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import hello.refactoring._18_middle_man._39_replace_superclass_with_delegate.CategoryItem;

public class Scroll extends CategoryItem {

    private LocalDate dateLastCleaned;

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        super(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
