package com.hb.am;
class Computer 
{
	private int vol = 0 ;

	// setter
	public void setVol(int k){
        vol = k ;
	}
    // getter
    public int getVol(){
        return vol ;
	}
	// up (5 이상은 안 올라가)
    public void volUp(){
         vol++ ;
		 if(vol==6) vol = 5 ;
	}
	// down (0이하는 안 내려가)
    public void volDown(){
        vol-- ;
		if(vol == -1) vol = 0;
	}
}
