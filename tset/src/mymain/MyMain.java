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
	//게임판의 크기설정상수
	static final int GAMEPAN_W = 400;
	static final int GAMEPAN_H = 600;
	
	//키이벤트 상수
	static final int LEFT = KeyEvent.VK_LEFT;
	static final int RIGHT = KeyEvent.VK_RIGHT;
	
//이미지 초기화
	static Image img_ddong;
	static Image [] img_explosion;//폭발이미지
	static
	{
		//Graphics에서 사용될 이미지를 로드...
		img_ddong 
		 =  new ImageIcon("image/ddong2.png").getImage();
		//폭발이미지 초기화
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
	
	
	//타이머
	Timer timer;
	
	final int DDONG_W =50;// 나중에 윗쪽으로 뺄것
	//똥 생성간격
	final int DDONG_MAKE_INTERVAL = 20;//생성간격
	//게임판
	JPanel gamePanel;
	//나(사람)
	Rectangle me_rect;
	//키관련
	boolean bPressed = false; //키가 눌렸냐?
	int key;				  //눌린 키값
	
	// 똥객체 리스트를 관리할 객체
	List<DDong> ddongList = new ArrayList<DDong>();
	int ddong_make_interval= DDONG_MAKE_INTERVAL;//생성간격을 관리할 변수
	
	// 폭발 리스트를 관리할 객체
	List<Explosion> explosionList 
					= new ArrayList<Explosion>();
	
	Random rand = new Random();
	
	public MyMain() {

		super("똥피하기"); //title
		
		//게임에 사용될 변수 초기화
		initGame();
		
		
		//게임판을 생성
		initGamePanel();
		
	
		//키이벤트 초기화
		initKeyEvent();
	
		
		//게임시작
		startGame();
		
		
		
		
		
		
		//어디에 배치?
		setLocation(200, 50); //바탕화면기준
		//크기는 얼마?
		//setSize(300, 300);
		setResizable(false);//크기조절 못한다. //pack() 밑에 크기조절 못하게 하면 제대로 적용이 안됨
		pack();//자식윈도우(gamePanel)를 감싼다.
		
		//보여줘야 된다.
		setVisible(true);

		//종료코드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void startGame() {
		// TODO Auto-generated method stub
		//타이머구동객체
		ActionListener timer_proc = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("-----call--------");
				//필요한 연산작업//똥이 움직이는
				process();
				
				//화면을 다시그려라
				gamePanel.repaint(); // paintComponent() call
			}
		};	
		
		
		//타이머 구동           시간(1/1000초)
		timer = new Timer(10	,         timer_proc);
		timer.start();
	}

	protected void process() {
		// TODO Auto-generated method stub
		//똥객체 생성
		if(ddong_make_interval == DDONG_MAKE_INTERVAL)
			make_ddong();
		ddong_make_interval--;
		if(ddong_make_interval<0)
			ddong_make_interval = DDONG_MAKE_INTERVAL;
		
		//똥객체를 이동하기
		move_ddong();
		
		//충돌체크
		collision_me_ddong();
		
		//똥갯수 확인
		setTitle("똥갯수 : "+ddongList.size());
		
		
		if(bPressed)//키나 눌려있으면...
			move_me();
		
		
	}

	private void collision_me_ddong() {
		// TODO Auto-generated method stub
		for(DDong ddong : ddongList){
			//두개의 사각좌표가 겹쳐있냐??
			if(me_rect.intersects(ddong.pos)){
				//게임종료
				timer.stop();
				
				//메시지 다이아로그
				JOptionPane.showMessageDialog(this, "Game Over!!!");
			}
		}
		
	}

	private void move_ddong() {
		// TODO Auto-generated method stub
		for(DDong ddong : ddongList){
			ddong.move_down();
			//화면 아래로 벗어나면 제거
			if(ddong.pos.y > GAMEPAN_H){
	            //폭발객체 생성
				//폭발위치 계산
				int x = ddong.pos.x + DDONG_W/2 
						- img_explosion[0].getWidth(this)/2;
				
				int y = GAMEPAN_H -img_explosion[0].getHeight(this)+60;
				Explosion ex = new Explosion(x, y);
				//폭발리스트 관리객체
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
		//똥객체 생성
		DDong ddong = new DDong(pos, speed);
		// 똥 객체 리스트에 추가
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
		//익명 내부 클래스
		KeyAdapter k_listener = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				key = e.getKeyCode();//눌린키값
				
				if(key=='S'){
					//이전에 남아있는 똥제거
					ddongList.clear();
					timer.start();
				}
				
				
				bPressed = true;//눌린정보
				/*if(key == KeyEvent.VK_LEFT){
					//me_rect.x-=10;
					//gamePanel다시 그려라..
					//gamePanel.repaint(); // paintComponent() Call
					
				}else if(key == KeyEvent.VK_RIGHT){
					//me_rect.x+=10;
					//gamePanel다시 그려라..
					//gamePanel.repaint();
				}*/
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				bPressed = false;
			}
			
		};
		
		//this(MyMain)애서 키가 눌리면 k_listener에게 처리를 위임하겠다.
		this.addKeyListener(k_listener);
		
	}

	private void initGame() {
		// TODO Auto-generated method stub
		// 내위치 초기화
		me_rect = new Rectangle(GAMEPAN_W/2 -20, GAMEPAN_H-60, 40, 60);
	}

	private void initGamePanel() {
		// TODO Auto-generated method stub
		// 객체생성과 동시에 재정의(paintComponent)
		gamePanel = new JPanel(){// 익명클래스 // 도화지

			@Override
			protected void paintComponent(Graphics g) {
				// TODO : 여기에 출력할 내용을 그린다
				// Graphics : 그리기도구(펜, 붓)
				// 이전 화면 지우기
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);
				
				//똥그리기
				draw_ddong(g);
				
				//폭발이미지 그리기
				draw_explosion(g);
				
				//나(사람)
				g.setColor(Color.blue);
				g.fillRect(me_rect.x, me_rect.y, me_rect.width, me_rect.height);
				
				
				
				
				//g.drawRect(0, 0, 400-1, 600-1);
				
			} 
			
		};
		//크기설정
		//폭/높이정보를 담는 자료형
		Dimension dimension = new Dimension(GAMEPAN_W, GAMEPAN_H);
		
		//사전에 gamePanel크기를 설정
		gamePanel.setPreferredSize(dimension);
		
		//JFrame에 gamePanel 적재
		this.add(gamePanel);
		
	}

	
	protected void draw_explosion(Graphics g) {
		// TODO Auto-generated method stub

		for(Explosion ex : explosionList){
			g.drawImage(img_explosion[ex.index],ex.x,ex.y,this);
			if(ex.move()==false){
				//23장의 그림을 모두출력
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
			//똥그리기
			g.drawImage(img_ddong, ddong.pos.x, ddong.pos.y, ddong.pos.width, ddong.pos.height,this);
			//원그리기
			//g.fillOval(ddong.pos.x, ddong.pos.y, ddong.pos.width, ddong.pos.height);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain();
	}

}

