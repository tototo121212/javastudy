
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
		bt1 = new JButton("Ȯ��");
		bt2 = new JButton("���Է�");
		bt3 = new JButton("�����");
		bt4 = new JButton("����");
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
				// �����. ���� ��߻�
				for (int i = 0; i < 3; i++) {
					com[i] = ran.nextInt(10);
					// �ߺ� ó��
					for (int j = 0; j < i; j++) {
						if (com[i] == com[j])
							i--;
					}
				}
				
				bt1.setEnabled(true); // Ȯ�ι�ư ��Ȱ��ȭ.
				
//				TextArea, TextField �ʱ�ȭ.
				ta.setText("");		
				tx.setText("");
				cnt=0; //  cnt �ʱ�ȭ.
				o=0; // Out �ʱ�ȭ
				
				bt3.setEnabled(false); // ����۹�ư ��Ȱ��ȭ.
				
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
				tx.setText("1��");
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

//		���� �߻�
		for (int i = 0; i < 3; i++) {
			com[i] = ran.nextInt(10);

//			�ߺ� ó��
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j])
					i--;
			}

		}
//	 	���� Ȯ��
//		for (int i = 0; i < 3; i++) 
//			System.out.print(com[i] + "\t");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
//	0 ~ 9 ��ư�� ������ TextArea�� �ش� ��ȣ�� �Է�. �񱳸� ���� user[] �� ���� ������� ����.
//	���� ��ư�� ���� ������ c �� 1 �� ����.
//	�� ���� ���� ��ư�� 3�� �̻� �������� �ϱ� ���ؼ� c�� 3���� Ŀ���� ������ ������.   
		if (c < 3) {
			if(c==0) 	 		//	TextArea�� ���� ���� ��ư�� ������ ������ ������ ���� ���ڰ� �����ִٰ� Ȯ�� �� �ٽ� ���� ��ư�� ������ 
				ta.setText(""); //	TextArea�� ������ �� ���ο� ���ڰ� �Է�.
			
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
		// jtx.setText("�׸�����"); // 3���̻� ������ TextField �� ���.
		
		if (str.equals("���Է�")) { // Ȯ���Ϸ��� ���ڸ� ���Է½� TextArea ����. Strike �� Ball, Out ��Ȳ�� Ȯ���ϱ� ���ؼ� TextField �� ����. 
			ta.setText("");
			c=0;
		} else if (str.equals("Ȯ��")) {
			c = 0; // Ȯ���� ���� �� �ٽ� ���ڸ� �����ϱ� ���ؼ� �ʱ�ȭ.
			cnt++; // 10�� �̻� Ȯ���� �� ���� ����� ���ؼ� ī��Ʈ����.
			k = 0; // strike �� ball �� �������� �ʰ� Ȯ���� ���� ������ �ʱ�ȭ.
			b = 0;

			// �� �� �ڸ��� com[]�� user[]�� ������ k �� 1 �� ����. 
			if (com[0] == user[0])
				k++;
			if (com[1] == user[1])
				k++;
			if (com[2] == user[2])
				k++;
			
			// �ڸ��� �ٸ��� ���ڰ� ������ b �� 1 �� ����.
			if (com[0] == user[1] || com[0] == user[2])
				b++;
			if (com[1] == user[0] || com[1] == user[2])
				b++;
			if (com[2] == user[1] || com[2] == user[0])
				b++;
			
			// ���ڰ� �� �ٸ��� o �� ����.
			if (com[0] != user[0] && com[0] != user[1] && com[0] != user[2]
					&& com[1] != user[0] && com[1] != user[1] && com[1] != user[2] 
					&& com[2] != user[0] && com[2] != user[1] && com[2] != user[2])
				o++;
			
			// com[]�� user[]�� ���ڿ� �ڸ��� ��� ��ġ�ϸ� k �� 3 �� �Ǿ� ���� ����. �¸�. Ȯ�� ��ư ��Ȱ��ȭ.
			if (k == 3) {
				tx.setText("You Win!");
				bt1.setEnabled(false);
				bt3.setEnabled(true);
			}
			// k �� 3 �� ���� �ʴ� ��쿡�� Out �� Strike, ball �� TextField �� ����.
			else
				tx.setText(o + " Out " + k + " Strike " + b + " ball");
			
			// Ȯ���� 10���̻� �ϰų� Out�� 3�� �̻�Ǹ� ���� ����. �й�.
			if (cnt > 10 || o > 2){
				tx.setText("You Lose.");
				bt1.setEnabled(false);
				bt3.setEnabled(true);
			}
		}
	}
}
