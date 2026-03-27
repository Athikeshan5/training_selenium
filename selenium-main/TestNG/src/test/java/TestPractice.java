import org.testng.annotations.Test;

public class TestPractice {
    @Test
    public void LoginTest() {
    	System.out.println("Executing TestMethod1");
    }
    @Test(dependsOnMethods = "LoginTest")
    public void Logout() {
    	System.out.println("Executing testMethod2");
    }//if i run it will failures because login dependent the logout but login contain error it will show error 
    //because it forcefully run
}
