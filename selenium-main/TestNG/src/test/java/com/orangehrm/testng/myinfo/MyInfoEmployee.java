package com.orangehrm.testng.myinfo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyInfoEmployee {
	WebDriver driver=null;
	@Test(priority = 1)
	public void launchbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 2,dependsOnMethods = "launchbrowser")
	public void login() {
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}
	@Test(priority = 3,dependsOnMethods = "login")
	public void addMyinfoEmployee() throws InterruptedException {
		//click Myinfo link
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		//Adding Info
		//firstname
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.name("firstName"));
	    firstname.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	    Thread.sleep(2000);
	    firstname.sendKeys("ram");
	    firstname.sendKeys(Keys.ENTER);
	    
	    //lastname
	    Thread.sleep(5000);
	    WebElement lastname=driver.findElement(By.name("lastName"));
	    lastname.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	    lastname.sendKeys("raj");
	    Thread.sleep(2000);
	    lastname.sendKeys(Keys.ENTER);	
	    
	    //employee id
	    Thread.sleep(5000);
	    WebElement empid=driver.findElement(By.xpath("//label[.='Employee Id']/../..//input[@class='oxd-input oxd-input--active']"));
	    empid.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	    empid.sendKeys("12345");
	    Thread.sleep(2000);
	    empid.sendKeys(Keys.ENTER);
	    
	    //save
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//p[.=' * Required']/..//button[text()=' Save ']")).click();
	}
	@Test(priority = 5,dependsOnMethods = "login")
	public void logout() {
		 WebElement logout=driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		    logout.click();
		    driver.findElement(By.partialLinkText("Logout")).click();
		
	}
	@Test(priority = 6,dependsOnMethods = "launchbrowser")
	public void login1() throws InterruptedException {
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		//click Myinfo link
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		
		//verify
		WebElement firstname=driver.findElement(By.name("firstName"));
		Thread.sleep(4000);
		if((firstname.getAttribute("_value")).contains("ram")) {
			System.out.println("firstname verified");
		}else {
			System.out.println("not verified");
		}
		WebElement lastname=driver.findElement(By.name("lastName"));
		if(lastname.getAttribute("_value").equals("raj")) {
			System.out.println("lastname verified");
		}else {
			System.out.println("not verified");
		}
		
		 WebElement empid=driver.findElement(By.xpath("//label[.='Employee Id']/../..//input[@class='oxd-input oxd-input--active']"));
		 if(empid.getAttribute("_value").equals("12345")) {
				System.out.println("empid verified");
			}else {
				System.out.println("not verified");
			}
	}
	
	
}
