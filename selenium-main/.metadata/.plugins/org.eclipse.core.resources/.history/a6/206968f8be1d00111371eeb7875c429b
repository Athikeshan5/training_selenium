package SeleniumTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class DemoBaseClass {
	 WebDriver driver=null;
@BeforeSuite
public void beforesuit() {
	Reporter.log("Executing BeforeSuit",true);
}
@BeforeTest
public void beforetest() {
	Reporter.log("Executing Beforetest",true);
	
}
@BeforeClass
public void beforeclass() {
	Reporter.log("Executing Beforeclass",true);
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver=new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
  //Login with valid credentials
  		driver.get("https://www.saucedemo.com/");
  		driver.findElement(By.id("user-name")).sendKeys("standard_user");
  		driver.findElement(By.id("password")).sendKeys("secret_sauce");
  		driver.findElement(By.id("login-button")).click();
  		//verification
  		WebElement swagLabsText=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
  		if(swagLabsText.getText().contains("Swag Labs")) {
  			Reporter.log("Login successfull",true);
  		}else {
  			Reporter.log("Login failed",true);
  		}
	
}
@BeforeMethod
public void beforeMethod() {
	Reporter.log("Executing Beformethod",true);
	
}
@AfterMethod
public void afterMethod() {
	Reporter.log("Executing Aftermethod",true);
	
}
@AfterClass
public void afterclass() {
	Reporter.log("Executing afterclass");
	
	//logout
	WebElement ref = driver.findElement(By.id("react-burger-menu-btn"));
	ref.click();
	ref.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

	
	
}
@AfterTest
public void afterTest() {
	Reporter.log("Executing Aftertest",true);
	
}
@AfterSuite
public void afterSuite() {
	Reporter.log("Executing AfterSuit",true);
	
}
}
