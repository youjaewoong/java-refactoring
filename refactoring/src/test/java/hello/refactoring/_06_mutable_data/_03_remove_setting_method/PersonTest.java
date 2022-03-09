package hello.refactoring._06_mutable_data._03_remove_setting_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void person() {
		Person person = new Person(10);
		person.setName("jaewoong");
		assertEquals(10, person.getId());
		assertEquals("jaewoong", person.getName());
		person.setName("gos1004");
		assertEquals("gos1004", person.getName());
	}
}
