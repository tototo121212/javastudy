package com.hb.am;

public class Ex04 {
	public static void main(String[] args) {
		// 랩퍼 클래스들 ;  각종 자료형들을 객체로 만드는 역할
		// 각종 자료형 마다 객체로 만들어주는 클래스가 별도로 존재
		// boolean=>Boolean, char=>Character, int=>Integer, double=>Double
		boolean b= true;
		Boolean w_b = new Boolean(b);
		
		char c = 'A';
		Character w_c = new Character(c);
		
		int su = 123 ;
		Integer w_su = new Integer(su);
		
		double su2 = 3.14;
		Double w_su2 = new Double(su2);
		
	   ///////////////////////////////////////////////////	
	   // String => 각종자료형으로 변경
		
		String s1 ="true";
		// 객체 생성없이 사용가능한 이유 : static 이므로
		boolean k1 = Boolean.parseBoolean(s1);
		
		//char는 String에서 charAt() 사용하면 된다.
		
		String s2 = "123";
		int k2 = Integer.parseInt(s2);
		
		String s3 = "3.14";
		double k3 = Double.parseDouble(s3);
		
		String s4 = "3.14f";
		float k4 = Float.parseFloat(s4);
		
	}
}
