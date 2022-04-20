package curesquade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.ChatService;
import PageObjectModel.ChatTextmsg;
import PageObjectModel.DoctorLogin;
import PageObjectModel.SkipFunctionality;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChartSevices  extends BaseClass {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void ChartSevices()  throws InterruptedException, IOException{
			service=startServer();
			driver=capabilities("GeneralStoreApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SkipFunctionality skip = new SkipFunctionality(driver);
			
			DoctorLogin doclogin=new DoctorLogin(driver);
			doclogin.positiveclicklogin();
			doclogin.enterpassword();
			
			ChatService chatenry=new ChatService(driver);
			ChatTextmsg chatstart=new ChatTextmsg(driver);
//					driver.startActivity(new Activity("com.ateliasoftware.patientsoundheart.qa", "com.ateliasoftware.patientsoundheart.MainActivity"));		
//					DoctorList click=new DoctorList(driver);
//			SearchDoctor searching=new SearchDoctor(driver);		
//			PatientChat start=new PatientChat(driver);
//			Assert.assertEquals("JAHello","JAHello");
		
		
	}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
}
