package com.hb.cm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase2 {

	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(-10, calc.sub(10, 20));
	}

}
