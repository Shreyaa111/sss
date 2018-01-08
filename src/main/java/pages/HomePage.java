package pages;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers{
	
	public HomePage (){
		if(verifyTitle("Opentaps Open Source ERP + CRM")==false){			
			reportStep("This is not My Home Page", "Fail");
		}
		
	}
	public HomePage verifyUserName(String data){//(String dsts)
		verifyTextContainsByXpath("//h2[text()[contains(.,'Demo Sales Manager')]]", "Demo Sales Manager");//data
		return this;
	}
	public LoginPage clickLogout(){
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test);
		
	}
	public MyHomePage clickcrm(){
		clickByLink("CRM/SFA");
		return new MyHomePage();
		
	}
	

}
