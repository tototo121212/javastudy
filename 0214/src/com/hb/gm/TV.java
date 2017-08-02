package com.hb.gm;
class TV extends Vol
{

	@Override
	public void volUp() {
		 vol = vol + 3;
		 if(vol >=21) vol = 20 ;	
	}

	@Override
	public void volDown() {
		vol = vol - 3;
		 if(vol <= 0 ) vol = 0 ;
	}
	
}
