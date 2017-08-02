package com.hb.gm;
class Radio extends Vol
{

	@Override
	public void volUp() {
		 vol = vol + 2;
		 if(vol >=11) vol = 10 ;	
	}

	@Override
	public void volDown() {
		vol = vol - 2;
		 if(vol <= 0 ) vol = 0 ;	
	}
	
}
