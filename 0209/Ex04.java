class Ex04 
{
	int su = 10 ;
	int su2 = 5 ;

    // 오버로딩 : 중복정의 
    // 메소드이름 같으나 인자(매개변수)가 다르다
	public int add(){
		return su+su2;
	}

	public int add(int a){
		return a +1000;
	}

	public int add(int a, int b){
       return a+b;
	}

	public int add(String a, String b){
       return (Integer.parseInt(a) + Integer.parseInt(b)) ;
	}
	public int add(int a, String b){
       return a +Integer.parseInt(b) ;
	}
    public int add(String b, int a){
		return a +Integer.parseInt(b) ;
	}
	
}
