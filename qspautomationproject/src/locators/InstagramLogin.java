package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("pvmokal56@gmail.com");
		driver.findElement(By.name("password")).sendKeys("nature5693");
		driver.findElement(By.cssSelector("button[class*='  L3NKy   y3zKF ']")).click();	
		
		
		
		
		

	}

}
