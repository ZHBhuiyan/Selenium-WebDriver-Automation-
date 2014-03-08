package manheimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestManheimDrpDownAndTextBoxes extends DriverInitialization{
	@AfterTest
  	public void quitTest(){
	  	drv.quit();
	}
	@Test(priority=1)
	public void TestingRemindMeTextBoxes() throws Exception {
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remind_email_input")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.id("remind_email_input")));
		drv.findElement(By.id("remind_email_input")).sendKeys("zhtonmoy@yahoo.com");
		drv.findElement(By.id("remind_email_input")).submit();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"flash notice\"]")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class=\"flash notice\"]")));
		Assert.assertTrue(drv.getPageSource().contains("Thanks!  We will notify you of our new shoes at this email: zhtonmoy@yahoo.com"));	
	}
	@Test(priority=2)
	public void TestingPromotionalCodeTextBoxes() throws Exception {
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promo_code_input")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.id("promo_code_input")));
		drv.findElement(By.id("promo_code_input")).sendKeys("test code");
		drv.findElement(By.id("promo_code_input")).submit();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"flash notice\"]")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class=\"flash notice\"]")));
		Assert.assertTrue(drv.getPageSource().contains("The code: test code is not a valid promotional code"));	
	}
	@Test(priority=3)
	public void TestingPreOrderShoesDropDownBoxes() throws Exception {
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brand")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.id("brand")));
		Select chooseBrand=new Select(drv.findElement(By.id("brand")));
		chooseBrand.selectByValue("Acorn");
		drv.findElement(By.id("search_button")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"title\"]")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class=\"title\"]")));
		Assert.assertTrue(drv.getPageSource().contains("Acorn's Shoes"));	
	}


}
