package Handle_dropdown_by_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// multiple select
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("select-multiple-native"));
        Select se1=new Select(e1);
        se1.selectByIndex(3);
        se1.selectByIndex(1);
        se1.selectByIndex(2);
        System.out.println(se1.isMultiple());
        
        //single select
        driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
        Thread.sleep(3000);
        WebElement e2= driver.findElement(By.id("select3"));
        Select se2=new Select(e2);
        System.out.println(se2.isMultiple());
        driver.quit();
        
}
}
