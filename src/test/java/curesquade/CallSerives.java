package curesquade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.DoctorLogin;
import PageObjectModel.SkipFunctionality;
import PageObjectModel.VideoCall.CallingVideocall;
import PageObjectModel.VideoCall.VideocallIcons;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CallSerives extends BaseClass {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void CallSerives()  throws InterruptedException, IOException{
			service=startServer();
			driver=capabilities("GeneralStoreApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SkipFunctionality skip = new SkipFunctionality(driver);
			
			DoctorLogin doclogin=new DoctorLogin(driver);
			doclogin.positiveclicklogin();
			doclogin.enterpassword();
			
			CallingVideocall startingvideocall=new CallingVideocall(driver);
			VideocallIcons testingicons=new VideocallIcons(driver);
		
		
	}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
}
