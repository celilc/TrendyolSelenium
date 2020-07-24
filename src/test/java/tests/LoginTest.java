package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
	@Test
	public void valid_UsernameAndPassword() throws InterruptedException {
		HomePage home = new   HomePage(driver,wait);
        LoginPage login = new   LoginPage(driver,wait);
        
        home.click(By.id(home.btnLogin));
        
        assertEquals(login.logInTheForm("test@gmail.com","truePassword"),true);
	}
	
	@Test
	public void invalid_UsernameAndPassword() throws InterruptedException {
		HomePage home = new   HomePage(driver,wait);
        LoginPage login = new   LoginPage(driver,wait);
        
        home.click(By.id(home.btnLogin));
        
        assertEquals(login.logInTheForm("test@gmail.com","wrongPassword"),false);
	}
	
}
