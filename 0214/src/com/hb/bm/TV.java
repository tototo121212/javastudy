package com.hb.bm;
class TV 
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
	// up (5 �̻��� �� �ö�)
    public void volUp(){
         vol++ ;
		 if(vol==6) vol = 5 ;
	}
	// down (0���ϴ� �� ������)
    public void volDown(){
        vol-- ;
		if(vol == -1) vol = 0;
	}
}
