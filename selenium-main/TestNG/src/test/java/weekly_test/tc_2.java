package weekly_test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tc_2 {
	WebDriver driver=null;
@Test(priority = 0)
public void launchBrowser() {
	//launching browser
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--incognito");
	driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@Test(priority = 1,dependsOnMethods = "launchBrowser")
public void login() {
	//website url
	driver.get("https://www.saucedemo.com/");
	//enter the username
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	//enter the password
	driver.findElement(By.cssSelector("[name=password]")).sendKeys("secret_sauce");
	//click login button
	driver.findElement(By.id("login-button")).click();
}
@Test(priority = 2,dependsOnMethods = "login")
public void loginValidate() {
	//Validate product page
	SoftAssert page=new SoftAssert();
	String actual=driver.getCurrentUrl();
	String expected="https://www.saucedemo.com/inventory.html";
	page.assertEquals(actual, expected);
	page.assertAll();
	
}
@Test(priority = 3,dependsOnMethods = "loginValidate")
public void addProductToCart() {
	
	//product 1 add to cart
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	//product 2 add to cart
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

	
	//verify cart items showing all the product is added to card
	//click shopping view link
	driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
	//check product
	List<WebElement> cart=driver.findElements(By.className("inventory_item_name"));
	
	SoftAssert page=new SoftAssert();
	ArrayList<String> actual=new ArrayList<String>();
	
	ArrayList<String> expect=new ArrayList<String>();
	expect.add("Sauce Labs Bolt T-Shirt");
	expect.add("Sauce Labs Fleece Jacket");
	
	for(WebElement w:cart) {
	actual.add(w.getText());
	}
	
	//product 1 validate
	page.assertTrue(actual.get(0).contains(expect.get(0)));
	System.out.println("verified product 1");
    //product 2 validate
	page.assertTrue(actual.get(1).contains(expect.get(1)));
	System.out.println("verified product 2");
}
@Test(priority = 4,dependsOnMethods = "addProductToCart")
public void checkout() {
	//perform checkout
	//click checkout button
	driver.findElement(By.cssSelector("[id='checkout']")).click();
	//enter firstname
	driver.findElement(By.name("firstName")).sendKeys("athikeshan");
	//enter lastname
	driver.findElement(By.name("lastName")).sendKeys("v");
	//enter zip code
	driver.findElement(By.name("postalCode")).sendKeys("622001");
	//click continue button
	driver.findElement(By.name("continue")).click();

	//total price
	WebElement total=driver.findElement(By.className("summary_total_label"));
	

	//total expected price
	String expectedTotal="$43.18";
	String actualTotal=total.getText();
	System.out.println(actualTotal+expectedTotal);
	SoftAssert page1=new SoftAssert();
	page1.assertEquals(expectedTotal.equals(actualTotal),expectedTotal.equals(actualTotal));
	System.out.println("verified");
	page1.assertAll();
}
@Test(priority = 6,dependsOnMethods  = "login")
public void logout() {
//click menu
driver.findElement(By.xpath("//button[.='Open Menu']")).click();
//logout
driver.findElement(By.xpath("//a[.='Logout']")).click();
}
}
