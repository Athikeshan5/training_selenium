package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(5000);
         //username
         driver.findElement(By.name("username")).sendKeys("Admin",Keys.ENTER);
         Thread.sleep(2000);
         
         //password
         driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
         Thread.sleep(9000);
         
         //navigate to pim
         driver.findElement(By.xpath("//span[.='PIM']")).click();
         Thread.sleep(3000);
         
         
         //enter employee name
         driver.findElement(By.xpath("//label[.='Employee Name']/../..//input[@placeholder='Type for hints...']")).sendKeys("Adarsh");
         Thread.sleep(4000);
         
         driver.findElement(By.xpath("//label[.='Employee Name']/../..//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
         Thread.sleep(4000);
         
         driver.findElement(By.xpath("//label[.='Employee Name']/../..//input[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);
         Thread.sleep(4000);
         
       //enter search
         driver.findElement(By.xpath("//button[.=' Search ']")).click();
         Thread.sleep(9000);
         
         driver.findElement(By.xpath("//div[@class='data' or .='99N75 adarsh']")).click();
         Thread.sleep(3000);

	}

}
