package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SkipFunctionality {
	public String skipButtonXpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='1']";
	public String skipscreen1asset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
	public String skipscreen2asset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
	public String skipscreen3asset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='0']";
	
	public SkipFunctionality(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
			TimeUnit.SECONDS.sleep(3);
			
			
			SkipButtonTest(driver);
			//SkipButtonTest(driver);
			//SkipButtonTest(driver);
			
			
			
		
	}
	
	public void SkipButtonTest(AndroidDriver<AndroidElement> driver) {
		/*try {
			TimeUnit.SECONDS.sleep(10);
			String skipscreen1assetmsg=driver.findElementByXPath(skipscreen1asset).getAttribute("content-desc");
			
		    Assert.assertEquals("WELCOME TO\r\n"
		    		+ "SOUND HEART\r\n"
		    		+ "We help you keep your heart health in check by continuously monitoring your heart metrics\r\n"
		    		+ "  proactively.", skipscreen1assetmsg);
			System.out.println("skip screen 1 scenario passed");
		
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}*/
		System.out.println("skip screen 1");
		driver.findElementByXPath(skipButtonXpath).click();
		/*try {
			TimeUnit.SECONDS.sleep(6);
			String skipscreen2assetmsg=driver.findElementByXPath(skipscreen2asset).getAttribute("content-desc");
			
		    Assert.assertEquals("INTERACT WITH\r\n"
		    		+ "PATIENTS\r\n"
		    		+ "Schedule and manage your appointments.\r\n"
		    		+ " Monitor your patient's symptoms using history of present\r\n"
		    		+ " illness (HPI) with access to your health records.", skipscreen2assetmsg);
			System.out.println("skip screen 2 scenario passed");
		
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}*/
		System.out.println("skip screen 2");
		driver.findElementByXPath(skipButtonXpath).click();
		
		/*try {
			TimeUnit.SECONDS.sleep(6);
			String skipscreen3assetmsg=driver.findElementByXPath(skipscreen3asset).getAttribute("content-desc");
			
		    Assert.assertEquals("HELP YOUR PATIENTS\r\n"
		    		+ "REACH GOALS\r\n"
		    		+ "Alert your patients \r\n"
		    		+ "when the metrics are outside\r\n"
		    		+ " of the thresholds specified. \r\n"
		    		+ "\r\n"
		    		+ "Diagnose and triage illness \r\n"
		    		+ "and recommend  care.", skipscreen3assetmsg);
			System.out.println("skip screen 3 scenario passed");
		
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}*/
		
		System.out.println("skip screen 3");
		driver.findElementByXPath(skipButtonXpath).click();
		
	}

}


