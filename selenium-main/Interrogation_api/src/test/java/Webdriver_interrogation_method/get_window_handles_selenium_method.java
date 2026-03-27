package Webdriver_interrogation_method;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handles_selenium_method {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(4000);
	    Set<String> s=driver.getWindowHandles();
	    
	    for(String d:s) {
	    	driver.switchTo().window(d);
	    	String f=driver.getTitle();
	    	Thread.sleep(4000);
	    	System.out.println("Id"+" "+d);
	    	System.out.println("Title"+" "+f);
	    	
	    }
	
	}
}
