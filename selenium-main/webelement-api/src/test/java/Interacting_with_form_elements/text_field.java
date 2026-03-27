package Interacting_with_form_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_field {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		e.sendKeys("athi");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).clear();
		Thread.sleep(3000);
		
		e.sendKeys("keshan");
		Thread.sleep(3000);

	}

}
