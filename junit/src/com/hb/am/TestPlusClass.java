package com.hb.am;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlusClass {

	/*
	assertEquals(x, y) : x 와 y 가 같으면 테스트 통과
	assertFalse(b) : b가 false 이면 테스트 통과
	assertTrue(b) : b가 true 이면 테스트 통과
	assertNull(o) : 객체 o 가 null 이면 테스트 통과
	assertNotNull(o) : 객체 o 가 null 이 아니면 테스트 통과
	assertSame(ox, oy)  : ox 와 oy 가 같은 객체를 참조하고 있으면 테스트 통과
	assertNotSame(ox, oy) : ox 와 oy 가 같은 객체를 참조하고 있지 않으면 통과
   */

	//	@Test(timeout=5000)를 메소드 위에 선언합니다. 
	// 결과를 반환하는데 5,000밀리 초를 넘기면 실패 
	@Test
	public void test() {
		// 기본적으로 실패를 내보냄
		 fail("Not yet implemented");
		/*
		int res = 0 ;
		PlusClass pc = new PlusClass();
		
		res = pc.plus(10, 20);
		 // assertEquals(나올 기대값, 진짜 나오는 값);
		assertEquals(30,res);
			
		 // assertEquals(나올 기대값, 진짜 나오는 값);
     	 assertEquals(80,pc.plus(30, 50));*/
	}

}
