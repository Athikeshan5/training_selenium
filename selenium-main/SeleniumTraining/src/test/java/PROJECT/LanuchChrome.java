package PROJECT;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;
public class LanuchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      //  ChromeDriver driver=new ChromeDriver();//lanuch chrome it contain all the parent class member because of inheritance
      //  WebDriver driver =new ChromeDriver();//it is optimized because it only contain the necessary method it only implement serchcontext method implement mininmal time
        ////upcasting
     //   WebDriver driver1=new EdgeDriver();
        
    //   WebDriver driver2=new FirefoxDriver();
        
       // WebDriver driver3 =new SafariDriver();//only for mac laptop
       
       String browser="chrome";
       WebDriver driver=null;//if we are not initailize null it will store previous value then garbage delete the value or conflict will perform 
       if(browser.contains("chrome")) {
    	   driver=new ChromeDriver();
       }else if(browser.contains("edge")) {
    	   driver=new EdgeDriver();
       }else if(browser.contains("firefox")) {
    	   driver=new FirefoxDriver();//if it is not installed in the local system it will download and open
       }
       
       
       //webdriver metods
       //driver.get("opensource-demo.orangehrmlive.com/");//invalidArgumentException
        //driver.get("https://www.youtube");//WebDriverException
       driver.get("https://www.amazon.in/");
       Thread.sleep(6000);
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       //System.out.println(driver.getPageSource());
       driver.close();
       Thread.sleep(2000);
       driver.quit();
       
       
	}

}
