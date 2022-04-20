package PageObjectModel;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ProfileScreen {
	public String profile="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']";

	
public ProfileScreen(AndroidDriver<AndroidElement> driver) {
		
		try {
			TimeUnit.SECONDS.sleep(5);
			clickprofile(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
public void clickprofile(AndroidDriver<AndroidElement> driver) {
	driver.findElementByXPath(profile).click();
	
	
}

}
