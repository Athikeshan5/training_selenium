package window_handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://icehrmpro.gamonoid.com/login.php");
//        driver.findElement(By.tagName("button")).click();
//        WebElement w=driver.findElement(By.tagName("button"));
//        if(w.isDisplayed()) {
//        	System.out.println("error valid");
//        }else {
//        	System.out.println("error not showing");
//        }
//        driver.findElement(By.name("username")).sendKeys("admin");
//        driver.findElement(By.name("password")).sendKeys("adm");
//        driver.findElement(By.tagName("button")).click();
//        WebElement er=driver.findElement(By.cssSelector("[class='alert alert-danger']"));
//        String str= er.getText();
//        System.out.println(str);
//        if(str.contains("Login failed")) {
//        	System.out.println(str+" test pass");
//        }else {
//        	System.out.println("test fail");
//        }
//        driver.findElement(By.name("username")).sendKeys("admin");
//        driver.findElement(By.name("password")).sendKeys("admin");
//        driver.findElement(By.tagName("button")).click();
//        WebElement f=driver.findElement(By.xpath("//a[.='IceHrm Employee']"));
//        if(f.isDisplayed()) {
//        	System.out.println("dashboard display");
//        }else {
//        	System.out.println("not dispaly");
//        }
//        driver.findElement(By.xpath("//li[@ref='admin_Employees']//a[@href='#']")).click();
//        driver.findElement(By.xpath("(//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees'])[1]")).click();
//
//        driver.findElement(By.xpath("//a[.='Skills']")).click();
//	    driver.findElement(By.xpath("//span[.=' Add New']")).click();
//	    WebElement job=driver.findElement(By.xpath("//label[@for='employee']/child::div"));
//	    if(job.isDisplayed()) {
//	    	System.out.println("skills displayed");
//	    }else {
//	    	System.out.println("Skills not displayed");
//	    }
//	    driver.findElement(By.xpath("(//button[.='Cancel'])[3]")).click();
//	    driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
//	    driver.findElement(By.xpath("//a[.='Sign out']")).click();
//	    WebElement login=driver.findElement(By.xpath("//label[text()='Email or Username']"));
//        System.out.println(login.isDisplayed());
//        driver.quit();
	    
	    
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://icehrmpro.gamonoid.com/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.tagName("button")).click();
        WebElement f=driver.findElement(By.xpath("//a[.='IceHrm Employee']"));
        if(f.isDisplayed()) {
        	System.out.println("dashboard display");
        }else {
        	System.out.println("not dispaly");
        }
        driver.findElement(By.id("menu_admin_Employees")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement visible=driver.findElement(By.xpath("//li[@id='menu_admin_Employees']/descendant::a[contains(.,'Employees') and @style]"));
        wait.until(ExpectedConditions.elementToBeClickable(visible));
        visible.click();
        driver.findElement(By.xpath("//button[@type='button']/descendant::span[.='Filter Employees']")).click();
        driver.findElement(By.xpath("//label[@for='department']/../..//input")).click();
        
//        ch.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
//        driver.findElement(By.xpath("//button[.='Save']")).click();
//        WebElement c=driver.findElement(By.xpath("//span[.='Department = Development Center']"));
//        if(c.isDisplayed()) {
//        	System.out.println(" department valid");
//        }else {
//        	System.out.println(" department not valid");
//        }
//        driver.findElement(By.xpath("(//*[name()='svg'])[3]")).click();
//        WebElement job= driver.findElement(By.xpath("//input[@id='rc_select_7']"));
//        System.out.println(job.isDisplayed());
//        driver.findElement(By.xpath("//button[.='Save']")).click();
//        
//	    driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
//	    driver.findElement(By.xpath("//a[.='Sign out']")).click();
}

}
