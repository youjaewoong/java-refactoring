package hello.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void employeeType() {
		assertEquals("manager", Employee.createEmployee("jaewoong", "manager").getType());
		assertEquals("engineer", Employee.createEmployee("jaewoong", "engineer").getType());
		assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("jaewoong", "wrong type").getType());
	}
}
