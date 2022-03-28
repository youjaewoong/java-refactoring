package hello.refactoring._17_message_chain._37_hide_delegate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void manager() {
		Person jaewoong = new Person("jaewoong");
		Person nick = new Person("nick");
		jaewoong.setDepartment(new Department("m365deploy", nick));
		
		Person manager= jaewoong.getManager();
		assertEquals(nick, manager);
	}
}
