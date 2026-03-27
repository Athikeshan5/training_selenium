import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.get("https://demowebshop.tricentis.com/");
      WebElement wrote = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
      WebElement cl = driver.findElement(By.xpath("//input[@value='Search']"));
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("arguments[0].value='mobile',arguments[1].click()", wrote,cl);//if there is placeholder 
      //it will override if it is value then it will change to mobile
      
	}

}
