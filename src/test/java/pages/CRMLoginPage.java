package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CRMLoginPage extends TestBase {
	@FindBy(xpath="//input[@name='email']")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement btn;
	
	public CRMLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String strUser, String strPwd) {
		uname.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		btn.click();
	}
}
