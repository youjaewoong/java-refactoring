package hello.refactoring._06_mutable_data._02_separate_query_from_modifier.befor;

public class Invoice {

    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
