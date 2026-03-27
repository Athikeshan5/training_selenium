package hiddendivisionpopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//label[.='DD/MM/YYYY *']/..//input[@type='text' and @autocomplete='off']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c69-9 ng-star-inserted' and .='11']")).click();

		
		
		driver.navigate().to("https://www.myntra.com/men-tshirts");
		driver.findElement(By.xpath("(//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/21934290/2023/5/3/bcde1e19-f997-4b38-935c-587d60644dde1683111956691-Park-Avenue-Men-Tshirts-6851683111956294-1.jpg']/following::span[.='wishlist'])[1]")).click();
	}

}
