package com.hb.gm;

public abstract class Vol {
	protected int vol = 0 ;

	// setter
	public void setVol(int k){
        vol = k ;
	}
    // getter
    public int getVol(){
        return vol ;
	}

    // up, down을 추상으로
    
    public abstract void volUp();
    
    public abstract void volDown();
}
