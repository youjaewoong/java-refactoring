package hello.refactoring._08_shotgun_surgery._02_inline_function.befor;

import hello.refactoring._08_shotgun_surgery._02_inline_function.Driver;

public class Rating {

    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5;
    }
}
