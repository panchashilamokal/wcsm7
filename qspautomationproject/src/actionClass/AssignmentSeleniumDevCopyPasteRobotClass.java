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
public class AssignmentSeleniumDevCopyPasteRobotClass {

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
	      act.doubleClick(target).perform();
	      Thread.sleep(3000);
	      Robot robot=new Robot();
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_C);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_C);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@type='search']")).click();
	      Thread.sleep(3000);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      Thread.sleep(3000);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);

	}

}


