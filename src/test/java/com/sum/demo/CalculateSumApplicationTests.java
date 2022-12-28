package com.sum.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculateSumApplicationTests {

	
	@Autowired
	 Sum add;
	
	@Test
	public void testDependencyInjection() {
		assertNotNull(add);
	}
	
	@Test
	public void checksumfor2numbers() {
		add.Sumoftwonumbers(10, 20);
	}
	
	@Test
	public void testCalculation() {
		assertEquals(500, add.Sumoftwonumbers(499, 1));
	}

}
