package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DoctorLogin {
	AndroidDriver<AndroidElement> driver1;
	public String enterphonenumberoremail="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='2']";
	public String clickverify="//android.view.View[@index='4']/android.widget.Button[@index='0']";
	public String enterpassword="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String enterpassword1="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='3']";
	public String clickedverify="//android.view.View[@index='6']/android.widget.Button[@index='0']";
	public String assertionforemail="//android.widget.EditText[@index='2']/android.view.View[@index='0']";
	
	
	public DoctorLogin(AndroidDriver<AndroidElement> driver) {
		try {
			driver1=driver;
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	

	public void clicklogin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		negativeclicklogin();
		positiveclicklogin();
		enterpassword();
		
		
		
		//driver1.findElementByXPath(clickedverify).click();
		
		
		

		
	}
	public void negativeclicklogin() throws InterruptedException {
		System.out.println("Enterd negative senario");
		String[] charArray= {"  ","jacom","jaga@gmai"};
		for(int i=0;i<charArray.length;i++)
        {
			TimeUnit.SECONDS.sleep(2);
			driver1.findElementByXPath(enterphonenumberoremail).click();
            driver1.findElementByXPath(enterphonenumberoremail).sendKeys(charArray[i]);
            
            driver1.findElementByXPath(clickverify).click();
            
            String emailerrormsg=driver1.findElementByXPath(assertionforemail).getAttribute("content-desc");
            Assert.assertEquals("Enter a valid phone number or email", emailerrormsg);
        
            System.out.println("emailentry negative scenario passed");
        
        }
	}
	public void positiveclicklogin() throws InterruptedException {
		System.out.println("emailentry entered positive senario");
		driver1.findElementByXPath(enterphonenumberoremail).click(); 
		driver1.findElementByXPath(enterphonenumberoremail).sendKeys("jagu@gmail.com");
		
		TimeUnit.SECONDS.sleep(2);
		driver1.findElementByXPath(clickverify).click();
		TimeUnit.SECONDS.sleep(8);
	}
	
	public void enterpassword() throws InterruptedException {
		System.out.println("emailentry password screen positive senario");
		driver1.findElementByXPath(enterpassword).click();
		driver1.findElementByXPath(enterpassword).sendKeys("Bobby1999");
		
		driver1.findElementByXPath(clickedverify).click();
		System.out.println("passwordentry negative & positive scenario passed");
		System.out.println("DoctorLogin Sucess");
		
		TimeUnit.SECONDS.sleep(8);
	}
}
