import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import POMObjectRepository.DashboardPage;
import POMObjectRepository.ForgotPasswordPage;
import POMObjectRepository.LoginPage;

public class LoginTest extends BaseClass {
	
@Test
public void Login() {
	LoginPage lp=new LoginPage(driver);
	ForgotPasswordPage fpp=new ForgotPasswordPage(driver);
	DashboardPage db=new DashboardPage(driver);
	lp.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	lp.ForgotPasswordLink();
	fpp.cancelReset();
	lp.enterCredational("Admin", "admin123");
	lp.LoginButton();
	db.profileClick();
	db.LogoutClick();
}
}
