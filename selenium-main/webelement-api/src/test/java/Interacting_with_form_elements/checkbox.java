package Interacting_with_form_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		//selected
		driver.findElement(By.cssSelector("[value='Cricket']")).click();
		Thread.sleep(2000);
		//unselected
		driver.findElement(By.cssSelector("[value='Cricket']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("[value='Cricket']")).clear();
		//exception will occur invalidelementstateexception
	}

}
