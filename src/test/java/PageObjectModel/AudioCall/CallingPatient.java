package PageObjectModel.AudioCall;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CallingPatient {
	public String clickcallicon="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
	
	public CallingPatient(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			
			clickchatcard(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	
	
	
	public void clickchatcard(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickcallicon).click();
		try {
			TimeUnit.SECONDS.sleep(15);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		
		
	}
	
	
	
}
