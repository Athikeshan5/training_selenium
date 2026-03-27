package Demo;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtendReports {
@Test
public void practice() {
	//create a new test
	ExtentReports er=new ExtentReports();
	//before making the test creation create reporter
	ExtentSparkReporter esr=new ExtentSparkReporter("./reports/sampleReport.html");//enter the path for folder and create file name to store report so enter name to create the file
	er.attachReporter(esr);//the test will connect spark reporter
	ExtentTest ref = er.createTest("Sample Test");
	//Logging
	ref.info("test execution started");
	ref.pass("test case passed");
	ref.fail("test case failed");
	ref.warning("method is depricated");
	//write the report
	er.flush();
}
}
