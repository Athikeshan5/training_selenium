package com.opencart.pomobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[.='Continue']")
	private WebElement new_customer;
	
	@FindBy(css="[id='input-email']")
	private WebElement email;
	
	@FindBy(css="[id='input-password']")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement login;
	
	//getter and setter
	public WebElement getNew_customer() {
		return new_customer;
	}

	public void setNew_customer( ) {
		getNew_customer().click();
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
	       getEmail().sendKeys(email);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin() {
		getLogin().click();
	}
	
	
	//bussiness logic
	public void loginfunction(String email,String pass) {
		setEmail(email);
		setPassword(pass);
		setLogin();
	}
	
	
}
