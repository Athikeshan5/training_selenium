package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_cssvalue_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[.='Fashion ']/..//img[@src='https://rukminim2.flixcart.com/fk-p-flap/196/196/image/5dca7713b355df43.jpg?q=90']"));
		System.out.println(e.getCssValue("font"));//if font not present in parent then it go to child and fetch the style if not default
		System.out.println(e.getCssValue("font-family"));
		System.out.println(e.getCssValue("color"));
		System.out.println(e.getCssValue("display"));
		System.out.println(e.getCssValue("background-color"));//no data use it print default value
		////*[local-name()='svg' and @data-name='Layer 1']  for svg we can't directly use the xpath
		
		driver.get("https://www.selenium.dev/");
		WebElement d=driver.findElement(By.xpath("//*[local-name()='svg' and @data-name='Layer 1']"));
		System.out.println(d.getCssValue("font"));
		System.out.println(d.getCssValue("font-family"));
		System.out.println(d.getCssValue("color"));
		System.out.println(d.getCssValue("background-color"));
		System.out.println(d.getCssValue("display"));
	}

}
