package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements

    @FindAll({
        @FindBy(name="username"),
        @FindBy(css="[placeholder='Username']"),
        @FindBy(xpath="//input[@placeholder='Username' and @name='username']")
    })
    private WebElement username;

    @FindBy(xpath="//button[.=' Cancel ']")
    private WebElement cancel;

    @FindBy(xpath="//button[.=' Reset Password ']")
    private WebElement resetPassword;

   
    // GETTERS
   

    public WebElement getUsername() { return username; }
    public WebElement getCancel() { return cancel; }
    public WebElement getResetPassword() { return resetPassword; }

    
    // SETTERS (using getters)
    

    public void setUsername(String user) {
        getUsername().clear();
        getUsername().sendKeys(user);
    }

    public void setCancelClick() {
        getCancel().click();
    }

    public void setResetPasswordClick() {
        getResetPassword().click();
    }

    
    //  BUSINESS LOGIC
   

    public void resetPasswordFlow(String user) {
        setUsername(user);
        setResetPasswordClick();
    }

    public void cancelReset() {
        setCancelClick();
    }

}