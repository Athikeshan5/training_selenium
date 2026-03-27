package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locating_tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
//       1
driver.get("https://google.com/");
       
       driver.findElement(By.id("APjFqb")).sendKeys("selenium");//it return webelement
       WebElement search= driver.findElement(By.id("APjFqb"));
       search.sendKeys("selenium",Keys.ENTER);
       Thread.sleep(4000);
//       
//       //2
//       driver.get("https://youtube.com");
//       Thread.sleep(4000);
//       WebElement se=driver.findElement(By.name("search_query"));
//       se.sendKeys("movies",Keys.ENTER);
//       Thread.sleep(3000);
//       List<WebElement> a=driver.findElements(By.id("video-title"));
//       if(a.size()>1) {
//    	   a.get(3).click();
//       }
//       Thread.sleep(3000);
//       driver.findElement(By.xpath("//button[contains(.,'Share')]")).click();
//       
//       
//       
       
       
     //2
 driver.get("https://youtube.com");
     Thread.sleep(4000);
     WebElement se=driver.findElement(By.id("guide-button"));
      se.click();
       //3
       driver.get("https://amazon.in");
       Thread.sleep(4000);
       WebElement se1 = driver.findElement(By.id("twotabsearchtextbox"));
       se1.sendKeys("laptop", Keys.ENTER);
       
       //4
       driver.get("https://ebay.com");
       Thread.sleep(4000);
       WebElement se2 = driver.findElement(By.id("gh-ac"));
       se2.sendKeys("shoes", Keys.ENTER);
       
       //5
       driver.get("https://w3schools.com");
       Thread.sleep(4000);
       WebElement se3 = driver.findElement(By.id("search2"));
       se3.sendKeys("java", Keys.ENTER);
       
       //6
              driver.get("https://demoapps.qspiders.com/ui?scenario=1");
              Thread.sleep(5000);
       driver.findElement(By.id("options")).click();
       
       //7
       driver.get("https://www.bing.com/");
       Thread.sleep(5000);
       driver.findElement(By.id("sb_form_q")).click();
       Thread.sleep(3000);
       
       //name
       
//       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//		//enter username and password
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
//		Thread.sleep(7000);

		
		//google 
		driver.get("https://google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("raja",Keys.ENTER);
	  
		
		//8
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("test");
		
		//9
		driver.get("https://duckduckgo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("searchbox_input")).sendKeys("Automation",Keys.ENTER);
		
		//10
		driver.get("https://accounts.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("identifierld")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		
	
	}

}
