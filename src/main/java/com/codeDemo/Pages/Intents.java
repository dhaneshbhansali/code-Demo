package com.codeDemo.Pages;

import com.codeDemo.Library.AppLibrary;

public class Intents {

	AppLibrary appLibrary;

	public Intents(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public String projectDD = "xpath://span[contains(text(),'American-Express-Global-Business-Trave')]";
	public String selectProject = "xpath://span[contains(text(),'COD_Demo')]";

	
	public void selectProject(){
		appLibrary.findElement(projectDD).click();
		appLibrary.findElement(selectProject).click();
	}
}
