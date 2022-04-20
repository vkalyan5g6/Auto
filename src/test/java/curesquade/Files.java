package curesquade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.DoctorLogin;
import PageObjectModel.PatientDashboard;
import PageObjectModel.PatientHealthRecords;
import PageObjectModel.SkipFunctionality;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Files extends BaseClass {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void Files()  throws InterruptedException, IOException{
			service=startServer();
			driver=capabilities("GeneralStoreApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SkipFunctionality skip = new SkipFunctionality(driver);
			
			DoctorLogin doclogin=new DoctorLogin(driver);
			doclogin.positiveclicklogin();
			doclogin.enterpassword();
			
			
			PatientDashboard patientcard=new PatientDashboard(driver);
			PatientHealthRecords patientfiles=new PatientHealthRecords(driver);
			patientfiles.clickfilesicon();
			
		
		
	}
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
}
