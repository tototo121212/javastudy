package mymain;

//          Abstract Window Toolkit
import item.DDong;
import item.Explosion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyMain extends JFrame {
	//�������� ũ�⼳�����
	static final int GAMEPAN_W = 400;
	static final int GAMEPAN_H = 600;
	
	//Ű�̺�Ʈ ���
	static final int LEFT = KeyEvent.VK_LEFT;
	static final int RIGHT = KeyEvent.VK_RIGHT;
	
//�̹��� �ʱ�ȭ
	static Image img_ddong;
	static Image [] img_explosion;//�����̹���
	static
	{
		//Graphics���� ���� �̹����� �ε�...
		img_ddong 
		 =  new ImageIcon("image/ddong2.png").getImage();
		//�����̹��� �ʱ�ȭ
		img_explosion = new Image[27];
		for(int i=0;i<img_explosion.length;i++){
			/*String filename 
			= String.format("image/bomb/m%02d.png", (i+1));*/
			String filename 
			= String.format("image/explosion/exp_%d.png", (i+1));
			//System.out.println(filename);
			img_explosion[i] 
			 =  new ImageIcon(filename).getImage();
		}
	}
	
	
	//Ÿ�̸�
	Timer timer;
	
	final int DDONG_W =50;// ���߿� �������� ����
	//�� ��������
	final int DDONG_MAKE_INTERVAL = 20;//��������
	//������
	JPanel gamePanel;
	//��(���)
	Rectangle me_rect;
	//Ű����
	boolean bPressed = false; //Ű�� ���ȳ�?
	int key;				  //���� Ű��
	
	// �˰�ü ����Ʈ�� ������ ��ü
	List<DDong> ddongList = new ArrayList<DDong>();
	int ddong_make_interval= DDONG_MAKE_INTERVAL;//���������� ������ ����
	
	// ���� ����Ʈ�� ������ ��ü
	List<Explosion> explosionList 
					= new ArrayList<Explosion>();
	
	Random rand = new Random();
	
	public MyMain() {

		super("�����ϱ�"); //title
		
		//���ӿ� ���� ���� �ʱ�ȭ
		initGame();
		
		
		//�������� ����
		initGamePanel();
		
	
		//Ű�̺�Ʈ �ʱ�ȭ
		initKeyEvent();
	
		
		//���ӽ���
		startGame();
		
		
		
		
		
		
		//��� ��ġ?
		setLocation(200, 50); //����ȭ�����
		//ũ��� ��?
		//setSize(300, 300);
		setResizable(false);//ũ������ ���Ѵ�. //pack() �ؿ� ũ������ ���ϰ� �ϸ� ����� ������ �ȵ�
		pack();//�ڽ�������(gamePanel)�� ���Ѵ�.
		
		//������� �ȴ�.
		setVisible(true);

		//�����ڵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void startGame() {
		// TODO Auto-generated method stub
		//Ÿ�̸ӱ�����ü
		ActionListener timer_proc = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("-----call--------");
				//�ʿ��� �����۾�//���� �����̴�
				process();
				
				//ȭ���� �ٽñ׷���
				gamePanel.repaint(); // paintComponent() call
			}
		};	
		
		
		//Ÿ�̸� ����           �ð�(1/1000��)
		timer = new Timer(10	,         timer_proc);
		timer.start();
	}

	protected void process() {
		// TODO Auto-generated method stub
		//�˰�ü ����
		if(ddong_make_interval == DDONG_MAKE_INTERVAL)
			make_ddong();
		ddong_make_interval--;
		if(ddong_make_interval<0)
			ddong_make_interval = DDONG_MAKE_INTERVAL;
		
		//�˰�ü�� �̵��ϱ�
		move_ddong();
		
		//�浹üũ
		collision_me_ddong();
		
		//�˰��� Ȯ��
		setTitle("�˰��� : "+ddongList.size());
		
		
		if(bPressed)//Ű�� ����������...
			move_me();
		
		
	}

	private void collision_me_ddong() {
		// TODO Auto-generated method stub
		for(DDong ddong : ddongList){
			//�ΰ��� �簢��ǥ�� �����ֳ�??
			if(me_rect.intersects(ddong.pos)){
				//��������
				timer.stop();
				
				//�޽��� ���̾Ʒα�
				JOptionPane.showMessageDialog(this, "Game Over!!!");
			}
		}
		
	}

	private void move_ddong() {
		// TODO Auto-generated method stub
		for(DDong ddong : ddongList){
			ddong.move_down();
			//ȭ�� �Ʒ��� ����� ����
			if(ddong.pos.y > GAMEPAN_H){
	            //���߰�ü ����
				//������ġ ���
				int x = ddong.pos.x + DDONG_W/2 
						- img_explosion[0].getWidth(this)/2;
				
				int y = GAMEPAN_H -img_explosion[0].getHeight(this)+60;
				Explosion ex = new Explosion(x, y);
				//���߸���Ʈ ������ü
				explosionList.add(ex);
				
				
				ddongList.remove(ddong);
				return;
			}
		}
	}

	private void make_ddong() {
		// TODO Auto-generated method stub

		int y = -50;
		int x = rand.nextInt(GAMEPAN_W)-DDONG_W/2;
		int speed = rand.nextInt(3)+3; // 3~5;
		
		Rectangle pos = new Rectangle(x,y, DDONG_W, DDONG_W);
		//�˰�ü ����
		DDong ddong = new DDong(pos, speed);
		// �� ��ü ����Ʈ�� �߰�
		ddongList.add(ddong);
	}

	private void move_me() {
		// TODO Auto-generated method stub
		if(key==LEFT){
			me_rect.x-=10;
		}else if(key==RIGHT){
			me_rect.x+=10;
		}
	}

	private void initKeyEvent() {
		// TODO Auto-generated method stub
		//�͸� ���� Ŭ����
		KeyAdapter k_listener = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				key = e.getKeyCode();//����Ű��
				
				if(key=='S'){
					//������ �����ִ� ������
					ddongList.clear();
					timer.start();
				}
				
				
				bPressed = true;//��������
				/*if(key == KeyEvent.VK_LEFT){
					//me_rect.x-=10;
					//gamePanel�ٽ� �׷���..
					//gamePanel.repaint(); // paintComponent() Call
					
				}else if(key == KeyEvent.VK_RIGHT){
					//me_rect.x+=10;
					//gamePanel�ٽ� �׷���..
					//gamePanel.repaint();
				}*/
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				bPressed = false;
			}
			
		};
		
		//this(MyMain)�ּ� Ű�� ������ k_listener���� ó���� �����ϰڴ�.
		this.addKeyListener(k_listener);
		
	}

	private void initGame() {
		// TODO Auto-generated method stub
		// ����ġ �ʱ�ȭ
		me_rect = new Rectangle(GAMEPAN_W/2 -20, GAMEPAN_H-60, 40, 60);
	}

	private void initGamePanel() {
		// TODO Auto-generated method stub
		// ��ü������ ���ÿ� ������(paintComponent)
		gamePanel = new JPanel(){// �͸�Ŭ���� // ��ȭ��

			@Override
			protected void paintComponent(Graphics g) {
				// TODO : ���⿡ ����� ������ �׸���
				// Graphics : �׸��⵵��(��, ��)
				// ���� ȭ�� �����
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);
				
				//�˱׸���
				draw_ddong(g);
				
				//�����̹��� �׸���
				draw_explosion(g);
				
				//��(���)
				g.setColor(Color.blue);
				g.fillRect(me_rect.x, me_rect.y, me_rect.width, me_rect.height);
				
				
				
				
				//g.drawRect(0, 0, 400-1, 600-1);
				
			} 
			
		};
		//ũ�⼳��
		//��/���������� ��� �ڷ���
		Dimension dimension = new Dimension(GAMEPAN_W, GAMEPAN_H);
		
		//������ gamePanelũ�⸦ ����
		gamePanel.setPreferredSize(dimension);
		
		//JFrame�� gamePanel ����
		this.add(gamePanel);
		
	}

	
	protected void draw_explosion(Graphics g) {
		// TODO Auto-generated method stub

		for(Explosion ex : explosionList){
			g.drawImage(img_explosion[ex.index],ex.x,ex.y,this);
			if(ex.move()==false){
				//23���� �׸��� ������
				explosionList.remove(ex);
				return;
			}
		}
		
		/*g.drawImage(img_explosion[index],0,0,this);
		index++;
		if(index>22)index=0;*/
		
	}

	protected void draw_ddong(Graphics g) {
		// TODO Auto-generated method stub
		Color color = new Color(200, 200, 50);
		g.setColor(color);
		for(DDong ddong : ddongList){
			//�˱׸���
			g.drawImage(img_ddong, ddong.pos.x, ddong.pos.y, ddong.pos.width, ddong.pos.height,this);
			//���׸���
			//g.fillOval(ddong.pos.x, ddong.pos.y, ddong.pos.width, ddong.pos.height);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain();
	}

}

