package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementActitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://190.210.184.180/login.do");
		WebElement txt=driver.findElement(By.name("username"));
		txt.sendKeys("admin");
	    WebElement txt1=driver.findElement(By.name("pwd"));
	    txt1.sendKeys("manager");
	    System.out.println(txt);
	    System.out.println(txt1);
		

	}

}
