package PageObjectModel.VideoCall;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CallingVideocall {
	
public String clickvideocallicon="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='1']";
	
	public CallingVideocall(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			
			clickchatcard(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	
	
	
	public void clickchatcard(AndroidDriver<AndroidElement> driver) throws InterruptedException {
			TimeUnit.SECONDS.sleep(8);
			
			
		
		driver.findElementByXPath(clickvideocallicon).click();
		
			TimeUnit.SECONDS.sleep(15);
			
			
		
			
			
		}
		
		
		
	}


