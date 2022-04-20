package PageObjectModel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DoctorRegister {
	AndroidDriver<AndroidElement> driver1;
	public String RegisterButton="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='6']/android.widget.Button[@index='0']";
	public String fullName="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='2']";
	public String email="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='4']";
	public String phonenumber="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@index='6']";
	public String dateofbirth="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.view.View[@index='8']";
	public String editdateofbirth="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String enterdate="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String ok="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='3']";
	public String selectspeciality="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='10']";
	public String selectedspeciality="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@content-desc='General Physician']";
	public String enteryouradress="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@text='Enter your address']";
	public String enteryouradresstwo="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@text='Enter your address']";
	public String enteryourpassword="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@text='Enter your password']";
	public String confirmpassword="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.EditText[@text='Enter your confirm password']";
	public String finish="//android.view.View[@index='0']/android.widget.ScrollView[@index='1']/android.widget.Button[@index='10']";
	public String back="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public void scrollDown(AndroidDriver<AndroidElement> driver) {
		TouchAction  action =new TouchAction(driver);  
	    Dimension size  =driver.manage().window().getSize();
	    int width=size.width;
	    int height=size.height;             
	    int middleOfX=width/2;
	    int startYCoordinate= (int)(height*.7);
	    int endYCoordinate= (int)(height*.2);
	    action.press(PointOption.point(middleOfX, endYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
	}
	public void scrollUp(AndroidDriver<AndroidElement> driver) {
		TouchAction  action =new TouchAction(driver);  
	    Dimension size  =driver.manage().window().getSize();
	    int width=size.width;
	    int height=size.height;             
	    int middleOfX=width/2;
	    int startYCoordinate= (int)(height*.7);
	    int endYCoordinate= (int)(height*.2);
	    action.press(PointOption.point(middleOfX, startYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	}
	public DoctorRegister(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(5);
			driver1=driver;
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	public void clickRegisterbutton() {
		driver1.findElementByXPath(RegisterButton).click();
	}
	public void RegesterDoctor() {
		driver1.findElementByXPath(fullName).click();
		driver1.hideKeyboard();
		//driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADDRESS*\"));");
		try {
			TimeUnit.SECONDS.sleep(4);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		
		/*TouchAction  action =new TouchAction(driver1);  
	    Dimension size  =driver1.manage().window().getSize();
	    int width=size.width;
	    int height=size.height;             
	    int middleOfX=width/2;
	    int startYCoordinate= (int)(height*.7);
	    int endYCoordinate= (int)(height*.2);
	        
	            try {
	                TimeUnit.SECONDS.sleep(5);
	                
	                
	            }
	          catch(Exception e) {
	                System.out.println("Cause is :"+e.getCause());
	                System.out.println("Message  is :"+e.getMessage());
	                e.printStackTrace();
	                
	                
	            }
	            
	            
	            action.press(PointOption.point(middleOfX, endYCoordinate))
	            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	            .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
	                            
	            action.press(PointOption.point(middleOfX, endYCoordinate))
	            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	            .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
	            //driver1.findElementByXPath(fullName).click();
	            //driver1.findElementByXPath(fullName).sendKeys(charArray[i]);
	            //driver1.hideKeyboard();
	            
	            
	            
	                            
	            action.press(PointOption.point(middleOfX, startYCoordinate))
	            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	            
	            action.press(PointOption.point(middleOfX, startYCoordinate))
	            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
		
		driver1.findElementByXPath(finish).click();
		try {
            TimeUnit.SECONDS.sleep(8);
            
            
        }
      catch(Exception e) {
            System.out.println("Cause is :"+e.getCause());
            System.out.println("Message  is :"+e.getMessage());
            e.printStackTrace();
            
            
        }
		
		
		action.press(PointOption.point(middleOfX, endYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
		action.press(PointOption.point(middleOfX, endYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
		action.press(PointOption.point(middleOfX, endYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
		action.press(PointOption.point(middleOfX, endYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, startYCoordinate)).release().perform();
		
		/*TouchAction  action =new TouchAction(driver1);  
	    Dimension size  =driver1.manage().window().getSize();
	    int width=size.width;
	    int height=size.height;             
	    int middleOfX=width/2;
	    int startYCoordinate= (int)(height*.7);
	    int endYCoordinate= (int)(height*.2);
	    
	    action.press(PointOption.point(middleOfX, startYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	    
	    action.press(PointOption.point(middleOfX, startYCoordinate))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
        .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();*/
		
		driver1.findElementByXPath(fullName).sendKeys("Jagadeeswar");
		driver1.findElementByXPath(email).click();
		driver1.findElementByXPath(email).sendKeys("jagu@gmail.com");
		driver1.hideKeyboard();
		driver1.findElementByXPath(phonenumber).click();
		driver1.findElementByXPath(phonenumber).sendKeys("9908516281");
		driver1.hideKeyboard();
		driver1.findElementByXPath(dateofbirth).click();
		driver1.findElementByXPath(editdateofbirth).click();
		driver1.findElementByXPath(enterdate).click();
		driver1.findElementByXPath(enterdate).sendKeys("08/17/1999");
		driver1.findElementByXPath(ok).click();
		driver1.hideKeyboard();
		driver1.findElementByXPath(selectspeciality).click();
		try {
			TimeUnit.SECONDS.sleep(2);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver1.hideKeyboard();
		driver1.findElementByXPath(selectedspeciality).click();
		driver1.hideKeyboard();
		scrollUp(driver1);
		driver1.findElementByXPath(enteryouradress).click();
		driver1.hideKeyboard();
		driver1.findElementByXPath(enteryouradress).sendKeys("Tpgudem");
		driver1.hideKeyboard();
		driver1.findElementByXPath(enteryouradresstwo).click();
		driver1.findElementByXPath(enteryouradresstwo).sendKeys("west godavari");
		driver1.hideKeyboard();
		driver1.findElementByXPath(enteryourpassword).click();
		driver1.findElementByXPath(enteryourpassword).sendKeys("Bobby1999");
		driver1.hideKeyboard();
		driver1.findElementByXPath(confirmpassword).click();
		driver1.findElementByXPath(confirmpassword).sendKeys("Bobby1999");
		driver1.hideKeyboard();
		try {
			TimeUnit.SECONDS.sleep(1);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		scrollUp(driver1);
		driver1.findElementByXPath(finish).click();
		try {
			TimeUnit.SECONDS.sleep(10);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		//driver1.findElementByXPath(back).click();
		
		
		
		
		
		
		
		
	}

}
