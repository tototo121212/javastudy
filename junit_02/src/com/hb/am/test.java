package com.hb.am;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hb.bm.Calc;

public class test {

	@Test
	public void test() {
		// �⺻������ ���и� ������
		//fail("Not yet implemented");
		
		int res = 0;
		Calc calc = new Calc();
		
		res = calc.plus(10, 20);
			//assertEquals(�����ڰ� �����ϴ� ��� ����, ��¥ ������ ��);
		assertEquals(30, res);
		
		//assertEquals(���� ��밪, ��¥ �����°�);
		assertEquals(70, calc.plus(30, 50));
	}

}
