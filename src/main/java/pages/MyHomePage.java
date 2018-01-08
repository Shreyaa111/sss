package pages;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {

	public MyHomePage() {
		if (verifyTitle("Opentaps Open Source ERP + CRM") == false) {
			reportStep("This is not MyHomePage", "Fail");
		}

	}

	public MyHomePage verifyLeadPage() {
		verifyTextContainsByXpath("//h2[text()[contains(.,'/crmsfa/control/leadsMain')]]", "Leads");

		return this;

	}

	public MyLeadPage clickLeads() {
		clickByLink("Leads");
		return new MyLeadPage();

	}
}
