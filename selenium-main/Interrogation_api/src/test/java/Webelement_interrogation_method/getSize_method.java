package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//div[.='Fashion ']/..//img[@src='https://rukminim2.flixcart.com/fk-p-flap/196/196/image/5dca7713b355df43.jpg?q=90']"));
		Dimension d=e.getSize();
		System.out.println(d);
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		System.out.println(d.height);
		System.out.println(d.width);
		//chaining method ref and var
		System.out.println(e.getSize().getHeight());//getHeigth return type is point so we can't use dimension method and non static variable 
        
	}

}
