package Webdriver_interrogation_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        
        //getcurrnturl
        String str=driver.getCurrentUrl();
        System.out.println(str);
        if(str.equals("https://demowebshop.tricentis.com/")) {
        	System.out.println("passed");
        }else {
        	System.out.println("failed");
        }
        
        try {
        	if(str.equals("https://demowebshop.tricentis.co")) {
            	System.out.println("passed");
        	}
        	else {
        		throw new Exception(str);
        	}
        }catch (Exception e) {
        	System.out.println("failed");
        	System.out.println(e.getMessage());
        }

	}

}
