package perform_action_disabled_element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disable_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/40");
		WebElement ref=driver.findElement(By.xpath("//button[.='Check']"));
		
		//perform disable element 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ref);
		
		driver.navigate().to("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
	    driver.findElement(By.xpath("//a[@data-type='java']")).click();
	    WebElement ref1 = driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
	    Thread.sleep(3000);//for seeing execution
		
		//locate the disabled button
		
		js.executeScript("arguments[0].click()",ref1);
	}

}
