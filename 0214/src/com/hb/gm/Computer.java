package com.hb.gm;
class Computer extends Vol
{
    
	@Override
	public void volUp() {
		 vol++ ;
		 if(vol==6) vol = 5 ;	
	}

	@Override
	public void volDown() {
		  vol-- ;
			if(vol == -1) vol = 0;
	}
	
}
