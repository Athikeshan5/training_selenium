package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_method {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shoppersstack.com/products_page/34");
			Thread.sleep(10000);
			
			WebElement button=driver.findElement(By.xpath("//button[@id='Check']"));
			
			System.out.println(button.isEnabled());//it works when it contains disabled attribute in button or link
			
	}

}
