package com.mybatis.po;

import java.util.Date;

public class UserInfo {
	
	private int id;
	private String userName;
	private String password;
	private Date regDate;
	public UserInfo(){
		
	}
	
	public UserInfo(String userName, String password, Date regDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", password=" + password + ", regDate=" + regDate
				+ "]\n";
	}
	 
	
} 
