package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PatientDashboard {
	public String searchpatient="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String viewpatientdetails="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']";
	public String patientdetailsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	
	
	
	
public PatientDashboard(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(5);
			clickpatientcard(driver);
			
		
	}



public void clickpatientcard(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	
	driver.findElementByXPath(searchpatient).click();
	driver.findElementByXPath(searchpatient).sendKeys("ne");
	
	driver.findElementByXPath(viewpatientdetails).click();
	
	String patientdetailsassetmsg=driver.findElementByXPath(patientdetailsasset).getAttribute("content-desc");
    Assert.assertEquals("PATIENT DETAILS", patientdetailsassetmsg);
	System.out.println("patientdashboard Scenarios passed");
	
	
	

}

}
