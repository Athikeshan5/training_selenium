package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 public WebDriver driver;
	 public LoginPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
 
	 @FindBy(name = "username")
	 private WebElement username;

	 @FindBy(name = "password")
	 private WebElement password;
	 
      @FindBy(xpath  ="//button[.=' Login ']")
      private WebElement Login;
      @FindBy(xpath="//*[name()='svg']/parent::a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
      private WebElement LinkedIn;
      @FindBy(xpath="//*[name()='svg']/parent::a[@href='https://www.facebook.com/OrangeHRM/']")
      private WebElement Facebook;
      @FindBy(xpath="//*[name()='svg']/parent::a[@href='https://twitter.com/orangehrm?lang=en']")
      private WebElement Twitter;
      @FindBy(xpath="//*[name()='svg']/parent::a[@href='https://www.youtube.com/c/OrangeHRMInc']")
      private WebElement Youtube;
      @FindBy(xpath="//a[@href='http://www.orangehrm.com']")
      private WebElement OrangeHRM;
      @FindBy(xpath="//p[.='Forgot your password? ']")
      private WebElement ForgotPassword;
      
      
      
	  public WebElement getUsername() {
		  return username;
	  }
	  public void setUsername(String username) {
		  getUsername().sendKeys(username);
	  }
	  public WebElement getPassword() {
		  return password;
	  }
	  public void setPassword(String password) {
		  getPassword().sendKeys(password);
	  }
	  public WebElement getLogin() {
		  return Login;
	  }
	 
	  public WebElement getLinkedIn() {
		  return LinkedIn;
	  }
	  
	  public WebElement getFacebook() {
		  return Facebook;
	  }
	  
	  public WebElement getTwitter() {
		  return Twitter;
	  }
	  
	  public WebElement getYoutube() {
		  return Youtube;
	  }
	 
	  public WebElement getOrangeHRM() {
		  return OrangeHRM;
	  }
	 
	  public WebElement getForgotPassword() {
		  return ForgotPassword;
	  }
	  
	  
	  
	  //bussiness logic
	  public void enterCredational(String name,String pass) {
    	  setUsername(name);
    	  setPassword(pass);
      }
      public void LoginButton() {
    	  getLogin().click();
      }
      public void LinkedInLink() {
    	   getLinkedIn().click();  
      }
      public void FacebookLink() {
   	       getFacebook().click();  
     }
      public void TwtterLink() {
   	   getTwitter().click();  
     }
      public void YoutubeLink() {
   	   getYoutube().click();  
     }
      public void OrangeHRMLink() {
   	   getOrangeHRM().click();  
     }
      public void ForgotPasswordLink() {
   	   getForgotPassword().click();  
     }
     public void url(String url) {
    	 driver.get(url);
     }
}
