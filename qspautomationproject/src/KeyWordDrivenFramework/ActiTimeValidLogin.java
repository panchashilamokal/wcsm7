package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt=new BaseTest();
		
		Flib flib=new Flib();
		String username = flib.readPropertyFile(PROP_PATH,"username");
		String password = flib.readPropertyFile(PROP_PATH,"password");
		bt.openBrowser();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	    bt.closeBrowser();
		

	}

}
