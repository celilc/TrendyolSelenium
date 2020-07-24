package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.*;

public class Trendyol {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public void openbrowser(String url){

		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get(url);

 	}
	
	public static void main(String[] args) throws InterruptedException{

		Trendyol amazonwishlist1 = new Trendyol();
    	
		amazonwishlist1.openbrowser("https://www.trendyol.com/");

		HomePage homepage1 = new HomePage(driver,wait);
		HomePage homepage2 = new HomePage(driver,wait);
		HomePage homepage4 = new HomePage(driver,wait);
		homepage1.clickClose();
		
		
    	homepage2.clickLogin();
    	
    	
    	//homepage3.clickClose2(driver);

		LoginPage loginpage1 = new LoginPage(driver,wait);
		loginpage1.logInTheForm("celilcamur1@gmail.com","epinefrin54");
		driver.get("https://www.trendyol.com/");
		homepage4.searchItem("Bilgisayar");
    	
		ItemListPage itemlistpage1 = new ItemListPage(driver,wait);	
		itemlistpage1.clickItem();
     	
		BasketPage itempage1 = new BasketPage(driver,wait);	
		itempage1.clickItemNumber();
    	
		Trendyol.driver.quit();

	}
}
