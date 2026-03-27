package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_3_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3302243495724005242&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152812&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(5000);
		
		
		//xpath by attribute
		driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/hz/wishlist/ls?triggerElementID=createList&ref_=nav_ListFlyout_navFlyout_createList_lv_redirect']")).click();
         Thread.sleep(3000);
         
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']")).sendKeys("Athi@gmail.com");
        Thread.sleep(3000);
        
        //xpth by text
        driver.get("https://chromewebstore.google.com/?hl=en");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[.='Discover']")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//button[.='Extensions']")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//li[.='Developer Tools']")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//button[.='Themes']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//li[.='Colors']")).click();
        Thread.sleep(2000);
        
        
        //xpath by contains
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(.,'Books')]")).click();
        Thread.sleep(3000);
        
     
        driver.findElement(By.xpath("//a[contains(.,'Computing and Internet')]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[contains(@id,'addtocart_13_EnteredQuantity')]")).sendKeys("3");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(@href,'/producttag/8/awesome')]")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//option[contains(.,'Position')]")).click();
        
        
	}

}
