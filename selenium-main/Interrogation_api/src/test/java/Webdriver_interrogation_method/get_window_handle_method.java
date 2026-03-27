package Webdriver_interrogation_method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handle_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		//every time it only get parent window id not the child window id
		//it return 32 unique character for session id
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());//it return parent session id
		
		driver.navigate().to("https://google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		System.out.println(driver1.getWindowHandle());
		driver1.quit();

		
		

	}

}
