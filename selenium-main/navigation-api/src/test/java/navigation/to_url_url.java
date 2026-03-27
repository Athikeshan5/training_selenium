package navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_url_url {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://google.com");
       Thread.sleep(3000);
       
       //navigate to flipkart
	   URL a=new URL("https://flipkart.com/");//throws java malformedurlexception
	   //it is older method now it is depricated
	   driver.navigate().to(a);
	   Thread.sleep(3000);
	   
	   //navigate to uber
	   driver.navigate().to(new URL("https://Uber.com/"));
	   Thread.sleep(3000);
	   
	   
	
	}

}
