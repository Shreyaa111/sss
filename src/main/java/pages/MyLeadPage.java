package pages;

import wrappers.LeafTapsWrappers;

public class MyLeadPage extends LeafTapsWrappers{

	public MyLeadPage() {
		
		if (verifyTitle("Opentaps Open Source ERP + CRM") == false) {
			reportStep("This is not MyLeadPage", "Fail");
		
		}

	}
	public MyLeadPage verifyLeadPage() {
		verifyTextContainsByXpath("//h2[text()[contains(.,'/crmsfa/control/createLeadForm')]]", "Create Lead");

		return this;

	}
	public CreateLeadPage  clickLeads() {
		clickByLink("Create Lead");
		return new  CreateLeadPage();

	}
}
