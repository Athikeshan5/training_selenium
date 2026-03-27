package filepopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cFRyY5T9ukMLW4Ep3j1bMDL9&gclid=Cj0KCQiA8KTNBhD_ARIsAOvp6DLVKeKfM-yahvsuvyXgazOizz-i8e2FHRhJiZOFiqGEOD8h9R0i6e4aAo3_EALw_wcB");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[.=\"I'm experienced\"]")).click();
		Thread.sleep(3000);
		
		//to upload file we need to locate input tag and send the file location
		
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\venka\\Downloads\\Selenium WebDriver.pdf");

	}

}
