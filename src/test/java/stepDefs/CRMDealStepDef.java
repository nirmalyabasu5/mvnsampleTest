package stepDefs;

import io.cucumber.java.en.When;

public class CRMDealStepDef {
	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("User create a new deal");
	}

	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("User view deal details");
	}
}
