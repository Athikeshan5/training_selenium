package window_scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("song",Keys.ENTER);
		WebElement till = driver.findElement(By.xpath("(//div[@id='dismissible'])[23]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",till );
		
		driver.navigate().to("https://doodles.google/");
		WebElement till1 = driver.findElement(By.xpath("//div[.='When is your birthday?']"));
	    
		js.executeScript("arguments[0].scrollIntoView(true)",till1 );//place the element top for visble 
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",till1 );//place the element bottom for visible
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()",till1 );//by default it takes true
	}
}
