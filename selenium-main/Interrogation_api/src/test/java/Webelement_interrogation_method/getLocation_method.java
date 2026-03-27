package Webelement_interrogation_method;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		
		WebElement d = driver.findElement(By.xpath("//div[text()='Auto Acc ']"));
		System.out.println(d.getLocation());//it return top left corner position x,y axis
		//Auto Acc position from top left corner
		Point p=d.getLocation();
		System.out.println(p.x);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.y);
		
	}

}
