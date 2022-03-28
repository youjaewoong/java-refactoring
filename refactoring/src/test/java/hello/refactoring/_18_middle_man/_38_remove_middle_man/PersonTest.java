package hello.refactoring._18_middle_man._38_remove_middle_man;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void getManager() {
		Person nick = new Person("nick", null);
		Person jaewoong = new Person("jaewoong", new Department(nick));
		
		//Person manager= jaewoong.getDepartment().getManager();
		Person manager= jaewoong.getManager();
		assertEquals(nick, manager);
	}
}
