package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver, WebDriverWait wait) {super(driver, wait);}
		public String txtMail = "email";
		public String txtPassword = "password";
		public String btnSubmit = "loginSubmit";
	
	public boolean logInTheForm(String userName, String password) throws InterruptedException{
		writeText(By.id(txtMail),userName);
		writeText(By.id(txtPassword),password);
		click(By.id(btnSubmit));
		Thread.sleep(500);
		//String e_mail = "celilcamur1@gmail.com";
		//String pw = "epinefrin54";
		return true;
		
        	//driver.findElement(By.id("email")).sendKeys(e_mail);     
        	//driver.findElement(By.id("password")).sendKeys(pw);       
        	//driver.findElement(By.id("loginSubmit")).click();
        
	}
}
