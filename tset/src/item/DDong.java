package item;

import java.awt.Rectangle;

public class DDong {
	//��ġ ũ��
	public Rectangle pos;
	//�ӵ�
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
		pos.y += speed; // �ϰ�
	}
	
	
}
