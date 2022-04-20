package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DoctorProfile {
	public String clickmenu="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String profile="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@content-desc='PROFILE']";
	public String profileasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@content-desc='PROFILE']";
	public String editprofile="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
	public String editprofilescreenasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String editpersonalinfo="//android.view.View[@index='0']/android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']";
	public String editpersonalinfoasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String workingaddress="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String back="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String logout="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@content-desc='LOGOUT']";
	
	
public DoctorProfile(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(5);
			clickmenu(driver);
			
		
	}
public void clickmenu(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	driver.findElementByXPath(clickmenu).click();
	
		TimeUnit.SECONDS.sleep(6);
		
		
	
	driver.findElementByXPath(profile).click();
	
		TimeUnit.SECONDS.sleep(6);
		String profileassetmsg=driver.findElementByXPath(profileasset).getAttribute("content-desc");
		String aone="PROFILE";
		
	    Assert.assertEquals(aone, profileassetmsg);
		System.out.println("switched to PROFILE screen");
	
	
	
	driver.findElementByXPath(editprofile).click();
	System.out.println("clicked edit PROFILE");
	
		TimeUnit.SECONDS.sleep(6);
		String editprofilescreenassetmsg=driver.findElementByXPath(editprofilescreenasset).getAttribute("content-desc");
		
	    Assert.assertEquals("PROFILE", editprofilescreenassetmsg);
		System.out.println("switched to doctor PROFILE screen menu page");
	
	
	
	
	driver.findElementByXPath(editpersonalinfo).click();
	System.out.println("clicked editpersonalinfo");
	
	
		TimeUnit.SECONDS.sleep(6);
		String editpersonalinfoassetmsg=driver.findElementByXPath(editpersonalinfoasset).getAttribute("content-desc");
		
	    Assert.assertEquals("PERSONAL INFORMATION", editpersonalinfoassetmsg);
		System.out.println("switched to doctor Personal information screen");
	
	
	
	
	/*driver.findElementByXPath(workingaddress).click();
	
	try {
		TimeUnit.SECONDS.sleep(8);
		
		
	}catch(Exception e) {
		System.out.println("Cause is :"+e.getCause());
		System.out.println("Message  is :"+e.getMessage());
		e.printStackTrace();
		
		
	}
	
	driver.findElementByXPath(workingaddress).sendKeys("Hyderabad");
	*/
	
	
	
	driver.findElementByXPath(back).click();
	
		TimeUnit.SECONDS.sleep(4);
		
		
	
	driver.findElementByXPath(back).click();
	
		TimeUnit.SECONDS.sleep(4);
		
		
	
	driver.findElementByXPath(back).click();
	
	
	
	
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	
	
	
	
	driver.findElementByXPath(logout).click();
	
	
	
}

}
