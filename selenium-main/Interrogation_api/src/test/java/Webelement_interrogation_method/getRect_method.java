package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[@class='css-175oi2r']"));
		System.out.println(e.getRect());//org.openqa.selenium.Rectangle@e6332 it is object
		//Rect is an compination of location and size
		Rectangle r=e.getRect();
		System.out.println(r.getX());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getY());
		System.out.println(r.getClass());
		System.out.println(r.getDimension());
		System.out.println(r.getPoint());
		System.out.println(r.height);
		System.out.println(r.y);
		System.out.println(r.x);
		System.out.println(r.width);
	}

}
