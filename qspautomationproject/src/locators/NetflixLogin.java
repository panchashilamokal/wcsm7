package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nature5693");
		driver.findElement(By.cssSelector("button[class*='btn login-button btn-submit btn-small']")).click();	
		
		
		
		
		

	}

}
