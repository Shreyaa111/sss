package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_003CreateLead extends LeafTapsWrappers {
	@BeforeClass
	public void setData3() {
	testCaseName = "TC003_CreateLead";
	testDescription = "all mydetry fileds are entered successfully";
	authors = "DimpleSingh";
	category = "Sanity";
	dataSheetName = "TC003_CreateLead";
	browserName = "Chrome";
	}

	@Test(dataProvider = "fetchData")
	public void LoginAndLOgout(String uName, String pass,String Cname,String fname,String Lname) {

	new LoginPage(driver, test)
	.enterUserName(uName)
	.enterPassword(pass)
	.clickLogin()
	        .clickcrm()
	      .clickLeads() //.ClickOnLead()
	     .clickLeads() // .ClickOnCreateLead()
	       .enterCompanyName()//.enterByIdCname( Cname)
	.enterFirstName()//.enterByIdFname(fname)
    .enterLastName()    //.enterByIdLname(Lname)
	. clickCreateLead() ;//.clickOnCreateLead();


	}
	


}
