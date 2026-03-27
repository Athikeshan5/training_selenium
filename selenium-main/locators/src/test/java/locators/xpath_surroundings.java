package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_surroundings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(3000);
         //username
         driver.findElement(By.name("username")).sendKeys("Admin",Keys.ENTER);
         Thread.sleep(2000);
         
         //password
         driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
         Thread.sleep(9000);
         
         
         
         //navigate to recruitment
         driver.findElement(By.xpath("//span[.='Recruitment']")).click();
         Thread.sleep(5000);
         
         //click add button
         driver.findElement(By.xpath("//button[.=' Add ']")).click();
         Thread.sleep(7000);
         
         //enter firstname
         driver.findElement(By.name("firstName")).sendKeys("athikeshan");
         Thread.sleep(2000);
         
         //enter lastname
         driver.findElement(By.name("lastName")).sendKeys("V");
         Thread.sleep(2000);
         
         //enter email
         driver.findElement(By.xpath("//label[.='Email']/../..//input[@placeholder='Type here']")).sendKeys("athi@gmail.com");
         Thread.sleep(3000);
        
		driver.findElement(By.xpath("//label[.='Contact Number']/../..//input[@placeholder='Type here']")).sendKeys("9876543210");
		Thread.sleep(3000);
		
		//save
        driver.findElement(By.xpath("//button[.=' Save ']")).click();
        Thread.sleep(9000);
        
        
        
        //logout
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(4000);        
        
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(4000);
//        
//        driver.findElement(By.xpath("//a[.='Build your own computer']/../..//input[@value='Add to cart']")).click();
//        Thread.sleep(3000);
        
//        driver.get("https://demoapps.qspiders.com/ui/ecommerce?sublist=0&scenario=1");
//        Thread.sleep(3000);
//        
//        driver.findElement(By.xpath("//label[.='RedMi']/..//input[@type='checkbox']")).click();
//        Thread.sleep(3000);
//        
//        driver.findElement(By.xpath("//label[.='Samsung']/..//input[@type='checkbox']")).click();
//        Thread.sleep(3000);
	}

}
