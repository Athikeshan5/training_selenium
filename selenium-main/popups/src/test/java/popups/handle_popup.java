package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handle_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6900085429114897290&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299221&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[@data-index='3']//*/img")).click();
		Thread.sleep(5000);
		String id=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
        //System.out.println(s.remove(id));
        System.out.println(s);
		for(String w:s) {
			driver.switchTo().window(w);
			System.out.println(w);
		}
		System.out.println(driver.getCurrentUrl());
	    WebElement addTocart=driver.findElement(By.xpath("(//input[@formaction='/cart/add-to-cart/ref=dp_start-bbf_1_glance'])[2]"));
	    addTocart.click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
