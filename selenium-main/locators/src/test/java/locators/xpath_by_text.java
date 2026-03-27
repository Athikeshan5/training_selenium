package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//section[.='X Path']")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
        Thread.sleep(4000);
        
        
        //task
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(4000);
        
        List<WebElement> l=driver.findElements(By.xpath("//input[@type='radio']"));
        for(WebElement k:l) {
        	k.click();
        	Thread.sleep(2000);
        }
        
	}

}
