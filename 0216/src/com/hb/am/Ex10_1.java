package com.hb.am;

import javax.swing.table.AbstractTableModel;

public class Ex10_1 extends AbstractTableModel{

	  // 표에 들어갈 컬럼명
	  String[] name = {"아이디","이름","비밀번호","구분"};
	  
	  // 표에 들어갈 데이터는 2차원 배열
	  String[][] data = {
			  {"one","홍길동","12","옆집친구"},
			  {"two","이길동","15","친구"},
			  {"three","김길동","22","회사친구"},
			  {"four","고길동","10","웬수같은친구"},
	  };
	  
	  // 만약 배열에 자료형이 다르면 Object로 만들어라 
	  Object[][] data2 = {
			  {"one","홍길동",12,"옆집친구",true},
			  {"two","이길동",15,"친구",true},
			  {"three","김길동",new Integer(22),"회사친구",new Boolean(false)},
			  {"four","고길동",10,"웬수같은친구",false},
	  };
	  
	  
	 // 열의 갯수 
	@Override
	public int getColumnCount() {
		return name.length;
	}

	// 행의 갯수
	@Override
	public int getRowCount() {
		return data.length;
	}

	// 내용 채우기
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	// 컬럼명 적용 시키기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}
	
	// 셀 표편집 할 수 있도록 커서 넣기
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		 return (columnIndex != 0) ? true : false ;
		// return true ; // 전체 고치기 가능
	}
	
	// 셀 수정 가능하게 하기
	// ( 고칠내용,  행위치, 열위치) 받아서 고침
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// System.out.println(aValue);
		// System.out.println(rowIndex);
		// System.out.println(columnIndex);
		data[rowIndex][columnIndex] = (String)(aValue) ;
	}
	
	
}










