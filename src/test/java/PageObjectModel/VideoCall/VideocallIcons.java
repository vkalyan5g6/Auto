package PageObjectModel.VideoCall;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VideocallIcons {
public String clickvitals="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
public String clickvideooff="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='1']";
public String clickaudiooff="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']";	
	public VideocallIcons(AndroidDriver<AndroidElement> driver) {
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
		driver.findElementByXPath(clickvitals).click();
		try {
			TimeUnit.SECONDS.sleep(3);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickvitals).click();
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickvideooff).click();
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickvideooff).click();
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickaudiooff).click();
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(clickaudiooff).click();
		
		
		
	}

}
