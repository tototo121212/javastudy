package com.hb.cm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(30, calc.plus(10, 20));
	}

}
