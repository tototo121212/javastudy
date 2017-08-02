class Test01{
    public static void main(String[] args){
       // 입력  =>  처리 (가공)  => 출력

        int com = 81;
        int eng = 73;
        int math = 90;
        int java = 70;

        // int sum = 80 + 85 + 90 + 70 ;
        int sum = com + eng + math + java ; 
        
	double avg = sum / 7.0 ;
        int res = (int)(avg * 100);
        double avg2  = res /100.0;
        
	double avg3 = Math.ceil(avg*1000)/1000.0;  // 올림
        double avg4 = Math.round(avg*1000)/1000.0; // 반올림
        double avg5 = Math.floor(avg*100)/100.0; // 버림
     System.out.println("===== 실행결과 =====");
     System.out.println("점수 : "+com+"\t"+eng+"\t"+math+"\t"+java); 
     System.out.println("총점 : " + sum);
     System.out.println("평균1 : " + avg);
     System.out.println("평균2 : " + avg2);
     System.out.println("평균3 : " + avg3); 
     System.out.println("평균4 : " + avg4); 
     System.out.println("평균5 : " + avg5); 
    }
}







