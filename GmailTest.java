package xLnDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailTest {
	
	static FileInputStream File;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String value;
	WebDriver driver;
	
@DataProvider
public Object[][] getData() throws IOException {
	File = new FileInputStream("C://Data.xlsx");
	wb = new XSSFWorkbook(File);
	sheet = wb.getSheetAt(0);
	int rowNum = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
	int columnNum = sheet.getRow(0).getLastCellNum();
	Object data[][] = new Object[rowNum-1][columnNum];
	
	for(int i=2; i<rowNum; i++)
	{
		for(int j=0; j<columnNum; j++ )
		{
			data[i-2][j] = getCellData("Sheet1", i, j);
		}
	}
	return data;
	}

public static String getCellData(String strSheet, int rowNum, int columnNum) throws IOException
{
	File = new FileInputStream("C://Data.xlsx");

		wb = new XSSFWorkbook(File);
		sheet = wb.getSheet(strSheet);
		row = sheet.getRow(rowNum);
		cell= row.getCell(columnNum);
		if(cell == null)
			return "";
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			return cell.getStringCellValue();
		}else if(cell.getCellType()==cell.CELL_TYPE_FORMULA||cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			return String.valueOf(cell.getNumericCellValue());
		}else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
		{
			return String.valueOf(cell.getBooleanCellValue());
		}else 
		{
			return "";
		}
		
	}		

@Test(dataProvider="getData")
public  void GmailLogin(String userName, String Password){

	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	
driver.get("http://www.gmail.com");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
driver.findElement(By.xpath("//input[@id='next']")).click();
}

}