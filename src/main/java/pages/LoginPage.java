package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

//import bsh.This;
import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage (RemoteWebDriver driver, ExtentTest test){
		if(verifyTitle("Opentaps Open Source ERP + CRM")==false){			
			reportStep("This is not My Login Page", "Fail");
		}
		
	}
	public LoginPage enterUserName(String data){//(String data)
		enterById("username", "DemoSalesManager");// instead of demosales replace ut by data
		return this;
	}
	public LoginPage enterPassword(String data){
		enterById("password", "crmsfa");
		return this;
	}
	public LoginPage failedLogin(){
		clickByClassName("decorativeSubmit");
		return this;
	}
	
	public void verifyErrorMsg(String data){
		verifyTextContainsById("errorDiv",data);
	}
	
	public HomePage clickLogin(){
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}

}
