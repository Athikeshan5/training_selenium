package Interacting_with_form_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[id='submitbtn']")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.cssSelector("[id='submitbtn']")).clear();
//		Thread.sleep(3000);
		//InvalidElementStateException because not using proper method
		
		driver.findElement(By.cssSelector("[id='submitbtn']")).sendKeys("athi");
		Thread.sleep(3000); 
		//it will nothing perform no error,no eception
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		WebElement re=driver.findElement(By.name("password"));
		re.sendKeys("admin123");
		re.submit();
		Thread.sleep(3000);
		
		
	}

}
