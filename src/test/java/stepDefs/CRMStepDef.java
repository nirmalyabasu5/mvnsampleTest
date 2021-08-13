package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.junit.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CRMLoginPage;

public class CRMStepDef extends TestBase {
	CRMLoginPage lPage;	
	
	@Before
	public void setup() {
		initialize();
		lPage = new CRMLoginPage();
	}
	
	@Given("User is already on Login Page")
	public void user_is_already_on_login_page() {
		Assert.assertEquals(lPage.getPageTitle(), "Cogmento CRM");
	}
	
	@When("User enters credentials") 
	public void user_enters_and(DataTable loginCredentials) {
		List<Map<String, String>> logs = loginCredentials.asMaps();
		String user = logs.get(0).get("Username");
		String pwd = logs.get(0).get("Password"); 
		lPage.login(user, pwd); 
	}
	
	@Then("Should display home page")
	public void should_display_home_page() {
	    boolean name = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
	    Assert.assertTrue(name);
	}

	@Then("Close the browser")
	public void close_the_browser() {
		dismiss();
	}
}
