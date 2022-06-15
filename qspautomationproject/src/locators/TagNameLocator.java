package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.name("inputEmail")).sendKeys("User@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("User123");
		driver.findElement(By.id("submitLogin")).click();	
		
		
		
		
		

	}

}
