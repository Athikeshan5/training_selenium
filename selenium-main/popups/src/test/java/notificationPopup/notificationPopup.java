package notificationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationPopup {

	

	public static void main(String[] args) throws InterruptedException {
		//https://peter.sh/experiments/chromium-command-line-switches/   in this page we can refer the disable , incognito etc
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");//it will open in chrome and disable the notification
		//option.addArguments("--incognito");//it will never show notification use any one incognito or disablearguments
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Notification']")).click();
		
         
	}

}
