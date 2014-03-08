package manheimpackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAllLinks extends DriverInitialization{
	@AfterTest
  	public void quitTest(){
	  	drv.quit();
	}
	@Test(priority=1)
	public void TestingHomeLink() throws Exception {
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		Assert.assertEquals(drv.getTitle(), "Shoe Store: Welcome to the Shoe Store");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("January")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("January")));
		drv.findElement(By.linkText("Home")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("January")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("January")));
		Assert.assertTrue(drv.getPageSource().contains("Pre-Order your shoes today"));	
	}
	@Test(priority=2)
	public void TestingLinkJanuary() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("January")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("January")));
		drv.findElement(By.linkText("January")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("January")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("January")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: January's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("January's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Dalia' Tall Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$3,495.00"));
		Assert.assertTrue(drv.getPageSource().contains("Gucci 'Josephine' Tall Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,650.00"));
	}
	@Test(priority=3)
	public void TestingLinkFebruary() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("February")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("February")));
		drv.findElement(By.linkText("February")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("February")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("February")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: February's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("February's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Tosca' Genuine Python Pull-On Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$2,895.00"));
		Assert.assertTrue(drv.getPageSource().contains("Nicholas Kirkwood for Erdem Bootie"));
		Assert.assertTrue(drv.getPageSource().contains("$1,595.00"));
	}
	@Test(priority=4)
	public void TestingLinkMarch() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("March")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("March")));
		drv.findElement(By.linkText("March")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("March")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("March")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: March's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("March's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo Ankle Strap Crystal Pump"));
		Assert.assertTrue(drv.getPageSource().contains("$2,495.00"));
		Assert.assertTrue(drv.getPageSource().contains("Lanvin Ankle Strap Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,590.00"));
	}
	@Test(priority=5)
	public void TestingLinkApril() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("April")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("April")));
		drv.findElement(By.linkText("April")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("April")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("April")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: April's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("April's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Gucci 'Sofia' Crystal Embellished Platform Pump"));
		Assert.assertTrue(drv.getPageSource().contains("$2,295.00"));
	}
	@Test(priority=6)
	public void TestingLinkMay() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("May")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("May")));
		drv.findElement(By.linkText("May")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("May")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("May")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: May's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("May's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Kani' Sandal"));
		Assert.assertTrue(drv.getPageSource().contains("$2,195.00"));
	}
	@Test(priority=7)
	public void TestingLinkJune() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("June")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("June")));
		drv.findElement(By.linkText("June")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("June")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("June")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: June's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("June's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Lanvin 'Scuba' Short Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,998.00"));
	}
	@Test(priority=8)
	public void TestingLinkJuly() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("July")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("July")));
		drv.findElement(By.linkText("July")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("July")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("July")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: July's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("July's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Kairo' Mesh Bootie"));
		Assert.assertTrue(drv.getPageSource().contains("$1,995.00"));
	}
	@Test(priority=9)
	public void TestingLinkAugust() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("August")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("August")));
		drv.findElement(By.linkText("August")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("August")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("August")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: August's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("August's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Gucci 'Naomi' Sandal"));
		Assert.assertTrue(drv.getPageSource().contains("$1,995.00"));
	}
	@Test(priority=10)
	public void TestingLinkSeptember() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("September")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("September")));
		drv.findElement(By.linkText("September")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("September")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("September")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: September's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("September's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Corinna' Embroidered Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,895.00"));
	}
	@Test(priority=11)
	public void TestingLinkOctober() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("October")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("October")));
		drv.findElement(By.linkText("October")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("October")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("October")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: October's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("October's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Lanvin Platform Pump"));
		Assert.assertTrue(drv.getPageSource().contains("$1,688.00"));
	}
	@Test(priority=12)
	public void TestingLinkNovember() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("November")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("November")));
		drv.findElement(By.linkText("November")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("November")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("November")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: November's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("November's Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Gucci 'Sofia' Sandal"));
		Assert.assertTrue(drv.getPageSource().contains("$1,650.00"));
	}
	@Test(priority=13)
	public void TestingLinkDecember() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("December")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("December")));
		drv.findElement(By.linkText("December")).click();
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("December")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("December")));
		Assert.assertEquals(drv.getTitle(), "Shoe Store: December's Shoes");
		Assert.assertTrue(drv.getPageSource().contains("December's Shoes"));
	}
	@Test(priority=14)
	public void TestingLinkAllShoes() throws Exception {
		
		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("All Shoes")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("All Shoes")));
		drv.findElement(By.linkText("All Shoes")).click();
		Assert.assertEquals(drv.getTitle(), "Shoe Store:");
		Assert.assertTrue(drv.getPageSource().contains("All Shoes"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Dalia' Tall Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$3,495.00"));
		Assert.assertTrue(drv.getPageSource().contains("Giuseppe Zanotti Slingback Sandal"));
		Assert.assertTrue(drv.getPageSource().contains("$1,495.00"));
		Assert.assertTrue(drv.getPageSource().contains("Gucci 'Josephine' Tall Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,650.00"));
		Assert.assertTrue(drv.getPageSource().contains("Burberry Peep Toe Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$1,495.00"));
		Assert.assertTrue(drv.getPageSource().contains("Nicholas Kirkwood for Erdem Bootie"));
		Assert.assertTrue(drv.getPageSource().contains("$1,595.00"));
		Assert.assertTrue(drv.getPageSource().contains("Jimmy Choo 'Tosca' Genuine Python Pull-On Boot"));
		Assert.assertTrue(drv.getPageSource().contains("$2,895.00"));
	}

	
	
}


