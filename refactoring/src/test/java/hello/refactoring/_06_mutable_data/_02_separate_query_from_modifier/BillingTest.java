package hello.refactoring._06_mutable_data._02_separate_query_from_modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class BillingTest {

	@Test
	void totalOutstanding() {
		Billing billing = new Billing(new Customer("jaewoong", List.of(new Invoice(20), new Invoice(30))),
				new EmailGateway());
		assertEquals(50d, billing.totalOutstandingAndSendBill());
		
		billing.sendBill();
	}

}
