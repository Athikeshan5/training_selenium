package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeClass;


public class BaseClass  {
	public WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
		
		//launching browser
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
  
}
