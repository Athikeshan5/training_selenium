package relative_locator;

import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative_locator_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      Options e=driver.manage();
      Window f=e.window();
      f.maximize();
      driver.get("https://demo.automationtesting.in/Register.html");
      Thread.sleep(2000);
      
      //another way to write relative locator
      WebElement ref=  driver.findElement(By.cssSelector("[placeholder='First Name']"));
      ref.sendKeys("keshan");
      Thread.sleep(3000);
      
      WebElement ref1=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.cssSelector("[placeholder='First Name']")));
	  ref1.sendKeys("v");
	  Thread.sleep(3000);
	  
	  WebElement ref2=driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(ref1));
	  ref2.sendKeys("erichi");
	  Thread.sleep(3000);
	  
	  WebElement ref3=driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref2));
	  ref3.sendKeys("athi@gmail.com");
	  Thread.sleep(3000);
	  
	  WebElement ref4=driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref3));
	  ref4.sendKeys("8608980857");
	  Thread.sleep(3000);
	  
	  //we cannot predict the near method working based on 50 px range it will work
	  WebElement ref5=driver.findElement(RelativeLocator.with(By.tagName("input")).near(ref4,100));
	  ref5.click();
	  Thread.sleep(3000);	 
	 
	
	}

}
