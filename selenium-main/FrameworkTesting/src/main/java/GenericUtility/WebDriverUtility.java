package GenericUtility;

import org.openqa.selenium.Point;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public WebDriver driver;
	WebDriverWait wait;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	//Manage
	//Maximize
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	//Minimize
	public void minimizeBrowser() {
		driver.manage().window().minimize();
	}
	//fullScreen
	public void fullscreenBrowser() {
		driver.manage().window().fullscreen();
	}
	//getSize
	public Dimension fetchSize() {
		Dimension d=driver.manage().window().getSize();
		return d;
	}
	//setsize
	public void setSizemethod(int width,int height) {
		driver.manage().window().setSize(new Dimension(width,height));
	}
	//setPosition
	public void setPositionMethod(int x,int y) {
		driver.manage().window().setPosition(new Point(x,y));
	}
	//getPosition
	public Point fetchPosition() {
		Point p=driver.manage().window().getPosition();
	    return p;
	}
	
	//Navigate
	//navigate to string
	public void navigatetoMethod(String urls) {
		driver.navigate().to(urls);
	}
	//navigate to Url 
		public void navigatetoStringMethod(URL urls) {
			driver.navigate().to(urls);;
		}
	//forward method
	public void forward() {
		driver.navigate().forward();
	}
	//backward
	public void back() {
		driver.navigate().back();
	}
	//refresh
	public void refresh() {
		driver.navigate().refresh();
	}
	//get title
	public String gettitle() {
		String title=driver.getTitle();
		return title;
	}
	//get current url
	public String getCurrenturlMethod() {
		String currenturl=driver.getCurrentUrl();
		return currenturl;
	}
	//get url
	public void Geturl(String url) {
	     driver.get(url);
	}
	//close
	public void closeparenttab() {
		driver.close();
	}
	//quit
	public void quitbrowser() {
		driver.quit();
	}
	
	//Timeouts
	//implicit wait
	public void waitForElementsToLoad(Long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	//explicit wait
	public void waitForSpecificElementsTovisible(WebElement ele,Long sec) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(sec)); 
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForSpecificElementsToclickable(WebElement ele,Long sec) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(sec)); 
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	//fluentwait
	public FluentWait setPollingPeriodtowaitforElement(Long sec) {
		FluentWait f=new FluentWait(driver);
		f.withTimeout(Duration.ofSeconds(sec));
		return f;
	}
	//popups
	//alert
	public void clickonaccept() {
		driver.switchTo().alert().accept();
	}
	public void clickondismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void TypeMessageInPrompt(String Message) {
		driver.switchTo().alert().sendKeys(Message);;
	}
	public String fetchJavaScriptPopupMessage() {
		String data=driver.switchTo().alert().getText();
		return data;
	}
	//childWindow Handle
	public void movechildWindowByTitle(String Pagetitle) {
		String parentid=driver.getWindowHandle();
		Set<String> id=driver.getWindowHandles();
		for(String s:id) {
			driver.switchTo().window(s); 
			if(Pagetitle.equals(gettitle())) {
			       break;
			}
		}
		}
	public void movechildWindowByUrl(String PageUrl) {
		String parentid=driver.getWindowHandle();
		Set<String> id=driver.getWindowHandles();
		for(String s:id) {
			driver.switchTo().window(s); 
			if(PageUrl.equals(getCurrenturlMethod())) {
			       break;
			}
		}
		}
	//Iframe
	public void switchframebyindex(int index) {
		driver.switchTo().frame(index);
	}
	public void switchframebyIdOrName(String idOrNameValue) {
		driver.switchTo().frame(idOrNameValue);
	}
	public void switchframeByWebelement(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public void switchBackthecontrolTopreviousframe() {
		driver.switchTo().parentFrame();//it go to previous frame
	}
	public void switchBackTheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
}
