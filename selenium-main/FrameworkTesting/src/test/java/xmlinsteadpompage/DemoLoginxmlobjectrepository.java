package xmlinsteadpompage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DemoLoginxmlobjectrepository {
	
@Test
public void login() throws SAXException, IOException, ParserConfigurationException {
  
	//Read data from xml file
	Document	file=DocumentBuilderFactory.newInstance().newDocumentBuilder()
	.parse(new File("./src/main/resources/objectRepository/loginPage.xml"));

    // Fetching the String value
	String user=file.getElementsByTagName("usernameField").item(0).getTextContent();
	System.out.println(user);
	
	String pass=file.getElementsByTagName("PasswordField").item(0).getTextContent();
	System.out.println(pass);
	
	String log=file.getElementsByTagName("LoginField").item(0).getTextContent();
	System.out.println(log);
	
	//launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//url for website
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//username
	driver.findElement(By.name(user.split(":")[1])).sendKeys("Admin");
	//password
	driver.findElement(By.name(pass.split(":")[1])).sendKeys("admin123");
	//login
	driver.findElement(By.cssSelector(log.split(":")[1])).click();
	
	
	//issue of properties,xml,json will not do lazy initialization and stalereferenceexception will occur
	//so use page factory pom
}
}
