class Test06{
     public static void main(String[] args){
	double cm, feet, fe, inch, in ;

        cm = 162.56 ;
        inch =  2.54; // 1인치 2.54cm
        feet = 12 * inch; // 1피트 12인치 = 12 * 2.54 = 30.48cm

        fe = cm / feet ; 
        in = (cm % feet) / inch ;

        System.out.println(cm+"cm는 " +(int)(fe)+"피트"
         +(int)(in)+"인치이다.");

     }
}