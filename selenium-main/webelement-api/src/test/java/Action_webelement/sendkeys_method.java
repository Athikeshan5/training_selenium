package Action_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://Google.com");
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("[jsname='yZiJbe']")).sendKeys("automation");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("[jsname='yZiJbe']")).sendKeys("automation","selenium",Keys.ENTER);
    Thread.sleep(4000);
	}

}
