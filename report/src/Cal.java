
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Cal extends JFrame implements ActionListener {

	JPanel p1, p2;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bt1, bt2, bt3, bt4, bt5,
			bt6, bt7, bt8, bt9;
	JTextField tf;
	JTextArea ta;
	JScrollPane sp;
	int count = 0, count2 = 0;
	String str = "", op = null;
	double x = 0, y = 0;

	public Cal() {
		setTitle("Calculator");
		setBounds(300, 100, 250, 300);
		setVisible(true);

		p1 = new JPanel();
		p2 = new JPanel();

		p1.setLayout(new GridLayout(2, 1)); // TextField, TextArea Layout.
		p2.setLayout(new GridLayout(6, 3)); // Button Layout.

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
		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		bt5 = new JButton("=");
		bt6 = new JButton("C");
		bt7 = new JButton("��");
		bt8 = new JButton("Exit");
		bt9 = new JButton(".");
		
		tf = new JTextField(20);

		ta = new JTextArea(1, 2);
		sp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		ta.setLineWrap(true);

		p2.add(bt6);
		p2.add(bt7);
//		p2.add(bt8);
		p2.add(bt5);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b0);
		p2.add(bt9);
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(bt4);

		p1.add(tf, BorderLayout.NORTH);
		p1.add(sp, BorderLayout.CENTER);

		add(p1, BorderLayout.NORTH);
		add(p2);

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

		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str = str + ta.getText() + " + "; // ���ڿ� ������(����)�� str�� ����.
				count2 = 0; // �����ڸ� ���� �� ���ڸ� ���� �� TextArea�� �ʱ�ȭ�ǵ��� count2�� 0����
							// ��ȯ.

				if (count == 0) { // count�� 0�� ��, ��, ���� ���ڸ� ���� �� �����ڸ� ���� �� ����
									// ���ڸ� x�� ����.
					x = Double.parseDouble(ta.getText());
				} else {
					y = Double.parseDouble(ta.getText()); // ������ ���ڰ� �ƴ� ������ ���ڴ� y��
														// ����.
					switch (op) { // �������� ���� ������(op)�� ���� ����.
					case "+":
						x = x + y; // x�� ���� ���� x�� ���� ���� y�� ������ �����ؼ�, 2��° ������� ����
									// ���� ��(y)�� ����Ǿ��ִ� ��(x)������ ����.
						ta.setText(String.valueOf(x)); // ���� ����� TextArea�� �Է�.
						break;
					case "-":
						x = x - y;
						ta.setText(String.valueOf(x));
						break;
					case "*":
						x = x * y;
						ta.setText(String.valueOf(x));
						break;
					case "/":
						x = x / y;
						ta.setText(String.valueOf(x));
						break;
					case "=":	// "=" �� ������ ���� ��� ������ �ٽ� ������ ��, TextField�� ���ο� ������ �Է��ϱ� ���ؼ�  
								// str�� ��� �����ִ� TextArea�� ���� �ش� ������(+)�� ���� ����. 
						str = ta.getText()+" + ";
					}
				}
				tf.setText(str); // ����� ����(str)�� TextField�� �Է�.
				op = "+"; // ���� �����ڸ� op�� ����.
				count = 1; // count�� 1�� ����� ���� ������ ���ڰ� x�� ������� �ʰ� �ϵ��� ��.
			}
		});

		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str = str + ta.getText() + " - ";
				count2 = 0;

				if (count == 0)
					x = Double.parseDouble(ta.getText());
				else {
					y = Double.parseDouble(ta.getText());
					switch (op) {
					case "+":
						x = x + y;
						ta.setText(String.valueOf(x));
						break;
					case "-":
						x = x - y;
						ta.setText(String.valueOf(x));
						break;
					case "*":
						x = x * y;
						ta.setText(String.valueOf(x));
						break;
					case "/":
						x = x / y;
						ta.setText(String.valueOf(x));
						break;
					case "=":
						str = ta.getText()+" - ";
					}
				}
				tf.setText(str);
				op = "-";
				count = 1;
			}
		});

		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str = str + ta.getText() + " * ";
				tf.setText(str);
				count2 = 0;
				if (count == 0)
					x = Double.parseDouble(ta.getText());
				else {
					y = Double.parseDouble(ta.getText());
					switch (op) {
					case "+":
						x = x + y;
						ta.setText(String.valueOf(x));
						break;
					case "-":
						x = x - y;
						ta.setText(String.valueOf(x));
						break;
					case "*":
						x = x * y;
						ta.setText(String.valueOf(x));
						break;
					case "/":
						x = x / y;
						ta.setText(String.valueOf(x));
						break;
					case "=":
						str = ta.getText()+" * ";
					}
				}
				op = "*";
				count = 1;
			}
		});

		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str = str + ta.getText() + " / ";
				count2 = 0;
				if (count == 0)
					x = Double.parseDouble(ta.getText());
				else {
					y = Double.parseDouble(ta.getText());
					switch (op) {
					case "+":
						x = x + y;
						ta.setText(String.valueOf(x));
						break;
					case "-":
						x = x - y;
						ta.setText(String.valueOf(x));
						break;
					case "*":
						x = x * y;
						ta.setText(String.valueOf(x));
						break;
					case "/":
						x = x / y;
						ta.setText(String.valueOf(x));
						break;
					case "=":
						str = ta.getText()+" / ";
					}
				}
				tf.setText(str);
				op = "/";
				count = 1;
			}
		});

		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str = str + ta.getText() + " = ";
				
				y = Double.parseDouble(ta.getText());
				switch (op) {
				case "+":
					x = x + y;
					ta.setText(String.valueOf(x));
					break;
				case "-":
					x = x - y;
					ta.setText(String.valueOf(x));
					break;
				case "*":
					x = x * y;
					ta.setText(String.valueOf(x));
					break;
				case "/":
					x = x / y;
					ta.setText(String.valueOf(x));
					break;
				}
				tf.setText(str);
				op = "=";
				count2 = 0; // "=" �� ���� ��, ���ڸ� ������ �� TextArea�� �ʱ�ȭ �ǵ��� count2��
							// 0���� ��ȯ.
			}
		});

		// "Exit": ����.
		bt8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// "C": ���ο� ����� �ϱ� ���ؼ� �ʱ�ȭ.
		// �ʱ�ȭ ���: ���ο� x�� �Էµ� �� �ֵ��� count, ���� ���� y, TextArea�� TextField,
		// TextField�� �ԷµǴ� ����(str).
		bt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				y = 0;
				count = 0;
				str = "";
				tf.setText("");
				ta.setText("");
			}
		});

		// "��": ���� �Է� ��, ���Է½� ������ TextArea�� �ʱ�ȭ.
		bt7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
		bt9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(".");
			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Cal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String st = e.getActionCommand();
		if (count2 == 0) { // count2�� 0�̸�, ��, "="�� ���� �� �ٽ� ���ڸ� ���� �� TextArea��
			// �ʱ�ȭ �� �� ���ڰ� �Էµǵ��� TextArea�� �ʱ�ȭ.
			ta.setText("");
		}
		// TextArea�� ���� ����.
		if (st.equals("1")) {
			ta.append("1");
			count2 = 1; // �����ڸ� ������ ��, ���ڸ� ���� �� TextArea�� �ʱ�ȭ�Ǵ� ���� ���� ���ؼ�
			// count2�� 1�� ��ȯ.
		} else if (st.equals("2")) {
			ta.append("2");
			count2 = 1;
		} else if (st.equals("3")) {
			ta.append("3");
			count2 = 1;
		} else if (st.equals("4")) {
			ta.append("4");
			count2 = 1;
		} else if (st.equals("5")) {
			ta.append("5");
			count2 = 1;
		} else if (st.equals("6")) {
			ta.append("6");
			count2 = 1;
		} else if (st.equals("7")) {
			ta.append("7");
			count2 = 1;
		} else if (st.equals("8")) {
			ta.append("8");
			count2 = 1;
		} else if (st.equals("9")) {
			ta.append("9");
			count2 = 1;
		} else if (st.equals("0")) {
			ta.append("0");
			count2 = 1;
		}
	}
}
