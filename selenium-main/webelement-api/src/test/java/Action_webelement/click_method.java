package Action_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		//click method we can also use for text, button etc
        driver.findElement(By.cssSelector("[aria-label='Gmail ']")).click();
        Thread.sleep(3000);
        driver.get("https://google.com");
         Thread.sleep(3000);
        driver.findElement(By.cssSelector("[id='SIvCob']")).click();
	}

}
