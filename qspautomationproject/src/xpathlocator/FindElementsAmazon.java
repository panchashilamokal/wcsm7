package xpathlocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/offers-store?otracker=nmenu_offer-zone&fm=neo%2Fmerchandising&iid=M_93063b6e-aaaa-4431-b3b8-b0108b9a858a_1_372UD5BXDFYS_MC.G6ZC4RAJ9OHU&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Top%2BOffers_G6ZC4RAJ9OHU&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=G6ZC4RAJ9OHU");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		List<WebElement> sugg=driver.findElements(By.xpath("//a[@title='Mobiles']"));
        for(WebElement sugg1:sugg) 
        {
        	String txt=sugg1.getText();
        	System.out.println(txt);
        }
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='TVs & Appliances']")).click();
		
	}
}