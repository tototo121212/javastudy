class Ex4{
    public static void main(String[] args){
    //  문자형 ;  char , 자바는 전세계의 모든 글자 표현가능(2byte)
    //           유니코드 사용(아스키 코드 포함됨)
    //  숫자, 영문자소문자, 영문자대문자만 사용 => 아스키코드 
    //  문자형은 '홑따옴표사용' => 'a', 'k', 

       char result = 'a' ;// 숫자로 저장(charset)
            result = 'A' ;
	    result = 97 ;
	    result = 97 + 5  ;	
       System.out.println(result);
    }
}