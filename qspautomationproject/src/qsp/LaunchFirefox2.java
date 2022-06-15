package qsp;


import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox2 {
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{ 
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	    Thread.sleep(10000);
	    driver.close();
		
	
		

	}

}
