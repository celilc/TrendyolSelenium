package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import pages.HomePage;

public class HomeTest extends TestBase {
	@Test
	public void valid_login() throws InterruptedException{
		HomePage home = new HomePage(driver,wait);
		assertEquals(home.clickHome(home.btnHome),"https://www.trendyol.com/");
	}
	@Test
	public void invalid_login() throws InterruptedException{
		HomePage home = new HomePage(driver,wait);
		assertEquals(home.clickHome(home.btnHome),"https://www.trendyol.com/123");
	}
	@Test
	public void empty_login() throws InterruptedException{
		HomePage home = new HomePage(driver,wait);
		assertEquals(home.clickHome(home.btnHome),"https://www.trendyol.com/123");
	}
}
