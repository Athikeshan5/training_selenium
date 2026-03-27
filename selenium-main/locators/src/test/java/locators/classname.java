package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class classname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(4000);
        
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(4000);
        
       
	}

}
