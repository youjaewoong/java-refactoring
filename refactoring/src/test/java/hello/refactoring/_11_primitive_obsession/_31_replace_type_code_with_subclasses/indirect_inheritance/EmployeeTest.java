package hello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void capitalizedType() {
		assertEquals("Manager", new FullTimeEmployee("jaewoong", "manager").capitalizedType());
		assertEquals("Engineer", new FullTimeEmployee("jaewoong", "engineer").capitalizedType());
		assertThrows(IllegalArgumentException.class, () -> new Employee("jaewoong", "wrong type"));
	}
}
