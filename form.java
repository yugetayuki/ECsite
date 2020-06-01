package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable{
	private static final long serialVaersionUID = 1L;
	
	private String userName;
	private String password;
	
	public String getUsername()Åo
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword(String password) {
		this.password = password;
	}

}
