package seleniumgridDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class demo {
	
	
	//we are using selenium grid dependency but it will include selenium webdriver

	
	@Test
public void demolaunch() throws MalformedURLException {
	ChromeOptions co=new ChromeOptions();
	FirefoxOptions FO=new FirefoxOptions();
	
	//use launching driver for options
	//standalone architecture of selenium grid
	//single device server run hub as script node as execute script.
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.8:4444"),FO);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://google.com");
}
}
