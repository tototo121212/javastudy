package com.hb.em;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hb.bm.Calc;

import static org.hamcrest.CoreMatchers.*;
public class HamcrestTest {
	@Test
	public void test() {
		// not
		// equalTo
		// containsString
		
		// import static org.hamcrest.CoreMatchers.*;해야 됨
		// assertThat(설명,비교대상, 결과);
		
		// assertThat("1과 같지 않은 테스트",1, not(2)); // 성공
		// assertThat("1과 같은 테스트",1, equalTo(1)); // 성공
		// assertThat("문자열을 포함하고 있는지 테스트","abcdf", containsString("a"));
		
		Calc calc = new Calc();
		assertThat("+ 테스트",5,equalTo(calc.plus(2, 3)));
		
	}

}
