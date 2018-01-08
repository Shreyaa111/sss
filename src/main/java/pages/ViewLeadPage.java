package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {
	
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
	this.driver  =driver;
	this.test  =test;
	if (verifyTitle("View Lead | opentaps CRM") == false) {
	reportStep("This is not View Leads Page", "Fail");
	}
	}

}
