package selenium_wait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://google.com/");
		driver.findElement(By.partialLinkText("Gmail")).click();
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		child.remove(parent);
		for(String s:child) {
		driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("(//span[.='For work'])[1]")).click();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.cssSelector("[target='_blank']")).click();
		String p1=driver.getWindowHandle();
		Set<String> c1=driver.getWindowHandles();
		c1.remove(p1);
		for(String d:c1) {
			driver.switchTo().window(d);
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("athi@gmail.com");
		
		
		
		//test case
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String par=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/nopCommerce']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']")).click();
		Set<String> st=driver.getWindowHandles();
		String ch=null;
		for(String id:st) {
			driver.switchTo().window(id);
			String s=driver.getTitle();
			if(s.contains("YouTube")) {
				ch=id;
			}
			
		}
		driver.switchTo().window(ch);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("song",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='style-scope ytd-video-renderer']/*//div[@id='title-wrapper'])[3]")).click();
		for(String id:st) {
			driver.switchTo().window(id);
			String s=driver.getCurrentUrl();
			if(s.contains("https://demowebshop.tricentis.com/")) {
				driver.close();
			}else if(s.contains("https://x.com/nopCommerce")){
		     driver.close();
			}else if(s.contains("https://www.facebook.com/nopCommerce")){
			     driver.close();
				}
		}
		
	}
}
