package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanciesPage {

    private WebDriver driver;

    public VacanciesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //  WebElements

    @FindBy(xpath="//label[.='Job Title']/../../child::div[.='-- Select --']")
    private WebElement jobTitle;

    @FindBy(xpath="//label[.='Vacancy']/../../child::div[.='-- Select --']")
    private WebElement vacancy;

    @FindBy(xpath="//label[.='Hiring Manager']/../../child::div[.='-- Select --']")
    private WebElement hiringManager;

    @FindBy(xpath="//label[.='Status']/../../child::div[.='-- Select --']")
    private WebElement status;

    @FindBy(xpath="//button[.=' Reset ']")
    private WebElement reset;

    @FindBy(xpath="//button[.=' Search ']")
    private WebElement search;

   
    // GETTERS
   

    public WebElement getJobTitle() { return jobTitle; }
    public WebElement getVacancy() { return vacancy; }
    public WebElement getHiringManager() { return hiringManager; }
    public WebElement getStatus() { return status; }
    public WebElement getReset() { return reset; }
    public WebElement getSearch() { return search; }

   
    // SETTERS (using getters)
    

    public void setJobTitleClick() { getJobTitle().click(); }
    public void setVacancyClick() { getVacancy().click(); }
    public void setHiringManagerClick() { getHiringManager().click(); }
    public void setStatusClick() { getStatus().click(); }
    public void setResetClick() { getReset().click(); }
    public void setSearchClick() { getSearch().click(); }

   
    //  BUSINESS LOGIC
   

    public void searchVacancy() {
        setSearchClick();
    }

    public void resetVacancySearch() {
        setResetClick();
    }

    public void filterByJobTitle() {
        setJobTitleClick();
    }

    public void filterByVacancy() {
        setVacancyClick();
    }

    public void filterByHiringManager() {
        setHiringManagerClick();
    }

    public void filterByStatus() {
        setStatusClick();
    }
}