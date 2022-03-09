package hello.refactoring._06_mutable_data._04_replace_derived_variable_with_query;

public class Discount {

    private double discount;
    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }
    /**
     * 변하지 않는 변수 유지
     * @return
     */
    public double getDiscountedTotal() {
    	//assert this.discountedTotal == this.baseTotal - this.discount;
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
    }
}
