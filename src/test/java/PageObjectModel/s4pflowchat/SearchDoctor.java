package PageObjectModel.s4pflowchat;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchDoctor {
	public String searchdoc="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String doccard="//android.view.View[@index='0']/android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']";
	
	public SearchDoctor(AndroidDriver<AndroidElement> driver) {
		try {
			TimeUnit.SECONDS.sleep(8);
			searchname(driver);
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
	}
	
	
	
	
	public void searchname(AndroidDriver<AndroidElement> driver) {
		System.out.println("search doctor");
		driver.findElementByXPath(searchdoc).click();
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		String[] charArray= {"     ","   jacom","jagad"};
        for(int i=0;i<charArray.length;i++)
        {
            try {
                TimeUnit.SECONDS.sleep(5);
                
                
            }
          catch(Exception e) {
                System.out.println("Cause is :"+e.getCause());
                System.out.println("Message  is :"+e.getMessage());
                e.printStackTrace();
                
                
          }
		driver.findElementByXPath(searchdoc).sendKeys(charArray[i]);
		driver.hideKeyboard();
        }
		
		try {
			TimeUnit.SECONDS.sleep(5);
			
			
		}catch(Exception e) {
			System.out.println("Cause is :"+e.getCause());
			System.out.println("Message  is :"+e.getMessage());
			e.printStackTrace();
			
			
		}
		driver.findElementByXPath(doccard).click();
		
		
		
		
		
		
	}

}
