package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_BY_STARTSWIDTH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("toys");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[starts-with(.,'Sea')]")).click();
		Thread.sleep(3000);

	}

}
