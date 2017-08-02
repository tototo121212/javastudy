import java.util.Random;
import java.util.Scanner;

class BaseballGame {
	public static void main(String[] args) {
		// �߱�����
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		
		System.out.println("<< Baseball Game >>");
		System.out.println("�� �ڸ� ���� ���߱�!");
		System.out.println();
		System.out.println("-----Game Start-----");
		
		start:
		while(true){
		int out=0;
		int strike=0;
		int ball=0;

		// ���� ���� ����
		for (int i=0; i<com.length; i++)
		{
			com[i] = Math.abs(random.nextInt())%9+1;
		}
		
		// �ߺ��� �ٽ� ����
		while(true){
		boolean flag = false;			
		for (int i=0; i<com.length-1; i++)
		{
			for (int j=i+1; j<com.length; j++)
			{
				if(com[i]==com[j]){
					com[j] = random.nextInt(9)+1;
					flag = true;
				}
			}
		}
		if(flag==false) break;
		}
		
		//-----���� ���� �Ϸ�-----
		
		// �׽�Ʈ
		System.out.print("((�׽�Ʈ)) ������ ����: ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i]+"  ");
		}
		System.out.println();
		//
		
		game:
		while(true){
		strike=0;
		ball=0;
		// ����� ��ȣ �Է�
		for (int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"�� ���� >> ");
			user[i] = scan.nextInt();
			if(user[i]>=1 && user[i]<=9){
			}else{
				System.out.println("�Է��� ���ڸ� ���ڸ� �����մϴ�.");
				i=i-1;
				continue;
			}
			if(i>=1){
				for (int j = 0; j < user.length; j++) {
					if(i==j){						
					}else if(user[i]==user[j]){
						System.out.println("�ߺ��� ���ڴ� �Է��� �� �����ϴ�.");
						i=i-1;
						break;						
					}
				}
			}
		}
		
		// ����ڰ� �Է��� ���� ���
		System.out.print("�Է��� ����: ");
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i]+"  ");
		}
		System.out.println();
				
		// ���� ��
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if(com[i]==user[j]){
					if(i==j){
						strike++;
					}else{
						ball++;
					}
				}
			}
		}
		
		// �� ��� ���
		System.out.println();
		System.out.print("<< ");
		if(strike==3){
			System.out.print("�١ڡ� HOMERUN �١ڡ� >>");
			System.out.println();
			break game;
		}
		if(strike!=3 && strike!=0) System.out.print(" "+strike+"��Ʈ����ũ ");
		if(ball!=0) System.out.print(" "+ball+"�� ");
		if(strike==0 && ball==0){
			out++;
			System.out.print(" "+out+"�ƿ�! ");
		}
		System.out.println(" >>");
		System.out.println();
		if(out==3){
			System.out.print("<< Game Over >>");
			System.out.println();
			break game;
		}
		user[0]=user[1]=user[2]=0;
		}
		System.out.println();
		while(true){
			System.out.print("�� ���� ��? (Y/N) ");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")){
				continue start;
			}else if(yn.equalsIgnoreCase("n")){
				break start;
			}else{
				continue;
			}
		}
		
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
