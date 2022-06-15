package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//decalarton
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(xpath="//div[.='Settings']") private WebElement settingsLink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTime;
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	
	
	
	
	//intialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	
	public WebElement getSettingsLink() {
		return settingsLink;
	}
	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}

	public WebElement getLogutLink() {
		return logoutLink;
		
	}
	///operational methods
	public void saveleaveTime()
	{
		saveLeaveTime.click();
	}
	
	public void logoutActiTime()
	{
		logoutLink.click();
	}

}
