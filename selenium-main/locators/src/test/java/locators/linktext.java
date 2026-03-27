package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		
		driver.get("https://google.com");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Gmail")).click();
	}

}
