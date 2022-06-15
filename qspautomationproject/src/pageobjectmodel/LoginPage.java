package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepmeLoginCheckBox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(xpath="//a[.='License for using this software']") private WebElement licenceLink;
	
	
	
	
	//intialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getKeepmeLoginCheckBox() {
		return keepmeLoginCheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenceLink() {
		return licenceLink;
	}
	
//generic reusable method for ActiTimevalidLogin
	public void actiTimeValidLogin(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginbtn.click();
		usn.clear();
	}
	public void actiTimeinValidLogin(String invalidUsername,String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginbtn.click();
		usn.clear();
	}

	
}
