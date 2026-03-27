package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_tagname_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[@class='css-175oi2r']"));
		String s=e.getText();//i provide parent tag so it will take all the visible text from link tag
		String se1=e.getTagName();//it only take current tag not child or all
		 System.out.println(se1);
		
		
	}

}
