package navigation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.navigate().to("https://google.com/");
       //we donot use thread because it will wait for load the page 
       
       driver.navigate().to("https://amazon.com/");
       driver.navigate().back();//navigate to previous page
      
       System.out.println(driver.getTitle());
       //because execution is faster so we use thread to see the execution but i used duration it will perform all browser
       
       driver.navigate().forward();//navigate to next page
       
       System.out.println(driver.getTitle());
       
       driver.navigate().refresh();//refresh current page
       
       System.out.println(driver.getTitle());
       
	}

}
