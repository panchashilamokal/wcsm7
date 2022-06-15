package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5{
//close only child browser
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
		String parenttitle=driver.getTitle();
		//System.out.println(parenthandle);
		 Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles)
		{
			String currenttitle = driver.switchTo().window(wh).getTitle();
			if(!parenttitle.equals(currenttitle))
			{
			driver.switchTo().window(wh).manage().window().maximize();
			}
			else
			{
				driver.switchTo().window(wh).close();
			}
		}
		

	}

}
