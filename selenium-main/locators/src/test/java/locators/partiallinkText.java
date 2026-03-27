package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("Reg")).click();
		Thread.sleep(4000);
		
		//only link available then use this locator
		
		driver.findElement(By.name("FirstName")).sendKeys("Athikeshan");
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(5000);
		

	}

}
