package manheimpackage;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//Regression test case to test the basic features of the home page
public class ManheimRegression extends DriverInitialization{
	@AfterTest
  	public void quitTest(){
	  	drv.quit();
	}
	//The method below will automate the testing of basic features in http://manheim-shoe-store-test.herokuapp.com/
	@Test(priority=100)
  	public void initialScreenJustification() throws Exception {
		File loginData=new File("C:\\Sel Server\\manheim.xlsx");
		FileInputStream fis=new FileInputStream(loginData);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("InitialScreenRegression");
		int maxRow=ws.getLastRowNum()+1;
		int maxCol=ws.getRow(0).getLastCellNum();
		String[][] pageTitle=new String[maxRow][maxCol];
		for(int i=1;i<maxRow;i++){
			XSSFRow row=ws.getRow(i);
				for(int j=0;j<maxCol;j++){
					XSSFCell cell=row.getCell(j);
					String value=CellToString(cell);
					pageTitle[i][j]=value;
				}
			
		}

		WebDriverWait myWait=new WebDriverWait(drv, 10);
	  	drv.manage().window().maximize();
		drv.get("http://manheim-shoe-store-test.herokuapp.com/");
		Assert.assertEquals(drv.getTitle(), "Shoe Store: Welcome to the Shoe Store");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("January")));
		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("January")));
		List<WebElement> allLinks = drv.findElements(By.tagName("a"));
		        String[] linkTexts = new String[allLinks.size()];
		        int i = 0;
		  
		        //extract the link texts of each link element
		        for (WebElement e : allLinks) {
		            linkTexts[i] = e.getText();
		            i++;
		       }
		       //test each link
		        int j=1;
		        for (String t : linkTexts) {
		        	myWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(t)));
		        	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(t)));
		    		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText(t)));
		            drv.findElement(By.linkText(t)).click();
		            myWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(t)));
		        	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(t)));
		    		myWait.until(ExpectedConditions.elementToBeClickable(By.linkText(t)));
		            Assert.assertEquals(drv.getTitle(), pageTitle[j++][0]);
		            
		       }

		
  }
	public static String CellToString(XSSFCell cell){
		int type;
		Object result;
		type=cell.getCellType();
		switch(type){
		case 0:
			result=cell.getStringCellValue();
			break;
		case 1:
			result=cell.getStringCellValue();
			break;
		default:
			throw new RuntimeException("There are no support for this type of cell");
		}
		return result.toString();
	}

	
}

