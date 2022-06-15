package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		String parenthandle=driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles)
		{
			if(!parenthandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		driver.findElement(By.xpath("//div[@class='_2C41yO']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");

		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		





		

	}

}
