
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Baseball extends JFrame implements ActionListener {
	JPanel jp1, jp2;
	JTextField tx;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bt1, bt2, bt3, bt4, bt5;
	JTextArea ta;
	JScrollPane sp;
	static Random ran = new Random();
	static int[] com = new int[3];
	static int[] user = new int[3];
	static int k, b, o = 0, c = 0, cnt;

	public Baseball() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jp1.setLayout(new GridLayout(2, 1)); // TextField, TextArea Layout.
		jp2.setLayout(new GridLayout(5, 3)); // Button Layout.

		ta = new JTextArea(1, 2);
		sp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		ta.setLineWrap(true);

		tx = new JTextField(20);

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bt1 = new JButton("확인");
		bt2 = new JButton("재입력");
		bt3 = new JButton("재시작");
		bt4 = new JButton("종료");
		bt5 = new JButton("?");

		jp1.add(sp, BorderLayout.NORTH);
		jp1.add(tx, BorderLayout.CENTER);

		jp2.add(b7);
		jp2.add(b8);
		jp2.add(b9);
		jp2.add(b4);
		jp2.add(b5);
		jp2.add(b6);
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		jp2.add(b0);
		jp2.add(bt1);
		jp2.add(bt2);
		jp2.add(bt3);
		jp2.add(bt4);
		jp2.add(bt5);
		

		add(jp1, BorderLayout.NORTH);
		add(jp2);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 재시작. 난수 재발생
				for (int i = 0; i < 3; i++) {
					com[i] = ran.nextInt(10);
					// 중복 처리
					for (int j = 0; j < i; j++) {
						if (com[i] == com[j])
							i--;
					}
				}
				
				bt1.setEnabled(true); // 확인버튼 재활성화.
				
//				TextArea, TextField 초기화.
				ta.setText("");		
				tx.setText("");
				cnt=0; //  cnt 초기화.
				o=0; // Out 초기화
				
				bt3.setEnabled(false); // 재시작버튼 비활성화.
				
			}
		});
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tx.setText("1조");
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bt3.setEnabled(false);
		
		setTitle("BaseBall");
		setBounds(100, 100, 250, 300);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Baseball();

//		난수 발생
		for (int i = 0; i < 3; i++) {
			com[i] = ran.nextInt(10);

//			중복 처리
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j])
					i--;
			}

		}
//	 	난수 확인
//		for (int i = 0; i < 3; i++) 
//			System.out.print(com[i] + "\t");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
//	0 ~ 9 버튼을 누르면 TextArea에 해당 번호가 입력. 비교를 위해 user[] 에 누른 순서대로 저장.
//	숫자 버튼을 누를 때마다 c 에 1 씩 적립.
//	한 번에 숫자 버튼을 3번 이상 못누르게 하기 위해서 c가 3보다 커지면 눌러도 무반응.   
		if (c < 3) {
			if(c==0) 	 		//	TextArea에 다음 숫자 버튼을 누르기 전까지 이전에 누른 숫자가 남아있다가 확인 후 다시 숫자 버튼을 누르면 
				ta.setText(""); //	TextArea가 지워진 후 새로운 숫자가 입력.
			
			if (str.equals("1")) {
				ta.append("1");
				user[c] = 1;
				c++;
			} else if (str.equals("2")) {
				ta.append("2");
				user[c] = 2;
				c++;
			} else if (str.equals("3")) {
				ta.append("3");
				user[c] = 3;
				c++;
			} else if (str.equals("4")) {
				ta.append("4");
				user[c] = 4;
				c++;
			} else if (str.equals("5")) {
				ta.append("5");
				user[c] = 5;
				c++;
			} else if (str.equals("6")) {
				ta.append("6");
				user[c] = 6;
				c++;
			} else if (str.equals("7")) {
				ta.append("7");
				user[c] = 7;
				c++;
			} else if (str.equals("8")) {
				ta.append("8");
				user[c] = 8;
				c++;
			} else if (str.equals("9")) {
				ta.append("9");
				user[c] = 9;
				c++;
			} else if (str.equals("0")) {
				ta.append("0");
				user[c] = 0;
				c++;
			}
		} // else   
		// jtx.setText("그만눌러"); // 3번이상 누르면 TextField 에 경고.
		
		if (str.equals("재입력")) { // 확인하려는 숫자를 오입력시 TextArea 비우기. Strike 와 Ball, Out 상황을 확인하기 위해서 TextField 는 유지. 
			ta.setText("");
			c=0;
		} else if (str.equals("확인")) {
			c = 0; // 확인을 누른 후 다시 숫자를 저장하기 위해서 초기화.
			cnt++; // 10번 이상 확인할 수 없게 만들기 위해서 카운트해줌.
			k = 0; // strike 와 ball 이 누적되지 않게 확인을 누를 때마다 초기화.
			b = 0;

			// 비교 각 자리의 com[]과 user[]가 같으면 k 에 1 씩 적립. 
			if (com[0] == user[0])
				k++;
			if (com[1] == user[1])
				k++;
			if (com[2] == user[2])
				k++;
			
			// 자리만 다르고 숫자가 같으면 b 에 1 씩 적립.
			if (com[0] == user[1] || com[0] == user[2])
				b++;
			if (com[1] == user[0] || com[1] == user[2])
				b++;
			if (com[2] == user[1] || com[2] == user[0])
				b++;
			
			// 숫자가 다 다르면 o 에 적립.
			if (com[0] != user[0] && com[0] != user[1] && com[0] != user[2]
					&& com[1] != user[0] && com[1] != user[1] && com[1] != user[2] 
					&& com[2] != user[0] && com[2] != user[1] && com[2] != user[2])
				o++;
			
			// com[]과 user[]가 숫자와 자리가 모두 일치하면 k 가 3 이 되어 게임 종료. 승리. 확인 버튼 비활성화.
			if (k == 3) {
				tx.setText("You Win!");
				bt1.setEnabled(false);
				bt3.setEnabled(true);
			}
			// k 가 3 이 되지 않는 경우에는 Out 과 Strike, ball 을 TextField 에 전달.
			else
				tx.setText(o + " Out " + k + " Strike " + b + " ball");
			
			// 확인을 10번이상 하거나 Out이 3개 이상되면 게임 종료. 패배.
			if (cnt > 10 || o > 2){
				tx.setText("You Lose.");
				bt1.setEnabled(false);
				bt3.setEnabled(true);
			}
		}
	}
}
