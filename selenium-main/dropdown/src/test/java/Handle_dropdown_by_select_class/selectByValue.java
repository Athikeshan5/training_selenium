package Handle_dropdown_by_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(4000);
        WebElement e=driver.findElement(By.xpath("//select[@id='Skills']"));
        Thread.sleep(3000);
        Select se=new Select(e);
        se.selectByValue("Art Design");
	}

}
