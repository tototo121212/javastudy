import java.util.Random;
import java.util.Scanner;

class BaseballGame {
	public static void main(String[] args) {
		// 야구게임
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		
		System.out.println("<< Baseball Game >>");
		System.out.println("세 자리 숫자 맞추기!");
		System.out.println();
		System.out.println("-----Game Start-----");
		
		start:
		while(true){
		int out=0;
		int strike=0;
		int ball=0;

		// 숫자 세개 생성
		for (int i=0; i<com.length; i++)
		{
			com[i] = Math.abs(random.nextInt())%9+1;
		}
		
		// 중복시 다시 생성
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
		
		//-----숫자 생성 완료-----
		
		// 테스트
		System.out.print("((테스트)) 생성된 숫자: ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i]+"  ");
		}
		System.out.println();
		//
		
		game:
		while(true){
		strike=0;
		ball=0;
		// 사용자 번호 입력
		for (int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"번 숫자 >> ");
			user[i] = scan.nextInt();
			if(user[i]>=1 && user[i]<=9){
			}else{
				System.out.println("입력은 한자리 숫자만 가능합니다.");
				i=i-1;
				continue;
			}
			if(i>=1){
				for (int j = 0; j < user.length; j++) {
					if(i==j){						
					}else if(user[i]==user[j]){
						System.out.println("중복된 숫자는 입력할 수 없습니다.");
						i=i-1;
						break;						
					}
				}
			}
		}
		
		// 사용자가 입력한 숫자 출력
		System.out.print("입력한 숫자: ");
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i]+"  ");
		}
		System.out.println();
				
		// 숫자 비교
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
		
		// 비교 결과 출력
		System.out.println();
		System.out.print("<< ");
		if(strike==3){
			System.out.print("☆★☆ HOMERUN ☆★☆ >>");
			System.out.println();
			break game;
		}
		if(strike!=3 && strike!=0) System.out.print(" "+strike+"스트라이크 ");
		if(ball!=0) System.out.print(" "+ball+"볼 ");
		if(strike==0 && ball==0){
			out++;
			System.out.print(" "+out+"아웃! ");
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
			System.out.print("한 게임 더? (Y/N) ");
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
		System.out.println("프로그램을 종료합니다.");
	}
}
