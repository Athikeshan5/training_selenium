package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class getDomAttribute_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
	    WebElement ref=	driver.findElement(By.xpath("//a[@style='align-items:stretch;box-sizing:border-box;display:flex;flex-basis:auto;flex-direction:row;flex-shrink:0;min-height:0;min-width:0;position:relative;z-index:0;border-width:0;border-radius:12px;background-color:#f0f0f0ff;height:44px']"));
		WebElement search=driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref));
        
        System.out.println(search.getDomAttribute("dataset"));//this method will only accept the static attribute
        //it retrun dom attribute default value
        search.sendKeys("tool");
        System.out.println(search.getDomProperty("dataset"));//it return default value for static attribute 
        //it return dom property
        
        //in flipkart they design the code to set current value also act as a default value
	}

}
