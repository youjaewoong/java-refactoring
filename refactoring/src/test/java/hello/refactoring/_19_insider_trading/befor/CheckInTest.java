package hello.refactoring._19_insider_trading.befor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CheckInTest {

	@Test
	void isFastPass() {
		CheckIn checkIn = new CheckIn();
		assertTrue(checkIn.isFastPass(new Ticket(LocalDate.of(2021, 12, 31), true)));
		assertFalse(checkIn.isFastPass(new Ticket(LocalDate.of(2021, 12, 31), false)));
		assertFalse(checkIn.isFastPass(new Ticket(LocalDate.of(2022, 1, 2), true)));
	}
}