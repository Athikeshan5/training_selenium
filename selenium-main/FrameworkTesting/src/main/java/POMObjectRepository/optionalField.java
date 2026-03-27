package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class optionalField {
	public WebDriver driver;
	public optionalField(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
