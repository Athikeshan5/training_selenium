package Handle_dropdown_by_select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectedoptions {
//it will return ui order
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("select-multiple-native"));
        Select se1=new Select(e1);
        se1.selectByIndex(3);
        se1.selectByIndex(1);
        se1.selectByIndex(2);
        WebElement l=se1.getFirstSelectedOption();//it will return object from that we need to get text
        //it will return 2 because in ui it is selected and also in ui first from the selected
        System.out.println(l.getText());
        System.out.println(l.getAccessibleName());
	}

}
