package navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://google.com");
		//search automation in google
		driver.findElement(By.cssSelector("[jsname='yZiJbe']")).sendKeys("Automation");
		//navigate to amazon to verify
		driver.navigate().to("https://amazon.com/");
		//verify
		String atr=driver.getCurrentUrl();
		System.out.println(atr);
		if(atr.equals("https://www.amazon.com/")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		//search tools in amazon
		driver.findElement(By.cssSelector("[type=text]")).sendKeys("tools");
		driver.navigate().refresh();
		
		driver.navigate().back();
		String atr1=driver.getCurrentUrl();
		System.out.println(atr1);
		if(atr1.equals("https://www.google.com/")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		

	}

}
