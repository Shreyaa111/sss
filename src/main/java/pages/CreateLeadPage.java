package pages;



import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {

	public CreateLeadPage() {
		if (verifyTitle("Opentaps Open Source ERP + CRM") == false) {
			reportStep("This is not  CreateLeadPage", "Fail");
		}

	}

	public CreateLeadPage enterCompanyName() {
		enterById("companyname", "moolya");
		return this;
	}

	public CreateLeadPage enterFirstName() {
		enterById("first name", "shrey");
		return this;
	}

	public CreateLeadPage enterLastName() {
		enterById("last name", "R");
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		clickByLink("Create Lead");
		return  new ViewLeadPage(driver,test);

	}

}
