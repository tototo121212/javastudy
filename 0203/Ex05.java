class Ex05{
	public static void main(String[] args){
           //  ���ڰ� : byte, short, int, char ,String 
           //  ���ڰ����� ���ǽ� X (�񱳿���, ������, boolean��)
           //  break�� ���� switch���� ���������� ���,  
           //  �����ϸ� break���� ���������� �����Ѵ�.
           // switch(���ڰ�){
           //    case ���ǰ�1 : ���๮��;    break;
           //    case ���ǰ�2 : ���๮��;    break;
           //    case ���ǰ�3 : ���๮��;    break;
	   //    case ���ǰ�4 : ���๮��;    break;
           //    default : ���๮�� ;
           //  } 

      // char ch�� A, a �̸� ������ī, B,b�̸� ����� C, c �̸� ĳ����. �������� �ѱ�
            char ch = 'a' ;
            switch(ch){
                case 'A' : 
                case 'a' : System.out.println("������ī");break;
                case 'B' :  
                case 'b' : System.out.println("�����"); break;
                case 'C' : 
                case 'c' : System.out.println("ĳ����"); break;
                default : System.out.println("�ѱ�");
            }
      // month �� 3,4,5  "��", 6,7,8 "����" , 9,10,11 "����", 12,1,2 "�ܿ�"   
        int month = 2 ;
         switch(month){
            case 12 : 
            case 1 :
            case 2 : System.out.println("�ܿ�"); break;
            case 3 : 
            case 4 :
            case 5 : System.out.println("��"); break;
            case 6 : 
            case 7 :
            case 8 : System.out.println("����"); break;
            case 9 : 
            case 10 :
            case 11 : System.out.println("����"); break;
         }

      // ����� 90�̻��̸� A����, 80�̻��̸� B����, 70�̻��̸� C������������ F����
       double avg = 87.5 ;
       switch((int)(avg/10)){
           case 10 :
           case 9 : System.out.println("A����"); break;
           case 8 : System.out.println("B����"); break;
           case 7 : System.out.println("C����"); break;
           default : System.out.println("F����"); break;
       }
     // 1�� ī���ī 3500, 2�� �Ƹ޸�ī�� 3000, 3�� ī��� 4000 �̴�.
     // 10000���� �����ϰ� ģ���� �Ƹ޸�ī�� 2���� �Ծ���. 
     // �ܵ��� �󸶸� �޾ƾ� �ϴ°�(�ΰ���10%)
        
       int input = 10000;
       int menu = 1 ;
       int su = 2 ;
       String coff= "";
       int dan = 0 ;
       int vat = 0 ;
       int total = 0 ;
       int output = 0 ;

       switch(menu){
         case 1 : coff="ī���ī"; 
                  dan = 3500 ; 
                  break;
         case 2 : coff="�Ƹ޸�ī��"; 
                  dan = 3000 ; 
                  break;
         case 3 : coff="ī���"; 
                  dan = 4000 ; 
                 break;
       }  
      
    vat = (int)(dan * su * 0.1);
    total = dan * su + vat ;
    output = input - total;
    
    System.out.println(output);  

  
    }
}






























