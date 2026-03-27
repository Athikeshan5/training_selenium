package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class to_string_url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//navigate to google
	driver.navigate().to("https://youtube.com");
	Thread.sleep(3000);
	
	//why i am using navigate means forward and backward action will perform by code in automate but get we can't automate
	driver.navigate().to("https://google.com/");//it internally calls get() , navigate application without
	//get(),pass fully qualified url as string argument
	Thread.sleep(3000);
	
	//navigate move from one webpage to another webpage
	driver.navigate().to("https://amazon.com/");
	Thread.sleep(3000);
	
	driver.quit();

}
}
