package com.hb.cm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase3 {

	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(200, calc.mul(10, 20));
	}

}
