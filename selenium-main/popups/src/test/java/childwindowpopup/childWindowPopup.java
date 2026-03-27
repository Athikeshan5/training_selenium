package childwindowpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		Set<String> both=driver.getWindowHandles();
		both.remove(parent);
		for(String h:both) {
			driver.switchTo().window(h);
		}
		WebElement add=driver.findElement(By.xpath("//button[.='Add to Cart']"));
		add.click();
		add.click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//article[@class='h-5 w-5 bg-red-500 rounded-full absolute top-0 right-0 z-[10] text-white flex justify-center items-center text-xs']"));
		if((e.getText()).equals("2")) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	    WebElement shop=driver.findElement(By.xpath("//*[name()='svg']"));
        shop.click();
        Thread.sleep(3000);
        WebElement shops=driver.findElement(By.tagName("h2"));
        if(shops.isDisplayed()) {
        	System.out.println("showing");
        }else {
        	System.out.println("not showing");
        }
        driver.close();
	}

}
