package item;

import java.awt.Rectangle;

public class DDong {
	//위치 크기
	public Rectangle pos;
	//속도
	int speed;
	
	
	
	public DDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public DDong(Rectangle pos, int speed) {
		this.pos = pos;
		this.speed = speed;
	}



	public void move_down(){
		pos.y += speed; // 하강
	}
	
	
}
