package hello.refactoring._08_shotgun_surgery._01_move_field;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void applayDiscount() {
		Customer customer = new Customer("jaewoong", 0.5);
		assertEquals(50, customer.applyDiscount(100));
		
		customer.becomePreferred();
		assertEquals(47, customer.applyDiscount(100));
	}
}
