package PageObjectModel;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatService {
	public String chats="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";
	public String chatwithpatient="//android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']";

	
	
	public ChatService(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(10);
			clicklogout(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	public void clicklogout(AndroidDriver<AndroidElement> driver) {
		
		
		
		System.out.println("chat service");
		try {
			TimeUnit.SECONDS.sleep(3);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	
		driver.findElementByXPath(chats).click();
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(chatwithpatient).click();
	}
		
}
