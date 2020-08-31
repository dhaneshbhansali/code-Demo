package com.codeDemo.Pages;

import com.codeDemo.Library.AppLibrary;

public class Login {

	AppLibrary appLibrary;

	public Login(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public String googleLogin = "xpath://div[contains(text(),'Sign-in with Google')]";
	public String emailID = "id:identifierId";
	public String next = "id:identifierNext";
	public String password = "xpath://input[@type='password']";
	public String nextPassword = "id:passwordNext";

	public void login(String emailid, String pwd) throws Exception {
		appLibrary.enterText(emailID, emailid);
		appLibrary.findElement(next).click();
		appLibrary.enterText(password, pwd);
		appLibrary.findElement(nextPassword).click();
	}
}
