package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

    public static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	int i=0;
        	String timeStamp=new SimpleDateFormat("yyyy-mm-dd").format(new Date());
    		String path="./reports/Report_"+timeStamp+ i++ +".html";
            ExtentSparkReporter spark = new ExtentSparkReporter(path);

            spark.config().setReportName("OrangeHRM UI Automation Report");
            spark.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();   
            extent.attachReporter(spark);

            extent.setSystemInfo("Automation Tester", "Athikeshan");
            extent.setSystemInfo("Framework", "Selenium TestNG");
        }
        return extent;
    }

	
}