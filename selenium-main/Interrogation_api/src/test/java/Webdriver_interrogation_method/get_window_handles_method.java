package Webdriver_interrogation_method;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handles_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
//		Thread.sleep(3000);
//		//fetching the window id of parent window
//		String parentid=driver.getWindowHandle();
//		System.out.println(parentid);
		
		
		
		//click on a tab to get child window popup another browser will open so different session id
//		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//h2[.='Watches']/..//button[.='view more']")).click();
//		Thread.sleep(1000);
//		Set<String> id=driver.getWindowHandles();
//		System.out.println(id);
//		id.remove(parentid);
//		System.out.println(id);
//		for(String i:id) {
//			System.out.println(i);
//		}
		
		//task
		//i am going from one tab to another tab but the session id is same because the parent tab only browser control
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[.='Facebook']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[.='Twitter']")).click();
				Thread.sleep(4000);
				Set<String> s3=driver.getWindowHandles();
				System.out.println(s3);
				LinkedHashSet<String> ids=(LinkedHashSet<String>) driver.getWindowHandles();
				System.out.println(ids);
				Iterator i=ids.iterator();
				int count=0;
				while(i.hasNext()) {
					String s=(String) i.next();
					count++;
					if(count==1) {
						System.out.println("demo"+" "+s);
					}else if(count==2) {
						System.out.println("facebook"+" "+s);
					}else {
						System.out.println("twitter"+" "+s);
					}
				}
		
		

	}

}
