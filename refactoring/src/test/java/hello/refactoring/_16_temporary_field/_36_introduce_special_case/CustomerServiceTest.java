package hello.refactoring._16_temporary_field._36_introduce_special_case;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerServiceTest {
	
	CustomerService customerService = new CustomerService();
	
	Customer unknown = new Customer("unknown", null, null);

	BillingPlan jaewoongBillingPlan = new BillingPlan();
	
	Customer jaewoong = new Customer("jaewoong", jaewoongBillingPlan, new PaymentHistory(1));
	
	@Test
	void customerName() {
		String unknownCustomerName = customerService.customerName(new Site(unknown));
		assertEquals("occupant", unknownCustomerName);

		String customer = customerService.customerName(new Site(jaewoong));
		assertEquals("jaewoong", customer);
	}
	
	@Test
	void billingPlan() {
		assertTrue((customerService.billingPlan(new Site(unknown)) instanceof BasicBillingPlan));
		assertEquals(jaewoongBillingPlan, customerService.billingPlan(new Site(jaewoong)));
	}
	
	@Test
	void weeksDelingguent() {
		assertEquals(1, customerService.weeksDelinquent(new Site(jaewoong)));
		assertEquals(0, customerService.weeksDelinquent(new Site(unknown)));
	}
}
