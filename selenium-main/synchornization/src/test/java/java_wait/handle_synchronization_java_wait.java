package java_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_synchronization_java_wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		//sleep(long ms)
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/?msockid=1b3db4a91dba6e8233fea25a1c426fe8");
		//sleep(long ms,int nanos)
		Thread.sleep(2000,3);
         driver.navigate().to("https://www.shoppersstack.com/");
         //it return duration object 
         Duration du=Duration.ofSeconds(5);//static method of duration class
         //sleep(Duration)
         Thread.sleep(du);

	}

}
