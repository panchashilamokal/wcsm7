package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		int rc=flib.getrowCount(EXCEL_PATH,"invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String username = flib.readData(EXCEL_PATH,"invalidcreds",i, 0);
		String password = flib.readData(EXCEL_PATH,"invalidcreds",i, 1);
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).clear();
		}
		
	    bt.closeBrowser();
		

	}

}
