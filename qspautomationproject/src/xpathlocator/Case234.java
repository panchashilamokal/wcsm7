package xpathlocator;//incomplete

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case234 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//a[@role='button' and @id='u_0_2_h6']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name' and @id='u_f_b_Kh']")).sendKeys("aaa");
        driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg' )and @id='u_f_d_6M']")).sendKeys("bbbb");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2345676533");
        driver.quit();
	}

}

