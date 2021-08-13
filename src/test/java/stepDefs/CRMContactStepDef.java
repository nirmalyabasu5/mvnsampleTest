package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMContactStepDef {
	@Given("User logged in")
	public void user_logged_in() {
		System.out.println("User logged in");
	}

	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}

	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view contact details");
	}

	@When("User edit contact details")
	public void user_edit_contact_details() {
		System.out.println("User edit contact details");
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");	    
	}

	@When("User logout")
	public void user_logout() {
		System.out.println("User logout");
	}


}
