package com.opencart.pomobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
     
	public WebDriver driver;
	RegisterPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="[id='input-firstname']")
	private WebElement firstname;
	
	@FindBy(css="[id='input-lastname']")
	private WebElement lastname;
	
	@FindBy(css="[id='input-email']")
	private WebElement email;
	
	@FindBy(css="[id='input-password']")
	private WebElement password;
	
	@FindBy(css="[id='input-newsletter']")
	private WebElement newsletter_subscribe;
	
	@FindBy(css="[name='agree']")
	private WebElement privacy_policy;
	
	@FindBy(css="[type='submit']")
	private WebElement continue_button;
	
	@FindBy(xpath="//a[.='Login' and @class='list-group-item']")
	private WebElement Login;
	
	@FindBy(xpath="//a[.='Register' and @class='list-group-item']")
	private WebElement Register;
	
	@FindBy(xpath="//a[.='Forgotten Password' and @class='list-group-item']")
	private WebElement forgot_password;
	
	@FindBy(xpath="//a[.='My Account' and @class='list-group-item']")
	private WebElement MY_Account;
	
	@FindBy(xpath="//a[.='Address Book' and @class='list-group-item']")
	private WebElement Address_Book;
	
	@FindBy(xpath="//a[.='Wish List' and @class='list-group-item']")
	private WebElement WishList;
	
	@FindBy(xpath="//a[.='Order History' and @class='list-group-item']")
	private WebElement Order_History;
	
	@FindBy(xpath="//a[.='Downloads' and @class='list-group-item']")
	private WebElement Downloads;
	
	@FindBy(xpath="//a[.='Subscriptions' and @class='list-group-item']")
	private WebElement Subscriptions;
	
	@FindBy(xpath="//a[.='Reward Points' and @class='list-group-item']")
	private WebElement Reward_points;
	
	@FindBy(xpath="//a[.='Returns' and @class='list-group-item']")
	private WebElement Returns;
	
	@FindBy(xpath="//a[.='Transactions' and @class='list-group-item']")
	private WebElement Transactions;
	
	@FindBy(xpath="//a[.='Newsletter' and @class='list-group-item']")
	private WebElement Newsletter;
	
	@FindBy(linkText="login page")
	private WebElement loginLink;
	

	

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		getFirstname().sendKeys(firstname);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		getLastname().sendKeys(lastname);
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

	public WebElement getNewsletter_subscribe() {
		return newsletter_subscribe;
	}

	public void setNewsletter_subscribe() {
		getNewsletter_subscribe().click();
	}

	public WebElement getPrivacy_policy() {
		return privacy_policy;
	}

	public void setPrivacy_policy() {
		getPrivacy_policy().click();
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	public void setContinue_button() {
		getContinue_button().click();
	}

	public WebElement getLogin() {
		return Login;
	}

	public void setLogin() {
		getLogin().click();
	}

	public WebElement getRegister() {
		return Register;
	}

	public void setRegister() {
	        getRegister().click();
	}

	public WebElement getForgot_password() {
		return forgot_password;
	}

	public void setForgot_password() {
		getForgot_password().click();
	}

	public WebElement getMY_Account() {
		return MY_Account;
	}

	public void setMY_Account() {
		getMY_Account().click();
	}

	public WebElement getAddress_Book() {
		return Address_Book;
	}

	public void setAddress_Book() {
	     getAddress_Book().click();	
	}

	public WebElement getWishList() {
		return WishList;
	}

	public void setWishList() {
		getWishList().click();
	}

	public WebElement getOrder_History() {
		return Order_History;
	}

	public void setOrder_History() {
		getOrder_History().click();
	}

	public WebElement getDownloads() {
		return Downloads;
	}

	public void setDownloads() {
		getDownloads().click();
	}

	public WebElement getSubscriptions() {
		return Subscriptions;
	}

	public void setSubscriptions() {
		getSubscriptions().click();
	}

	public WebElement getReward_points() {
		return Reward_points;
	}

	public void setReward_points() {
		getReward_points().click();
	}

	public WebElement getReturns() {
		return Returns;
	}

	public void setReturns() {
		getReturns().click();
	}

	public WebElement getTransactions() {
		return Transactions;
	}

	public void setTransactions() {
		getTransactions().click();
	}

	public WebElement getNewsletter() {
		return Newsletter;
	}

	public void setNewsletter() {
		getNewsletter().click();
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink() {
		getLoginLink().click();
	}
	
	
	//bussiness logic
	
	public void registerapplication(String firstname,String lastname,String email,String password) {
		setFirstname(firstname);
		setLastname(lastname);
		setEmail(email);
		setPassword(password);
		setNewsletter();
		setPrivacy_policy();
		setContinue_button();
	}
	
	
	
	
	
}
