package pom_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	
	WebDriver driver;
    public LoginPage(WebDriver driver){
    	this.driver=driver;
    }
	//username
	By username=By.id("user-name");
	//password
	By password=By.id("password");
	//login
	By login=By.id("login-button");
	
	 public void enterUrl(String url) {
		   driver.get(url);
	   }
	//Bussiness logic(Login action)
	public void enterCredational(String user,String pass) {
	  driver.findElement(username).sendKeys(user);	
	  driver.findElement(password).sendKeys(pass);
	}
	public void login() {
		driver.findElement(login).click();
	}
	


}
