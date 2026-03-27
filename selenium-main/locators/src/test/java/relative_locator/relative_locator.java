package relative_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		
//		WebElement ref=driver.findElement(By.xpath("//input[@id='newsletter-email']"));
//		ref.sendKeys("athi@gmail.com");
//		Thread.sleep(3000);
//		
//		//below method because button below the text field so use below method
//		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref)).click();
//		Thread.sleep(3000);
//		
//		WebElement ref1=driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
//		ref1.sendKeys("computers");
//		Thread.sleep(3000);
//		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(ref1)).click();
//		Thread.sleep(3000);
//		WebElement ref2=driver.findElement(By.xpath("//input[@type='submit' and @class='button-1 search-box-button']"));
//		ref2.click();
//		Thread.sleep(3000);
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(ref2)).click();
//		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		WebElement ref3=driver.findElement(By.xpath("//input[@id='name']"));
		ref3.sendKeys("athikeshan");
		Thread.sleep(3000);
		
		WebElement ref4=driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref3));
		ref4.sendKeys("athi@gmail.com");
		Thread.sleep(4000);
		
		WebElement ref5=driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref4));
		ref5.sendKeys("athi@2006");
		Thread.sleep(4000);
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(ref5)).click();
		
		
		
	}

}
