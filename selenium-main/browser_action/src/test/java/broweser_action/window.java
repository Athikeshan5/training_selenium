package broweser_action;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//duration is class
		//instead of using thread in every browser use this line to wait the browser to load
		//return type is options<I>
		Options op=driver.manage();
		//return type is window<I>
		Window win=op.window();
		//return type void
		win.maximize();
		
		//instead this use method chaining 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//minimize reurn type void
		driver.manage().window().minimize();
		Thread.sleep(4000);
		
		//fullscreen return type void
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		
		//getsize return type is dimension
		System.out.println(driver.manage().window().getSize());//(int width,int height)
		Thread.sleep(4000);
		
		//setsize create object for dimension class and return type is void
		Dimension dim=new Dimension(1000,400);
		driver.manage().window().setSize(dim);
		Thread.sleep(4000);
		
		//getPosition return type is point class
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(4000);
		
		//setPositon return type is void and create object for point x,y offset of top left corner
		driver.manage().window().setPosition(new Point(-100,150));
		Thread.sleep(4000);
	}

}
