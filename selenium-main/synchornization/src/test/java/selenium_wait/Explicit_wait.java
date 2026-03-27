package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/34");
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement checkbutton=driver.findElement(By.id("Check"));
		//waiting for check button to be enable before clicking
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkbutton));
		checkbutton.click();
		//implicit will check it is available or not 
		//but it will not check visible or not it check it present in dom and webpage
		//so we need to use explicit wait
		
		
		

	}

}
