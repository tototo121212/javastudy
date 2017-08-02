package item;

public class Explosion {
	final static int bomb_interval=3;
	//폭발위치
	public int x,y;
	public int index;//0~22
	        int interval = bomb_interval;
	        
	public Explosion() {}
	public Explosion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//이미지 index 증가
	public boolean move(){
		
		if(interval==bomb_interval)
		   index++;
		interval--;
		if(interval<0)interval = bomb_interval;
		
		
		return (index < 27);//유효범위에 있냐?
	}
	
	
	
	
}
