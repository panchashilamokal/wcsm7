package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenrio5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement target=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
        Actions act=new Actions(driver);
        act.moveToElement(target).perform();
        driver.findElement(By.xpath("//a[text()='Diamond'")).click();
		
        
        
	}
}


