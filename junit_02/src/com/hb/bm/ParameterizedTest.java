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
	// �׽�Ʈ�� ����� ���� �ν��Ͻ� ������ ����
	private int expected;
	private int valueA;
	private int valueB;
	
	public  ParameterizedTest(int expected, int valueA, int valueB) {
		this.expected = expected;
		this.valueA =  valueA;
		this.valueB = valueB;
	}
	// �Ķ���͹޴� ������
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][]{
			{5,2,3}, //���� , �Է°�, �Է°�
			{50,20,30}, // ����, �Է°�, �Է°�
			{50,0,50}	// ����, �Է°�, �Է°�
		});
	}
	
	
	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(expected, calc.plus(valueA, valueB));
	}

}
