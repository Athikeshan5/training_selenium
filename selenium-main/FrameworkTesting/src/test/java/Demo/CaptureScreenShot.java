package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import POMObjectRepository.DashboardPage;
import POMObjectRepository.LoginPage;

public class CaptureScreenShot {
@Test(invocationCount = 2)
public void screenShot() throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverUtility w=new WebDriverUtility(driver);
    LoginPage lp=new LoginPage(driver);
    DashboardPage dsp=new DashboardPage(driver);
    FileUtility fu=new FileUtility();
	w.maximizeBrowser();
	w.waitForElementsToLoad(20L);
	 lp.url(fu.getPropertyKeyValue("url"));
     lp.enterCredational(
             fu.getPropertyKeyValue("username"),
             fu.getPropertyKeyValue("password"));
     lp.LoginButton();
     Thread.sleep(5000);
     String timeStamp=new SimpleDateFormat("yyyy-mm-dd").format(new Date());
     //screenshot for webpage
     TakesScreenshot ts=(TakesScreenshot)driver;//in webdriver we are not link with takescreenshot
     File temp = ts.getScreenshotAs(OutputType.FILE);//to store the screenshot it is temporary location to store the file
     File permanent=new File("./reports/dashboard_"+timeStamp+".png");
     FileHandler.copy(temp, permanent);
     
     //take screenshot for webelement 
     Thread.sleep(5000);
     WebElement recruitmentLink=dsp.getRecruitment();//here we don't need because already implements
     File temp1 = recruitmentLink.getScreenshotAs(OutputType.FILE);
     File permanent1=new File("./reports/Recruitment_"+timeStamp+".png");
     FileHandler.copy(temp1, permanent1);
     
	
}
}
