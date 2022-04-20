package curesquade;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class BaseClass {
	
	public static AndroidDriver<AndroidElement> driver;
    //AndroidDriver<AndroidElement> driver;
    AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));;
    public  AppiumDriverLocalService service = AppiumDriverLocalService.buildService(serviceBuilder);
    //AndroidDriver<AndroidElement> driver;
     public AppiumDriverLocalService startServer()
        {
            //
    	 System.out.println("38");
        boolean flag=   checkIfServerIsRunnning(4723);
        if(!flag)
        {
        	 System.out.println("42");
            service.start();
        }
        System.out.println("45");
            return service;
         
		}

	 public static boolean checkIfServerIsRunnning(int port) {
			
			boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(port);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
			return isServerRunning;
		}
	
	 String device= System.getProperty("deviceName");
	public  AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException{
	
		
	DesiredCapabilities caps=new DesiredCapabilities();

	caps.setCapability("platformName", "ANDROID");
	caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "App");
	caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "2000");
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	caps.setCapability("testdroid_testTimeout", "2200");
	//caps.setCapability("noReset", "true");
	caps.setCapability("unicodeKeyboard", "true");                                     
	caps.setCapability("resetKeyboard", "true");
	caps.setCapability("autoGrantPermissions", "true");
	//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	caps.setCapability(MobileCapabilityType.APP, "/Users/kalyanveeravalli/Documents/atelia/app-qa-release (2).apk");
	URL url=new URL("http://127.0.0.1:4723/wd/hub");

	driver=new AndroidDriver<AndroidElement>(url ,caps);
	//driver=new AndroidDriver<AndroidElement>(url ,caps);
	driver.manage().logs().get("logcat");
	Thread.sleep(100);
	// driver.findElementByXPath("//android.widget.Button[@index='1']").click();
	return driver;
	
	


	}
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}
}
