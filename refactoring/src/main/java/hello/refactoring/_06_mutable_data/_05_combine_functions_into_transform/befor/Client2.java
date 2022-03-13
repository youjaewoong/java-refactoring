package hello.refactoring._06_mutable_data._05_combine_functions_into_transform.befor;

import java.time.Month;
import java.time.Year;

import hello.refactoring._06_mutable_data._05_combine_functions_into_transform.Reading;

public class Client2 {

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
        this.base = baseRate(reading.month(), reading.year()) * reading.quantity();
        this.taxableCharge = Math.max(0, this.base - taxThreshold(reading.year()));
    }

    private double taxThreshold(Year year) {
        return 5;
    }

    private double baseRate(Month month, Year year) {
        return 10;
    }

    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
