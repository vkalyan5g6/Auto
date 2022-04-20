package curesquade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.DoctorLogin;
import PageObjectModel.DoctorProfile;
import PageObjectModel.SkipFunctionality;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Profiles extends BaseClass {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void Profiles()  throws InterruptedException, IOException{
			service=startServer();
			driver=capabilities("GeneralStoreApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SkipFunctionality skip = new SkipFunctionality(driver);
			
			DoctorLogin doclogin=new DoctorLogin(driver);
			doclogin.positiveclicklogin();
			doclogin.enterpassword();
			
			DoctorProfile doctorprofile=new DoctorProfile(driver);
			
		
		
	}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}

}
