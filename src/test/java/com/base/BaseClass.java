package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public void getDriver(String browserType) {
		switch(browserType) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
		        break;
			case "FireFox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "IE":
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
				break;
				default:
					break;	
		}
	}
	
	public void lanuchURL(String Url) {
		driver.get(Url);
	}
	
	public void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public WebElement findLocatorById(String value) {
		WebElement element = driver.findElement(By.id(value));
	    return element;
	}
	
	public WebElement findLocatorByName(String value) {
		WebElement element = driver.findElement(By.name(value));
		return element;
	}
	
	public WebElement findLocatorByTagName(String value) {
		WebElement element= driver.findElement(By.tagName(value));
		return element;
	}
	
	public WebElement findLocatorByClassName(String value) {
		WebElement element= driver.findElement(By.className(value));
		return element;
	}
	
	public WebElement findLocatorByLinkText(String value) {
		WebElement element=driver.findElement(By.linkText(value));
		return element;
	}
	
	public WebElement findLocatorByPartialText(String value) {
		WebElement element=driver.findElement(By.partialLinkText(value));
		return element;
	}
	
	public WebElement findLocatorByXpath(String value) {
		WebElement element=driver.findElement(By.xpath(value));
		return element;
	}
	
	public WebElement findLocatorByCssSelector(String value) {
		WebElement element=driver.findElement(By.cssSelector(value));
		return element;
	}
	
	public void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public String getText(WebElement element) {
		String text=element.getText();
		return text;
	}

	public String getTitle() {
	 String text=driver.getTitle();
	 return text;
	}
	
	public String getCurrentUrl() {
		String text=driver.getCurrentUrl();
		return text;
	}
	
	public void selectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByVisibleText(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	
	public void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void frameById(String value) {
		driver.switchTo().frame(value);
	}
	
	public void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public boolean isDisplayed(WebElement element) {
		boolean BooleanValue= element.isDisplayed();
		return BooleanValue;
	}
	
	public boolean isEnabled(WebElement element) {
		boolean BooleanValue= element.isEnabled();
		return BooleanValue;
	}
	
	public boolean isSelected(WebElement element) {
		boolean BooleanValue= element.isSelected();
		return BooleanValue;
	}
	
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	
	public Set<String> getWindowHandles() {
	       Set<String>childWindow=driver.getWindowHandles();
		return childWindow;   	
	}
	
	public void doubleClick(WebElement element) {
		Actions action=new Actions(driver);
	       action.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions action=new Actions(driver);
		action.dragAndDrop(element2, element1).perform();
	}
	
	public void mouseHover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void contextClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	public String getAttributeValue(WebElement element,String value) {
		String attributeValue=element.getAttribute(value);
		return attributeValue ;
	}
	public void scroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true);", element);
	}
	
	public void elementSendkeysJS(WebElement element,String data) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value',"+ data+")",element);
	}
	public void javaExecutorClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();",element);
	}
	public String readValueFromExcel(String sheetName,int rownum,int cellnum) throws IOException {
		String res="";
		File file = new File (System.getProperty("user.dir")+"\\Data\\HotelDataDetails.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType ) {
		case STRING:
		res = cell.getStringCellValue();
		break;
		case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
		java.util.Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		res = dateformat.format(dateCellValue);
		}else {
		double numericcellvalue = cell.getNumericCellValue();
		long check = Math.round(numericcellvalue);
		if (check==numericcellvalue) {
		res=String.valueOf(check);
		} else {
		res=String.valueOf(numericcellvalue);
		}
		}
		default:
		break;
		}
		return res;
		}
	
    public void writeDataCell(String SheetName, int rowIndex, int columnIndex,String data) throws IOException {
    	File file=new File(System.getProperty("user.dir")+"\\Data\\HotelDataDetails.xlsx");
    	FileInputStream fileInputStream=new FileInputStream(file);
    	Workbook wb=new XSSFWorkbook(fileInputStream);
    	Sheet sh=wb.getSheet(SheetName);
    	Row row=sh.getRow(rowIndex);
    	Cell cell=row.createCell(columnIndex);
    	cell.setCellValue(data);
    	FileOutputStream fileOutputStream=new FileOutputStream(file);
    	wb.write(fileOutputStream);	
    }
    
    public void updateDataCell(String SheetName, int rowIndex, int columnIndex,String oldData, String newData) throws IOException {
    	File file=new File(System.getProperty("user.dir")+"\\Data\\HotelDataDetails.xlsx");
    	FileInputStream fileInputStream=new FileInputStream(file);
    	Workbook wb=new XSSFWorkbook(fileInputStream);
    	Sheet sh=wb.getSheet(SheetName);
    	Row row=sh.getRow(rowIndex);
    	Cell cell=row.getCell(columnIndex);
    	String stringCellValue = cell.getStringCellValue();
    	if(stringCellValue.equals(oldData)) {
    	cell.setCellValue(newData);
    	}
    	FileOutputStream fileOutputStream=new FileOutputStream(file);
    	wb.write(fileOutputStream);	
    }
    
    public byte[] screenshot() {
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;	
    }
    public static String getValueFromPropertyFile(String key) throws FileNotFoundException, IOException {
    	Properties properties=new Properties();
    	properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Config\\config.properties"));
    	String value= (String)properties.get(key);
		return value;
    }
	public void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	

}
