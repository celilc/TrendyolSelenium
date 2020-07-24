package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage extends PageBase {
	public BasketPage(WebDriver driver, WebDriverWait wait) {super(driver, wait);}
	public String itemNumber = "ty-numeric-counter-button";
	public String btnRemove = "i-trash";
	public String removeOK = "btn-item btn-remove";	
	public void clickItemNumber() throws InterruptedException {
		click(By.className(itemNumber));
		Thread.sleep(500);
	}
	public void clickRemove() throws InterruptedException {
		click(By.id(btnRemove));
		Thread.sleep(500);
		click(By.id(removeOK));
		Thread.sleep(500);
	}
	//public void clickItemNumber(WebDriver driver) {
		
    	//driver.findElement(By.className("ty-numeric-counter-button")).click();
    	//driver.findElement(By.className("i-trash")).click();
    	//driver.findElement(By.className("btn-item btn-remove")).click();
    	
//}
}
