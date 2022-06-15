package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questio1 {
//close all browser without using quit()
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
		String parenthandle=driver.getWindowHandle();
		//System.out.println(parenthandle);
		 Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles)
		{
			driver.switchTo().window(wh).close();
		}

	}

}
