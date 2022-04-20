package PageObjectModel.s4pflowchat;

import java.util.concurrent.TimeUnit;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PatientChat {
	public String clickingchaticon="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.ImageView[@index='2']";
	public String msgfromdoctorflowchat;
	public String back="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	
	AndroidDriver<AndroidElement> driver1;
	public PatientChat(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(6);
			driver1=driver;
			clickchaticon();
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	
	
	
	public void clickchaticon() {
		System.out.println("checking message in patientflow");
		driver1.findElementByXPath(clickingchaticon).click();
		
		try {
			TimeUnit.SECONDS.sleep(8);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		
		
       String msgfromdoctor="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='10']";
		
		
		
		msgfromdoctorflowchat=driver1.findElementByXPath(msgfromdoctor).getAttribute("content-desc");
		String content = msgfromdoctorflowchat;
		content = content.replace("JA", "");
		//msgfromdoctorflowchat=content;
		msgfromdoctorflowchat=new String(content);
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		driver1.findElementByXPath(back).click();
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver1.findElementByXPath(back).click();
		
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver1.findElementByXPath(back).click();
		try {
			TimeUnit.SECONDS.sleep(18);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		
		
		//System.out.println(msgfromdoctorflowchat); 
		//Assert.assertEquals(chatstart.msgfromdoctorflow, msgfromdoctorflowchat);
		
		
		
		

}
}
