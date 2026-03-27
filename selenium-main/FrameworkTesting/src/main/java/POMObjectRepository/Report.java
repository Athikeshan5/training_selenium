package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report {
	public WebDriver driver;
	public Report(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@placeholder='Type for hints...']")
private WebElement Reportname;

@FindBy(xpath="//button[.=' Reset ']")
private WebElement Reportreset;

@FindBy(xpath="//button[.=' Search ']")
private WebElement Reportsearch;

@FindBy(xpath="//button[.=' Add ']")
private WebElement Reportadd;
public WebElement getReportname() {
	return Reportname;
}

public void setReportname(String reportname) {
	getReportname().sendKeys(reportname);
}

public WebElement getReportreset() {
	return Reportreset;
}

public WebElement getReportsearch() {
	return Reportsearch;
}

public WebElement getReportadd() {
	return Reportadd;
}

//bussiness logic
public void addbuttonclick() {
	getReportadd().click();
}
}
