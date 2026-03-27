package Handle_dropdown_by_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByIndex {
//use in listbox , select dropdown if it is multi select otherwise exception
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(4000);
        WebElement e=driver.findElement(By.xpath("//select[@id='Skills']"));
        Select se=new Select(e);
        se.selectByIndex(3);
       // se.deselectByIndex(3);//it will show UnsupportedOperationException don't use in dropdown 
        driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("select-multiple-native"));
        Select se1=new Select(e1);
        se1.selectByIndex(0);
        Thread.sleep(4000);
        se1.deselectByIndex(0);
        
	}

}
