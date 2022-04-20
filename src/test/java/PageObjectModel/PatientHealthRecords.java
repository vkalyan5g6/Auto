package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PatientHealthRecords {
	AndroidDriver<AndroidElement> driver1;
	public String files="//android.view.View[@index='13']/android.widget.ImageView[@index='1']";
	public String filesasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']";
	public String forms="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='3']";
	public String formsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='7']";
	public String labreports="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='4']";
	public String labreportsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='7']";
	public String erx="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='5']";
	public String erxasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='7']";
	public String doctorreports="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.ImageView[@index='6']";
	public String doctorreportsasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='7']";
	public String fileupload="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='8']";
	public String fileuploadasset="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String selectfile="//android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='0']";
	public String selectimg="//android.widget.FrameLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.support.v7.widget.RecyclerView[@index='0']/android.widget.RelativeLayout[@index='0']";
	public String back="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String docscategory="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='3']";
	public String selectdoctorreports="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']";
	public String enternotes="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='4']";
	public String savefile="//android.view.View[@index='0']/android.view.View[@index='5']/android.widget.Button[@index='0']";
	public String searchdocument="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='1']";
	public String button="//android.view.View[@index='0']/android.widget.ImageView[@index='0']/android.widget.Button[@index='0']";
	public String deletefile="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='3']";
	public String sharefile="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='1']";
	public String sharecancel="//android.widget.LinearLayout[@index='0']/android.widget.Button[@index='0']";
	public String editfile="//android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String editfilename="//android.view.View[@index='1']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	public String saveeditfile="//android.view.View[@index='0']/android.view.View[@index='3']/android.widget.Button[@index='0']";
	
	
	
	
	
	public PatientHealthRecords(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
		
			TimeUnit.SECONDS.sleep(10);
			driver1=driver;
			
		
	}







public void clickfilesicon() throws InterruptedException {
	// TODO Auto-generated method stub
	TimeUnit.SECONDS.sleep(10);
	driver1.findElementByXPath(files).click();
	
		TimeUnit.SECONDS.sleep(6);
		String filesassetassetmsg=driver1.findElementByXPath(filesasset).getAttribute("content-desc");
	    Assert.assertEquals("FILES", filesassetassetmsg);
		System.out.println("switched to Healthrecords");
		
		
	
	
	driver1.findElementByXPath(forms).click();
	
		TimeUnit.SECONDS.sleep(6);
		String formsassetassetmsg=driver1.findElementByXPath(formsasset).getAttribute("content-desc");
	    Assert.assertEquals("FORMS", formsassetassetmsg);
		System.out.println("forms");
		
		
	
	driver1.findElementByXPath(labreports).click();
	
		TimeUnit.SECONDS.sleep(6);
		String labreportsassetmsg=driver1.findElementByXPath(labreportsasset).getAttribute("content-desc");
	    Assert.assertEquals("LABS REPORTS", labreportsassetmsg);
		System.out.println("LABS REPORTS");
		
		
	
	driver1.findElementByXPath(erx).click();
	
		TimeUnit.SECONDS.sleep(6);
		String erxassetmsg=driver1.findElementByXPath(erxasset).getAttribute("content-desc");
	    Assert.assertEquals("ERX", erxassetmsg);
		System.out.println("ERX");
		
		
	
	driver1.findElementByXPath(doctorreports).click();
	
		TimeUnit.SECONDS.sleep(6);
		String doctorreportsassetmsg=driver1.findElementByXPath(doctorreportsasset).getAttribute("content-desc");
	    Assert.assertEquals("DOCTOR REPORTS", doctorreportsassetmsg);
		System.out.println("DOCTOR REPORTS");
		
		
	
	driver1.findElementByXPath(fileupload).click();
	
		TimeUnit.SECONDS.sleep(6);
		String fileuploadassetmsg=driver1.findElementByXPath(fileuploadasset).getAttribute("content-desc");
	    Assert.assertEquals("UPLOAD FILE", fileuploadassetmsg);
		
		
		
	
	
	
	driver1.findElementByXPath(selectfile).click();
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	driver1.findElementByXPath(selectimg).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(docscategory).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(selectdoctorreports).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(enternotes).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	
	driver1.findElementByXPath(enternotes).sendKeys("Hii jagath these is your medicine report");
	
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	
	driver1.findElementByXPath(savefile).click();
	System.out.println("file upload sucees");
	
	
		TimeUnit.SECONDS.sleep(20);
		
		driver1.findElementByXPath(doctorreports).click();
	
	driver1.findElementByXPath(searchdocument).click();
	
	driver1.findElementByXPath(searchdocument).sendKeys("Scre");
	
	
	
	
		TimeUnit.SECONDS.sleep(7);
		
		
	
	driver1.findElementByXPath(button).click();
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	
	driver1.findElementByXPath(deletefile).click();
	
	driver1.findElementByXPath(searchdocument).click();
	
	driver1.findElementByXPath(searchdocument).sendKeys("Scre");
	
	
	
	
		TimeUnit.SECONDS.sleep(7);
		
		
	
	driver1.findElementByXPath(button).click();
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	driver1.findElementByXPath(sharefile).click();
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	driver1.findElementByXPath(sharecancel).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(button).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(editfile).click();
	
		TimeUnit.SECONDS.sleep(3);
		
		
	
	driver1.findElementByXPath(editfilename).click();
	
	driver1.findElementByXPath(editfilename).sendKeys("paracetemol");
	
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	driver1.findElementByXPath(saveeditfile).click();
	
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	driver1.findElementByXPath(back).click();
	
		TimeUnit.SECONDS.sleep(5);
		
		
	
	
}

}
