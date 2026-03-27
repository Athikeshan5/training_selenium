package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customfield {
	public WebDriver driver;
	public customfield(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
