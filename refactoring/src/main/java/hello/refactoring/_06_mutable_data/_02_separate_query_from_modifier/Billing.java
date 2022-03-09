package hello.refactoring._06_mutable_data._02_separate_query_from_modifier;

public class Billing {
	
	/**
	 * totalOutstandingAndSendBill
	 * sendBill
	 * 함수 분리
	 */
    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    public double totalOutstandingAndSendBill() {
    	return customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
