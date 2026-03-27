package action_cass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class action_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		WebElement click = driver.findElement(By.xpath("//div[starts-with(@id,'_R_') and @role='combobox']"));

		//click  method
		Actions a=new Actions(driver);
		a.click(click).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();

		//click and hold after release
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement clandhold=driver.findElement(By.id("circle"));
		a.clickAndHold(clandhold).pause(2000).release().perform();
		
		//drag and drop
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement source=driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement target=driver.findElement(By.xpath("//section[@class='w-[50%] flex flex-col gap-4 shadow-md rounded-md']/child::div[1]"));
		a.dragAndDrop(source,target).perform();
		
		//hover
		driver.navigate().to("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		WebElement hover = driver.findElement(By.xpath("//li[@class='Women p-4 relative']"));
		a.moveToElement(hover).perform();
		
		//move the element 
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		WebElement drag=driver.findElement(By.xpath("(//div[.='Drag Me'])[5]"));
		System.out.println(drag.getRect().x);
		System.out.println(drag.getRect().y);
		a.clickAndHold(drag).moveByOffset(150, 200).pause(1000).perform();
		System.out.println(drag.getRect().x);
		System.out.println(drag.getRect().y);
		
		
	}

}
