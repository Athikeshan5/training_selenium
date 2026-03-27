package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage {

    private WebDriver driver;

    public ConfigurationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements

    @FindBy(xpath="//a[.='Optional Fields']")
    private WebElement optionalFields;

    @FindBy(xpath="//a[.='Custom Fields']")
    private WebElement customFields;

    @FindBy(xpath="//a[.='Data Import']")
    private WebElement dataImport;

    @FindBy(xpath="//a[.='Reporting Methods']")
    private WebElement reportingMethods;

    @FindBy(xpath="//a[.='Termination Reasons']")
    private WebElement terminationReasons;

  
    //  GETTERS
  

    public WebElement getOptionalFields() { return optionalFields; }
    public WebElement getCustomFields() { return customFields; }
    public WebElement getDataImport() { return dataImport; }
    public WebElement getReportingMethods() { return reportingMethods; }
    public WebElement getTerminationReasons() { return terminationReasons; }

    
    //  SETTERS (using getters)
   

    public void setOptionalFieldsClick() { getOptionalFields().click(); }
    public void setCustomFieldsClick() { getCustomFields().click(); }
    public void setDataImportClick() { getDataImport().click(); }
    public void setReportingMethodsClick() { getReportingMethods().click(); }
    public void setTerminationReasonsClick() { getTerminationReasons().click(); }

    
    //  BUSINESS LOGIC
  

    public void openOptionalFields() {
        setOptionalFieldsClick();
    }

    public void openCustomFields() {
        setCustomFieldsClick();
    }

    public void openDataImport() {
        setDataImportClick();
    }

    public void openReportingMethods() {
        setReportingMethodsClick();
    }

    public void openTerminationReasons() {
        setTerminationReasonsClick();
    }
}