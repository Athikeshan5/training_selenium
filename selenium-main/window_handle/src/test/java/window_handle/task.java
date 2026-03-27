package window_handle;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");

			driver.findElement(By.xpath("//button[@type='submit']")).click();

			driver.findElement(By.xpath("//span[.='Admin']")).click();

			
			WebElement dropdown = driver.findElement(By.xpath("((//div[@class='oxd-select-text-input'])[1])"));
			dropdown.click();
			Thread.sleep(3000);	
			dropdown.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);	
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);	
			if(dropdown.getText().contains("Admin"))
				System.out.println("first select verfied");
			dropdown.click();
			dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
			dropdown.sendKeys(Keys.ENTER);
			if(dropdown.getText().contains("ESS"))
				System.out.println("Second select verfied");
			driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[@type='button']")).click();
			driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
			driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();
			driver.quit();
		}


	}


