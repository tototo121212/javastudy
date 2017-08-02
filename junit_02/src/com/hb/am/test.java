package com.hb.am;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hb.bm.Calc;

public class test {

	@Test
	public void test() {
		// 기본적으로 실패를 내보냄
		//fail("Not yet implemented");
		
		int res = 0;
		Calc calc = new Calc();
		
		res = calc.plus(10, 20);
			//assertEquals(개발자가 생각하는 결과 예상값, 진짜 나오는 값);
		assertEquals(30, res);
		
		//assertEquals(나올 기대값, 진짜 나오는값);
		assertEquals(70, calc.plus(30, 50));
	}

}
