package POMObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidatePage {

    WebDriver driver;

    public AddCandidatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[placeholder='First Name']")
    private WebElement firstName;

    @FindBy(css = "[placeholder='Middle Name']")
    private WebElement middleName;

    @FindBy(css = "[placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(css = "[class='oxd-select-text-input']")
    private WebElement vacancyDropdown;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement email;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement contact;

    @FindBy(css = "[class='oxd-file-input']")
    private WebElement resumeUpload;

    @FindBy(css = "[placeholder='yyyy-dd-mm']")
    private WebElement date;

    @FindBy(xpath = "//button[.=' Save ']")
    private WebElement saveBtn;

    @FindBy(linkText = "Candidates")
    private WebElement candidatesTab;

    // ✅ GETTERS

    public WebElement getFirstName() { return firstName; }
    public WebElement getMiddleName() { return middleName; }
    public WebElement getLastName() { return lastName; }
    public WebElement getVacancyDropdown() { return vacancyDropdown; }
    public WebElement getEmail() { return email; }
    public WebElement getContact() { return contact; }
    public WebElement getResumeUpload() { return resumeUpload; }
    public WebElement getDate() { return date; }
    public WebElement getSaveBtn() { return saveBtn; }
    public WebElement getCandidatesTab() { return candidatesTab; }

    // ✅ SETTERS (using getters)

    public void setFirstName(String fname) {
        getFirstName().sendKeys(fname);
    }

    public void setMiddleName(String mname) {
        getMiddleName().sendKeys(mname);
    }

    public void setLastName(String lname) {
        getLastName().sendKeys(lname);
    }

    public void setEmail(String mail) {
        getEmail().sendKeys(mail);
    }

    public void setContact(String number) {
        getContact().sendKeys(number);
    }

    public void uploadResume(String path) {
        getResumeUpload().sendKeys(path);
    }

    public void setDate(String d) {
        getDate().sendKeys(Keys.CONTROL + "a");
        getDate().sendKeys(Keys.DELETE);
        getDate().sendKeys(d);
    }

    public void clickSaveBtn() {
        getSaveBtn().click();
    }

    public void clickCandidatesTab() {
        getCandidatesTab().click();
    }

    // Dropdown handling using getter
    public void selectVacancy(int index) {
        getVacancyDropdown().click();
        for (int i = 0; i < index; i++) {
            getVacancyDropdown().sendKeys(Keys.ARROW_DOWN);
        }
        getVacancyDropdown().sendKeys(Keys.ENTER);
    }

    // ✅ BUSINESS LOGIC

    public void addCandidate(String fname, String mname, String lname,
                              String mail, String contactNo,
                              String resume, String dateValue) {

        setFirstName(fname);
        setMiddleName(mname);
        setLastName(lname);
        selectVacancy(2);
        setEmail(mail);
        setContact(contactNo);
        uploadResume(resume);
        setDate(dateValue);
        clickSaveBtn();
    }

    public void verifyCandidate() {
        clickCandidatesTab();
    }
}