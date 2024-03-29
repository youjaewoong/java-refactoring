package hello.refactoring._06_mutable_data._05_combine_functions_into_transform;

public class Client2 extends ReadingClient {

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
        EnrichReading enrichReading = enrichReading(reading);
		this.base = enrichReading.baseCharge();
        this.taxableCharge = enrichReading.taxableCharge();
    }

    public double getBaseCharge() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
