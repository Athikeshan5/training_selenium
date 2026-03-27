package Webdriver_interrogation_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getter_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         Thread.sleep(2000);
         
         //getTitle()
         String str=driver.getTitle();
         System.out.println(str);
         if(str.equals("Demo Web Shop")) {
        	 System.out.println("passed");
        	 
         }else {
        	 System.out.println("failed");
         }
         driver.quit();
         
	}

}
