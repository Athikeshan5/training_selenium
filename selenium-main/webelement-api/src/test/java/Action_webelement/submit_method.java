package Action_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		WebElement re=driver.findElement(By.name("password"));
		re.sendKeys("admin123");
		re.submit();
		Thread.sleep(3000);
		//submit method will use when we have form and type is submit the it perform enter button option
		
		
        
	}

}
