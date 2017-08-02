package com.hb.am;

import java.io.Serializable;

// °´Ã¼ Á÷·ÄÈ­
public class Ex03_VO implements Serializable{
	private String id, pwd, phone;
	public Ex03_VO() {}
	public Ex03_VO(String id, String pwd, String phone) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
