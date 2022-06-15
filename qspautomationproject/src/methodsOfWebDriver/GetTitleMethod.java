package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String titleOfLoginpage=driver.getTitle();
		System.out.println(titleOfLoginpage);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
	
		driver.close();
		
	

	}

}
