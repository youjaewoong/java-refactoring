package hello.refactoring._06_mutable_data._04_replace_derived_variable_with_query;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductionPlanTest {

	@Test
	void production() {
		ProductionPlan productionPlan = new ProductionPlan();
		productionPlan.applyAdjustment(10);
		productionPlan.applyAdjustment(20);
		assertEquals(30, productionPlan.getProduction()); 
	}

}
