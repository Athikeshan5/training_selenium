package alertpop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptpoppup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert e=driver.switchTo().alert();
		e.sendKeys("athi");
		Thread.sleep(3000);
		System.out.println(e.getText());
		driver.switchTo().alert().accept();

	}

}
