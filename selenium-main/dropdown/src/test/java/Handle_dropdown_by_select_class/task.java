package Handle_dropdown_by_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("cars"));
        Select se1=new Select(e1);
        Boolean bool1=se1.isMultiple();
        if(bool1) {
        	System.out.println("multiselect");
        }else {
        	System.out.println("singleselect");
        }
        
        WebElement e2=driver.findElement(By.id("oldSelectMenu"));
        Select se2=new Select(e2);
        Boolean bool2=se2.isMultiple();
        if(bool2) {
        	System.out.println("multiselect");
        }else {
        	System.out.println("singleselect");
        }
        

	}

}
