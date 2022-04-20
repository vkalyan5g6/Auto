package PageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.util.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChatTextmsg {
	public String typemsg="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='3']";
	public String sendmsg="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='4']";
	public String msgfromdoctorflow;
	AndroidDriver<AndroidElement> driver1;
	public ChatTextmsg(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(8);
			driver1=driver;
			startchatwithpatient();
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	public void startchatwithpatient() throws InterruptedException {
		System.out.println("sent message from dflow to pflow");
		
		
		
			TimeUnit.SECONDS.sleep(3);
			
			
		
	
		driver1.findElementByXPath(typemsg).click();
		
			TimeUnit.SECONDS.sleep(5);
			
			
		
		driver1.findElementByXPath(typemsg).sendKeys("Hello");
		
			TimeUnit.SECONDS.sleep(5);
			System.out.println("sasasa");
			
			
		driver1.findElementByXPath(sendmsg).click();
		
			TimeUnit.SECONDS.sleep(8);
			
			
		
		String doctormsg="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='5']";
		String newline = System.lineSeparator();
		
		
		
		msgfromdoctorflow=driver1.findElementByXPath(doctormsg).getAttribute("content-desc");
		//msgfromdoctorflow=""+newline+msgfromdoctorflow;
		
	    msgfromdoctorflow=new String(msgfromdoctorflow);
		
		//System.out.println(msgfromdoctorflow);
		
		
		try {
			TimeUnit.SECONDS.sleep(15);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		
		
		
	}

}
