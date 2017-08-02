package com.hb.bm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterizedTest {
	// 테스트에 가용될 값을 인스턴스 변수로 선언
	private int expected;
	private int valueA;
	private int valueB;
	
	public  ParameterizedTest(int expected, int valueA, int valueB) {
		this.expected = expected;
		this.valueA =  valueA;
		this.valueB = valueB;
	}
	// 파라미터받는 생성자
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][]{
			{5,2,3}, //예상값 , 입력값, 입력값
			{50,20,30}, // 예상값, 입력값, 입력값
			{50,0,50}	// 예상값, 입력값, 입력값
		});
	}
	
	
	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(expected, calc.plus(valueA, valueB));
	}

}
