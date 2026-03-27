package SeleniumTestNG;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;



public class Demo_method_calling extends BaseClass {
@Test(priority = 0)
public void login(Method m1) {
	System.out.println("Executing "+m1);
}
@Test(dependsOnMethods = "login")
public void addEmployee(Method m2) {
	System.out.println("Executing "+m2);
}
@Test(dependsOnMethods = "login")
public void logout(Method m3) {
	System.out.println("Executing "+m3);
}
}
