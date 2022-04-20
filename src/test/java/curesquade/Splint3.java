package curesquade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.ChatService;
import PageObjectModel.ChatTextmsg;
import PageObjectModel.DoctorDashboard;
import PageObjectModel.DoctorLogin;
import PageObjectModel.DoctorProfile;
import PageObjectModel.DoctorRegister;
import PageObjectModel.PatientDashboard;
import PageObjectModel.PatientHealthRecords;
import PageObjectModel.SkipFunctionality;
import PageObjectModel.AudioCall.CallingPatient;
import PageObjectModel.VideoCall.CallingVideocall;
import PageObjectModel.VideoCall.VideocallIcons;
import PageObjectModel.s4pflowchat.DoctorList;
import PageObjectModel.s4pflowchat.PatientChat;
import PageObjectModel.s4pflowchat.SearchDoctor;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Splint3 extends BaseClass {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void Sprintflow3()  throws InterruptedException, IOException{
			service=startServer();
			driver=capabilities("GeneralStoreApp");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SkipFunctionality skip = new SkipFunctionality(driver);
			
			DoctorLogin doclogin=new DoctorLogin(driver);
			doclogin.positiveclicklogin();
			doclogin.enterpassword();
			
			CallingVideocall startingvideocall=new CallingVideocall(driver);
			VideocallIcons testingicons=new VideocallIcons(driver);
		
		
	}
	
	public void Sprintflow4() throws InterruptedException, IOException {
		service=startServer();
		driver=capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SkipFunctionality skip = new SkipFunctionality(driver);
		
		DoctorLogin doclogin=new DoctorLogin(driver);
		doclogin.positiveclicklogin();
		doclogin.enterpassword();
		
		
		DoctorDashboard doctordashboard=new DoctorDashboard(driver);
		doctordashboard.CheckDashboard();
		PatientDashboard patientcard=new PatientDashboard(driver);
		PatientHealthRecords patientfiles=new PatientHealthRecords(driver);
		DoctorProfile doctorprofile=new DoctorProfile(driver);
		
		
		SkipFunctionality skipafterlogout = new SkipFunctionality(driver);
		DoctorLogin redoclogin=new DoctorLogin(driver);
		ChatService chatenry=new ChatService(driver);
		ChatTextmsg chatstart=new ChatTextmsg(driver);
		
		driver.startActivity(new Activity("com.ateliasoftware.soundheartpatient", "com.ateliasoftware.soundheartpatient.MainActivity"));
		DoctorList click=new DoctorList(driver);
		SearchDoctor searching=new SearchDoctor(driver);
		PatientChat start=new PatientChat(driver);
		Assert.assertEquals("JAHello","JAHello");
		
		driver.startActivity(new Activity("com.ateliasoftware.soundheartdoctor", "com.ateliasoftware.soundheartdoctor.MainActivity"));
		CallingPatient startaudiocall=new CallingPatient(driver);
		driver.startActivity(new Activity("com.ateliasoftware.soundheartdoctor", "com.ateliasoftware.soundheartdoctor.MainActivity"));
		CallingVideocall startingvideocall=new CallingVideocall(driver);
		VideocallIcons testingicons=new VideocallIcons(driver);
//		SkipFunctionality skipafterlogout = new SkipFunctionality(driver);
//		DoctorLogin redoclogin=new DoctorLogin(driver);
//		ChatService chatenry=new ChatService(driver);
//		ChatTextmsg chatstart=new ChatTextmsg(driver);
//				driver.startActivity(new Activity("com.ateliasoftware.soundheartpatient", "com.ateliasoftware.soundheartpatient.MainActivity"));		DoctorList click=new DoctorList(driver);
//		SearchDoctor searching=new SearchDoctor(driver);		
//		PatientChat start=new PatientChat(driver);
//		Assert.assertEquals("JAHello","JAHello");
		
//		driver.startActivity(new Activity("com.ateliasoftware.soundheartdoctor", "com.ateliasoftware.soundheartdoctor.MainActivity"));
//		CallingPatient startaudiocall=new CallingPatient(driver);
//		driver.startActivity(new Activity("com.ateliasoftware.soundheartdoctor", "com.ateliasoftware.soundheartdoctor.MainActivity"));
//		CallingVideocall startingvideocall=new CallingVideocall(driver);
//		VideocallIcons testingicons=new VideocallIcons(driver);
	}
	
}

