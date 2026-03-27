package Demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import GenericUtility.BaseClass;
import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import POMObjectRepository.LoginPage;

public class LoginReportTest {
@Test
public void login() throws IOException {
	//create a new test
	ExtentReports er=new ExtentReports();
	//before making the test creation create reporter
	ExtentSparkReporter esr=new ExtentSparkReporter("./reports/LoginReport.html");//enter the path for folder and create file name to store report so enter name to create the file
	er.attachReporter(esr);//the test will connect spark reporter
	ExtentTest ref = er.createTest("Login Test");
	
	  WebDriver driver=new ChromeDriver();
	  
	  
	  WebDriverUtility w;
	  WebDriverWait ww;
	  FileUtility fu;
	w = new WebDriverUtility(driver);

     w.maximizeBrowser();
     w.waitForElementsToLoad(20L);
     
     ww = new WebDriverWait(driver, Duration.ofSeconds(20));
     LoginPage lp = new LoginPage(driver);
     fu = new FileUtility();
     //logging
     //navigate to url
     lp.url(fu.getPropertyKeyValue("url"));
     ref.log(Status.INFO, "navigated the url");
     lp.enterCredational(
             fu.getPropertyKeyValue("username"),
             fu.getPropertyKeyValue("password"));
     lp.LoginButton();
     ref.pass("Login successfull");
	//write the report
	er.flush();
}
}
