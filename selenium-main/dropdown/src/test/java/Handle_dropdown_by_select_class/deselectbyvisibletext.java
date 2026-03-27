package Handle_dropdown_by_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectbyvisibletext {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("select-multiple-native"));
        Select se1=new Select(e1);
        se1.selectByIndex(0);
        se1.selectByIndex(3);
        se1.selectByIndex(4);
        Thread.sleep(4000);
        se1.deselectByVisibleText("Fjallraven - Foldsac...");
	}
}
