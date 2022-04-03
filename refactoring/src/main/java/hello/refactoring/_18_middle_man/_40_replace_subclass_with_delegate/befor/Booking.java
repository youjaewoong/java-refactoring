package hello.refactoring._18_middle_man._40_replace_subclass_with_delegate.befor;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import hello.refactoring._18_middle_man._40_replace_subclass_with_delegate.Show;

public class Booking {

    protected Show show;
    protected LocalDateTime time;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public boolean hasTalkback() {
        return this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return result;
    }

}
