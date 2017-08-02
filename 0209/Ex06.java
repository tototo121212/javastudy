class Ex06 
{
	// default는 같은패키지에서는 접근 가능
	String name = "호랑이";
	int age = 14 ;

    // 무조건 접근 안됨
	private String name2 = "강아지";
	private int age2 = 3 ;

	private static String name3 = "고양이";
	static int age3 = 2 ;


    // private 변수들은 메소드를 이용해서 접근한다. (getter)
	// 변수들의 값을 변경할때도 메소드를 이용한다.  (setter)

	public String getName2(){
         return name2;
	}
	public int getAge2(){
        return age2 ;
	}

    public void setName2(String a){
           name2 = a ;
	}

    public void setAge2(int a){
           age2 = a ;
	}
}
