package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.com/");
       Thread.sleep(3000);
       
       driver.switchTo().newWindow(WindowType.TAB);//it will open in new tab
       driver.get("https://google.com/");
	}

}
