package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Athikeshan");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("V");
		Thread.sleep(4000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shoes");//id will unique for that tagname
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);
		
		driver.get("https://youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("songs",Keys.ENTER);
		

	}

}
