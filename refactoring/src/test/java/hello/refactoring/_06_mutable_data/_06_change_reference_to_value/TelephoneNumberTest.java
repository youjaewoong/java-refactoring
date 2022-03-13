package hello.refactoring._06_mutable_data._06_change_reference_to_value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TelephoneNumberTest {

	@Test
	void testEquals() {
		TelephoneNumber number1 = new TelephoneNumber("123", "1234");
		TelephoneNumber number2 = new TelephoneNumber("123", "1234");
		assertEquals(number1, number2);
		
		TelephoneRecordNumber number3 = new TelephoneRecordNumber("123", "1234");
		TelephoneRecordNumber number4 = new TelephoneRecordNumber("123", "1234");
		assertEquals(number3, number4);
	}
}
