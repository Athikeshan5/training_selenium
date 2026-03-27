package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // PRIVATE WEBELEMENTS

    @FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']")
    private WebElement time;

    @FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--danger orangehrm-report-icon']")
    private WebElement pendingReview;

    @FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--info orangehrm-report-icon']")
    private WebElement candidateInterview;

    @FindBy(xpath="//div[@title='Assign Leave']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement assignLeave;

    @FindBy(xpath="//div[@title='Leave List']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement leaveList;

    @FindBy(xpath="//div[@title='Apply Leave']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement applyLeave;

    @FindBy(xpath="//div[@title='My Leave']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement myLeave;

    @FindBy(xpath="//div[@title='Timesheets']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement timesheets;

    @FindBy(xpath="//div[@title='My Timesheet']/..//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")
    private WebElement myTimeSheet;

    @FindBy(xpath="//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
    private WebElement menu;

    @FindBy(xpath="//button[@class='oxd-glass-button orangehrm-upgrade-button']")
    private WebElement upgrade;

    @FindBy(css="[alt='profile picture']")
    private WebElement profile;

    @FindBy(xpath="//a[.='About']")
    private WebElement about;

    @FindBy(xpath="//a[.='Support']")
    private WebElement support;

    @FindBy(xpath="//a[.='Change Password']")
    private WebElement changePassword;

    @FindBy(xpath="//a[.='Logout']")
    private WebElement logout;

    @FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    private WebElement pim;

    @FindBy(xpath="//*[name()='svg']/..//span[.='Recruitment']")
    private WebElement recruitment;

   
    //  GETTERS
  

    public WebElement getTime() { return time; }
    public WebElement getPendingReview() { return pendingReview; }
    public WebElement getCandidateInterview() { return candidateInterview; }
    public WebElement getAssignLeave() { return assignLeave; }
    public WebElement getLeaveList() { return leaveList; }
    public WebElement getApplyLeave() { return applyLeave; }
    public WebElement getMyLeave() { return myLeave; }
    public WebElement getTimesheets() { return timesheets; }
    public WebElement getMyTimeSheet() { return myTimeSheet; }
    public WebElement getMenu() { return menu; }
    public WebElement getUpgrade() { return upgrade; }
    public WebElement getProfile() { return profile; }
    public WebElement getAbout() { return about; }
    public WebElement getSupport() { return support; }
    public WebElement getChangePassword() { return changePassword; }
    public WebElement getLogout() { return logout; }
    public WebElement getPim() { return pim; }
    public WebElement getRecruitment() { return recruitment; }

    
    // SETTER

    public void setTimeClick() { getTime().click(); }
    public void setPendingReviewClick() { getPendingReview().click(); }
    public void setCandidateInterviewClick() { getCandidateInterview().click(); }
    public void setAssignLeaveClick() { getAssignLeave().click(); }
    public void setLeaveListClick() { getLeaveList().click(); }
    public void setApplyLeaveClick() { getApplyLeave().click(); }
    public void setMyLeaveClick() { getMyLeave().click(); }
    public void setTimesheetsClick() { getTimesheets().click(); }
    public void setMyTimeSheetClick() { getMyTimeSheet().click(); }
    public void setMenuClick() { getMenu().click(); }
    public void setUpgradeClick() { getUpgrade().click(); }
    public void setProfileClick() { getProfile().click(); }
    public void setAboutClick() { getAbout().click(); }
    public void setSupportClick() { getSupport().click(); }
    public void setChangePasswordClick() { getChangePassword().click(); }
    public void setLogoutClick() { getLogout().click(); }
    public void setPimClick() { getPim().click(); }
    public void setRecruitmentClick() { getRecruitment().click(); }

  
    //  BUSINESS LOGIC (CALL SETTERS)
 

    public void Recruitmentlink() { setRecruitmentClick(); }
    public void pimlink() { setPimClick(); }
    public void menuClick() { setMenuClick(); }
    public void upgradeClick() { setUpgradeClick(); }
    public void profileClick() { setProfileClick(); }
    public void aboutClick() { setAboutClick(); }
    public void supportClick() { setSupportClick(); }
    public void ChangePasswordClick() { setChangePasswordClick(); }
    public void LogoutClick() { setLogoutClick(); }
    public void TimeClick() { setTimeClick(); }
    public void PendingReviewClick() { setPendingReviewClick(); }
    public void CandidateInterviewClick() { setCandidateInterviewClick(); }
    public void AssignLeaveClick() { setAssignLeaveClick(); }
    public void LeaveListClick() { setLeaveListClick(); }
    public void TimeSheetsClick() { setTimesheetsClick(); }
    public void MyTimeSheetClick() { setMyTimeSheetClick(); }
    public void ApplyLeaveClick() { setApplyLeaveClick(); }
    public void MyLeaveClick() { setMyLeaveClick(); }
}