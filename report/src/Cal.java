
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
		bt7 = new JButton("←");
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
				str = str + ta.getText() + " + "; // 숫자와 연산자(수식)를 str에 저장.
				count2 = 0; // 연산자를 누른 후 숫자를 누를 때 TextArea가 초기화되도록 count2를 0으로
							// 변환.

				if (count == 0) { // count가 0일 때, 즉, 최초 숫자를 누른 후 연산자를 누를 때 최초
									// 숫자를 x에 저장.
					x = Double.parseDouble(ta.getText());
				} else {
					y = Double.parseDouble(ta.getText()); // 최초의 숫자가 아닌 이후의 숫자는 y에
														// 저장.
					switch (op) { // 마지막에 누른 연산자(op)에 따라 연산.
					case "+":
						x = x + y; // x에 최초 숫자 x와 이후 숫자 y의 연산을 저장해서, 2번째 연산부터 새로
									// 누른 수(y)와 저장되어있던 수(x)만으로 연산.
						ta.setText(String.valueOf(x)); // 연산 결과를 TextArea에 입력.
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
					case "=":	// "=" 을 눌러서 나온 결과 값으로 다시 연산할 때, TextField에 새로운 수식을 입력하기 위해서  
								// str에 결과 값이있는 TextArea의 값과 해당 연산자(+)를 새로 저장. 
						str = ta.getText()+" + ";
					}
				}
				tf.setText(str); // 저장된 수식(str)을 TextField에 입력.
				op = "+"; // 누른 연산자를 op에 저장.
				count = 1; // count를 1로 만들어 새로 누르는 숫자가 x에 저장되지 않게 하도록 함.
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
				count2 = 0; // "=" 을 누른 후, 숫자를 눌렀을 때 TextArea가 초기화 되도록 count2를
							// 0으로 변환.
			}
		});

		// "Exit": 종료.
		bt8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// "C": 새로운 계산을 하기 위해서 초기화.
		// 초기화 대상: 새로운 x가 입력될 수 있도록 count, 이후 숫자 y, TextArea와 TextField,
		// TextField에 입력되는 수식(str).
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

		// "←": 숫자 입력 중, 오입력시 누르면 TextArea를 초기화.
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
		if (count2 == 0) { // count2가 0이면, 즉, "="을 누른 후 다시 숫자를 누를 때 TextArea가
			// 초기화 된 후 숫자가 입력되도록 TextArea를 초기화.
			ta.setText("");
		}
		// TextArea에 숫자 기입.
		if (st.equals("1")) {
			ta.append("1");
			count2 = 1; // 연산자를 누르기 전, 숫자만 누를 때 TextArea가 초기화되는 것을 막기 위해서
			// count2를 1로 변환.
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
