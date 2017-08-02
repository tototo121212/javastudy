package com.hb.am;
class  Ex01
{
	private boolean live = true;
	private int age = 3 ;
	private String name = "큰뿔소";

	// get (정보전달) : 정보의 자료형을 반환형
    public String getName(){
         return name ;
	}
    public boolean getLive(){
         return live ;
	}
   public int getAge(){
        return age ;
   }

  // set (정보받아서 수정)  반환형이 없다. 
   public void setName(String a){
        name = a ;
   }
   public void setAge(int a){
         age = a ;
   }
   public void setLive(boolean a){
         live = a ;
   }

}
