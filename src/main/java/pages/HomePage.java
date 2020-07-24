package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://www.trendyol.com/");
	}
	public String btnLogin = "//*[@id=\"accountBtn\"]";
	public String btnClose = "homepage-popup-content";
	public String txtSearch = "search-box";
	public String btnSearch = "search-icon";
	public String btnHome = "logo";
	
	public void clickClose() throws InterruptedException {
		click(By.className(btnClose));
		Thread.sleep(500);
	}
	public String clickHome(String button) throws InterruptedException {
		click(By.id(button));
		return driver.getCurrentUrl();
	}
	
	public void clickLogin() throws InterruptedException {
		click(By.xpath(btnLogin));
		Thread.sleep(500);
	
}
	public void searchItem(String key) throws InterruptedException {
		writeText(By.className(txtSearch),key);
		click(By.className(btnSearch));
		Thread.sleep(500);
    	//driver.findElement(By.className("search-box")).sendKeys("Bilgisayar");
    	//driver.findElement(By.className("search-icon")).click();
    
}
}