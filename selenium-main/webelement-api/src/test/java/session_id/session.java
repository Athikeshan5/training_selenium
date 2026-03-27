package session_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class session {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
        
		WebElement cl=driver.findElement(By.cssSelector("[jsname='yZiJbe']"));
		cl.sendKeys("Automation");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		//now first is old session id 
		
		cl.sendKeys("Automation");
		//it shows exception because of session changed by refresh
	    //to handle use re compile
		//StaleElementReferenceException
		driver.findElement(By.cssSelector("[jsname='yZiJbe']")).sendKeys("automation");
		Thread.sleep(3000);
	}

}
