package xpathlocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("bike");
		List<WebElement> suggestion=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		//for each loop
		for(WebElement sgg:suggestion)
		{
			String textofsugg=sgg.getText();
			System.out.println(textofsugg);
		}
		//we can use for loop also
		/*for(int i=0;i<sggestion.size();i++)
		 * {
		 * WebElement sgg=suggestion.get()//it store index
		 * String txt=sgg.getText();
		 * SOp(txt);
		 * }
		 * 
		 */
	
	}
	

}
