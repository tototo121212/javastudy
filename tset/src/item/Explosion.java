package item;

public class Explosion {
	final static int bomb_interval=3;
	//������ġ
	public int x,y;
	public int index;//0~22
	        int interval = bomb_interval;
	        
	public Explosion() {}
	public Explosion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//�̹��� index ����
	public boolean move(){
		
		if(interval==bomb_interval)
		   index++;
		interval--;
		if(interval<0)interval = bomb_interval;
		
		
		return (index < 27);//��ȿ������ �ֳ�?
	}
	
	
	
	
}
