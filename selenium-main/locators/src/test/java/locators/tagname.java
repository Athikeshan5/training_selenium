package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(3000);
		
		List<WebElement> lists=driver.findElements(By.tagName("a"));
		for(WebElement d:lists) {
			String names=d.getText();
		   System.out.println(names); 	
		}
		for(WebElement d1:lists) {
			String names=d1.getText();
			if(names.equals("Store")) {
				d1.click();
				break;//it will remove exception why exception means the page clicked so it goes to another page in that it doesn't contain the link
			}
		}
		
	
		

	}

}
