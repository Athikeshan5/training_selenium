package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Thread.sleep(3000);
		

		driver.findElement(By.className("b3wTlE")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/flights-travel-uhp-at-store?marketplace=travel']")).click();
		Thread.sleep(3000);
		
		
		driver.get("https://youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("songs",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']")).click();
		Thread.sleep(3000);
		driver.get("https://github.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-haspopup='dialog']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("raja",Keys.ENTER);

	}

}
