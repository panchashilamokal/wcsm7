package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("denyBtn")).click();
		WebElement target=driver.findElement(By.xpath("//a[.='All Jewellery ']"));
        Actions act=new Actions(driver);
        act.moveToElement(target).perform();
        driver.findElement(By.xpath("//a[text()='Kadas']")).click();
        driver.findElement(By.xpath("//img[@alt='The Ranvee Kada for Him']")).click();
        driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7'")).click();
        
        
	}
}


