package Handle_dropdown_by_select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//used in multiselect dropdown or listbox 
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("select-multiple-native"));
        Select se1=new Select(e1);
        se1.selectByIndex(2);
        se1.selectByIndex(1);
        se1.selectByIndex(0);
        List<WebElement> l=se1.getAllSelectedOptions();
        for(WebElement e:l) {
        	System.out.println(e.getText());
        }
        
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
        WebElement e2=driver.findElement(By.id("cars"));
        Select se2=new Select(e2);
        se2.selectByIndex(2);
        se2.selectByIndex(1);
        se2.selectByIndex(0);
        WebElement w=se2.getFirstSelectedOption();
        System.out.println(w.getText());
        List<WebElement> l1=se2.getAllSelectedOptions();
        for(WebElement e3:l1) {
        	System.out.println(e3.getText());
        }
        
        
	}

}
