package filepopup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filepopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		//avoid file upload popup
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\venka\\Downloads\\Selenium WebDriver.pdf");

	}

}
