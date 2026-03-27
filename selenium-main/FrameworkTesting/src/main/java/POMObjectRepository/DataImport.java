package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataImport {
	public WebDriver driver;
	public DataImport(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
