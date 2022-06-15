package actionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentSeleniumDevRightActionClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	   driver.get("https://www.selenium.dev");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[.='Downloads']")).click();
	   WebElement target=driver.findElement(By.xpath("//h1[.='Downloads']"));
	      Actions act=new Actions(driver);
	      act.contextClick(target).perform();
	      Thread.sleep(3000);
	      Robot rb=new Robot();
	      for(int i=1; i<=10;i++)
	    	  
	      {
	     rb.keyPress(KeyEvent.VK_DOWN);
	      rb.keyRelease(KeyEvent.VK_DOWN);
	      Thread.sleep(3000);
	      }
	      rb.keyPress(KeyEvent.VK_ENTER);
	      rb.keyRelease(KeyEvent.VK_ENTER);
	      


	}

}
