package PageObjectModel.s4pflowchat;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DoctorList {
	public String doctorlist="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='1']";
	
	AndroidDriver<AndroidElement> driver1;
	public DoctorList(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(20);
			driver1=driver;
			clickdoctortfield();
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	
	
	
	public void clickdoctortfield() {
		System.out.println("doctor list checking");
		driver1.findElementByXPath(doctorlist).click();
		
		
		
	}
	}


