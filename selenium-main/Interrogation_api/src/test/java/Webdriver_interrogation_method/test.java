package Webdriver_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("Admin");
		Thread.sleep(3000);
		WebElement ref=driver.findElement(By.xpath("//input[starts-with(@name,'user')]"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref)).sendKeys("admin123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("html/body/div/div//button[@type='submit']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	    Thread.sleep(3000);
	    String parent=driver.getCurrentUrl();
	    WebElement e=driver.findElement(By.xpath("//a[.='Change Password']"));
	    e.click();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(6000);
	    String child=driver.getCurrentUrl();
	    if(parent.equals(child)) {
	    	System.out.println("verified");
	    }else {
	    	System.out.println("not verified");
	    }
	    driver.navigate().forward();
	    Thread.sleep(6000);
	    String ch=driver.getCurrentUrl();
	    if(child.equals(ch)) {
	    	System.out.println("verified");
	    }else {
	    	System.out.println("not verified");
	    }
	    driver.navigate().refresh();
	    Thread.sleep(6000);
	    String str=driver.getCurrentUrl();
	    if(str.equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/updatePassword")) {
	    	System.out.println("valid");
	    }else {
	    	System.out.println("not valid");
	    }
	    driver.quit();
	    
	}

}
