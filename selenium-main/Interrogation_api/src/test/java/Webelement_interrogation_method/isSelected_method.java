package Webelement_interrogation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.xpath("//span[.='Wallet']/..//input[@name='Attended']"));
		Thread.sleep(3000);
		System.out.println("radio button is not selected"+" "+radio.isSelected());
		radio.click();
		Thread.sleep(3000);
		System.out.println("radio button is selected "+" "+radio.isSelected());
	}

}
