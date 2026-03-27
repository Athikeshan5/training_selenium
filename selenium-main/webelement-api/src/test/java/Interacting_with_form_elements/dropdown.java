package Interacting_with_form_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		

		WebElement e=driver.findElement(By.id("Skills"));
		e.click();
		Thread.sleep(2000);
		e.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);//it go for 3 option
		Thread.sleep(2000);
		
		//it is select so we use select class and click both method and class will use
		driver.findElement(By.cssSelector("[value='Adobe InDesign']")).click();
		Thread.sleep(2000);
		

	}

}
