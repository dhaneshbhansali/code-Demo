package com.codeDemo.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codeDemo.Library.AppLibrary;
import com.codeDemo.Library.TestBase;
import com.codeDemo.Pages.Intents;
import com.codeDemo.Pages.Login;

public class IntentsTest extends TestBase {

	Intents intent;
	Login login;

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("TestSampleMiniRegression");
		intent = new Intents(appLibrary);
		login = new Login(appLibrary);
	}

	@Test
	public void checkIntents() throws Exception {
//		appLibrary.getDriverInstance();
//		appLibrary.launchApp();
//
//		appLibrary.findElement(login.googleLogin).click();
//		appLibrary.switchToWindow(2);
//		login.login("service_staging@spinsci.com", "Staging1234");
//		appLibrary.switchToWindow(1);
//
//		intent.selectProject();

		String path = "E:\\Repository\\cod-Demo\\Result";
		appLibrary.cleanDirectory(path);
		appLibrary.createFile(path, "testResult");
		appLibrary.writeToFile("test123", path, "testResult");

	}

}
