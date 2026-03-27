package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='landingCard appendBottom20 superOfferSection page-section sticky-scroll personalOffers']/child::div[@data-cy='superOffers']/child::div/child::div/child::div/child::div/child::div/child::div[@data-cy='suUrl-0']/child::div/child::div[@class='sliderFoot']/following::div/following::a[.='BOOK NOW']")).click();
           
	}

}
