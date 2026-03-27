package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddReport {
	public WebDriver driver;
	public AddReport(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='http://www.orangehrm.com']")
	private WebElement OrangeHRM;
	
	@FindBy(xpath="//label[.='Employee Name']/../../../..//i[@class='oxd-icon bi-trash-fill']")
	private WebElement deleteEmpName;
	
	@FindBy(xpath="//p[.='Personal']/../..//i[@class='oxd-icon bi-trash-fill']")
	private WebElement deletePersonal;
	
	@FindBy(xpath="//label[.='Report Name']/../..//input[@placeholder='Type here ...']")
	private WebElement Reportname;
	
	@FindBy(xpath="//label[.='Selection Criteria']/../..//div[@class='oxd-select-text-input']")
	private WebElement selectioncriteria;
	
	@FindBy(xpath="//label[.='Include']/../..//div[@class='oxd-select-text-input']")
	private WebElement Include;
	
	@FindBy(xpath="//label[.='Select Display Field Group']/../..//div[@class='oxd-select-text-input']")
	private WebElement displayfieldsgroup;
	
	@FindBy(xpath="//label[.='Select Display Field']/../..//div[@class='oxd-select-text-input']")
	private WebElement displayfields;
	
	@FindBy(xpath="//label[.='Selection Criteria']/../../..//i[@class='oxd-icon bi-plus']")
	private WebElement selectioncriteriaadd;
	
	@FindBy(xpath="//label[.='Select Display Field']/../../..//i[@class='oxd-icon bi-plus']")
	private WebElement displayfieldadd;
	
	@FindBy(xpath="//button[.=' Cancel ']")
	private WebElement cancel;
	
	@FindBy(xpath="//button[.=' Save ']")
	private WebElement save;
	
	public WebElement getReportname() {
		return Reportname;
	}

	public void setReportname(WebElement reportname) {
		Reportname = reportname;
	}

	public WebElement getInclude() {
		return Include;
	}

	public void setInclude(WebElement include) {
		Include = include;
	}

	public WebElement getDeleteEmpName() {
		return deleteEmpName;
	}

	public void setDeleteEmpName(WebElement deleteEmpName) {
		this.deleteEmpName = deleteEmpName;
	}

	public WebElement getDeletePersonal() {
		return deletePersonal;
	}

	public void setDeletePersonal(WebElement deletePersonal) {
		this.deletePersonal = deletePersonal;
	}

	public WebElement getSelectioncriteria() {
		return selectioncriteria;
	}

	public WebElement getDisplayfieldsgroup() {
		return displayfieldsgroup;
	}

	public WebElement getDisplayfields() {
		return displayfields;
	}

	public WebElement getSelectioncriteriaadd() {
		return selectioncriteriaadd;
	}

	public WebElement getDisplayfieldadd() {
		return displayfieldadd;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOrangeHRM() {
		return OrangeHRM;
	}

}
