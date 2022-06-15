package dataDrivenframework;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidCreds {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		Thread.sleep(2000);
		FileLibraryclass flib=new FileLibraryclass();
		int rc=flib.getrowCount("./Data/ActiTimeTestData.xlsx","invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String username = flib.readData("./Data/ActiTimeTestData.xlsx","validcreds", i, 0);
		String password = flib.readData("./Data/ActiTimeTestData.xlsx","validcreds", i, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();

		
		}

	}

}
