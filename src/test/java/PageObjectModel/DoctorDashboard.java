package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DoctorDashboard {
	AndroidDriver<AndroidElement> driver1;
	public String patientmonitoring="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='1']";
	public String patientmonitoringasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String searchpatients="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String searchpatientsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String back="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String Appointments="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='2']";
	public String Appointmentsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String schedulecheck1="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='7']";
	public String schedulecheck2="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='6']";
	public String chats="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";
	public String chatsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String viewchat="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']";
	//public String erx="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='4']";
	//public String aiinsights="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='5']";
	//public String icumonitoring="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='6']";
	//public String searchpatient="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='7']";
	public String name = "//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']";
	
	
	public DoctorDashboard(AndroidDriver<AndroidElement> driver) throws InterruptedException 
	{
			TimeUnit.SECONDS.sleep(17);
			driver1=driver;
	}
	
		
		public void CheckDashboard() throws InterruptedException {
			// TODO Auto-generated method stub
			CheckDashboardpatientmonitoring();
			CheckDashboardAPPOINTMENTS();
			CheckDashboardcharts();
			System.out.println("CheckDashboardS completed");
		
		
		}
		public void CheckDashboardAPPOINTMENTS() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("CheckDashboardAPPOINTMENTS start");
			driver1.findElementByXPath(patientmonitoring).click();
			
			TimeUnit.SECONDS.sleep(6);    
	        String patienterrormsg=driver1.findElementByXPath(patientmonitoringasset).getAttribute("content-desc");
	        Assert.assertEquals("PATIENT MONITORING", patienterrormsg);
	        System.out.println("patientmonitoring button clicked");
			driver1.findElementByXPath(searchpatients).click();
			driver1.findElementByXPath(searchpatients).sendKeys("rajesh");
			
			driver1.findElementByXPath(searchpatients).click();
			driver1.findElementByXPath(searchpatients).sendKeys("neeraj");
			TimeUnit.SECONDS.sleep(6);  
			String names=driver1.findElementByXPath(name).getAttribute("content-desc");
			boolean True=names.contains("neeraj");
	        Assert.assertEquals(true, True);
			driver1.findElementByXPath(back).click();
			
			System.out.println("CheckDashboardAPPOINTMENTS completed");
		}
		public void CheckDashboardpatientmonitoring() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("CheckDashboardpatientmonitoring start");
			driver1.findElementByXPath(Appointments).click();
			
			TimeUnit.SECONDS.sleep(6);
			String Appointmentsasseterrormsg=driver1.findElementByXPath(Appointmentsasset).getAttribute("content-desc");
		    Assert.assertEquals("APPOINTMENTS", Appointmentsasseterrormsg);
		    System.out.println("APPOINTMENTS Scenarios passed");
				
			
			driver1.findElementByXPath(schedulecheck1).click();
			driver1.findElementByXPath(schedulecheck2).click();
			TimeUnit.SECONDS.sleep(6);
			driver1.findElementByXPath(back).click();
			System.out.println("CheckDashboardpatientmonitoring completed");
		}
		public void CheckDashboardcharts() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("CheckDashboardcharts start");
			driver1.findElementByXPath(chats).click();
			
			TimeUnit.SECONDS.sleep(6);
			String chatsasseterrormsg=driver1.findElementByXPath(chatsasset).getAttribute("content-desc");
		    
			System.out.println(chatsasseterrormsg);
			Assert.assertEquals("MY CHATS", chatsasseterrormsg);
			driver1.findElementByXPath(back).click();
			System.out.println("CheckDashboardcharts completed");
			
		}
}


