class Ex03 
{

	 
	//  덧셈기능 , 반환형 존재
	public int add(int a, int b){
	    int result = a + b ;
		return result ;
	}

	// 뺄셈기능 , 반환형 존재
	public int sub(int a, int b){
	    return a-b;	
	}

	public void mul(int a, int b){
         System.out.println("결과 : " +(a * b)) ;
	}

	public void div(int a, int b){
         int result = a / b ;
		 System.out.println("결과 : " + result);
	}
    // 부가세 10%
	public static double vat(int a){
	   return a +(a * 0.1) ;
	}
}
