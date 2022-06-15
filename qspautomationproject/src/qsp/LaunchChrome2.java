package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{ 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	    Thread.sleep(10000);
	    driver.close();
		
	
		

	}

}
