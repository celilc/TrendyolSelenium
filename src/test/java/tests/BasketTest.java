package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.BasketPage;
import pages.HomePage;
import pages.LoginPage;

public class BasketTest extends TestBase {
	@Test
	public void itemNumber() throws InterruptedException {
		BasketPage basket = new   BasketPage(driver,wait);
        basket.click(By.id(basket.itemNumber));
        assertEquals(basket.clickItemNumber();
	}
	@Test
	public void removeItem() throws InterruptedException {
		BasketPage basket = new   BasketPage(driver,wait);
        basket.click(By.id(basket.btnRemove));
        basket.click(By.id(basket.removeOK));
        assertEquals(basket.removeOK();
	}
}
