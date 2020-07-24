package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItemListPage extends PageBase {
	public ItemListPage(WebDriver driver, WebDriverWait wait) {super(driver, wait);}
	public String btnBasket = "add-to-basket-button";
	public String btnItem = "myBasketListItem";
	public void clickItem() throws InterruptedException {
		click(By.className(btnBasket));
		click(By.id(btnItem));
		Thread.sleep(500);
	}
	//public void clickItem(WebDriver driver) {
		
    //	driver.findElement(By.className("add-to-basket-button")).click();
   // 	driver.findElement(By.id("myBasketListItem")).click();
    	
//}
}
