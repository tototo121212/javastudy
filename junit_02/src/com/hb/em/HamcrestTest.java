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
		
		// import static org.hamcrest.CoreMatchers.*;�ؾ� ��
		// assertThat(����,�񱳴��, ���);
		
		// assertThat("1�� ���� ���� �׽�Ʈ",1, not(2)); // ����
		// assertThat("1�� ���� �׽�Ʈ",1, equalTo(1)); // ����
		// assertThat("���ڿ��� �����ϰ� �ִ��� �׽�Ʈ","abcdf", containsString("a"));
		
		Calc calc = new Calc();
		assertThat("+ �׽�Ʈ",5,equalTo(calc.plus(2, 3)));
		
	}

}
