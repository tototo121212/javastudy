package com.hb.am;
class Ex04 
{
	// this ; Ŭ���� �ȿ��� ��ü �ڱ� �ڽ��� ��Ī�ϴ� �����
	//         Ŭ������ ��ü�� ���� �� ������ �ּҰ��� �ǹ��Ѵ�.
	// ���������� ��������� �̸��� ������ ��������� this�� ���δ�.
  
	private String name = "�Ѹ�" ;
	private int age = 10 ;

	// �⺻������
	public Ex04(){  
		//this("�Ѻ�");
		System.out.println("�⺻ : " + this);	
	}
	public Ex04(String n){
		this();
        name = n ;
      System.out.println("�⺻ X : " + this);
	}
	public String getName(){ return name; }
    public void setName(String name){
	    this.name = name ;	
	}

}
