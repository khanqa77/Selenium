package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class accessform {
public static void main(String[] args) { 
// declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);
		// Enter value into textbox
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		// Delete value from textbox
        driver.findElement(By.name("userName")).clear();
		// Access Links
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.partialLinkText("here")).click();
		// Enter value into textbox and SUBMIT
		driver.findElement(By.name("userName")).sendKeys ("tutorial");
        driver.findElement(By.name("password")).sendKeys ("tutorial");
        driver.findElement(By.name("password")).submit();
		// Select Radio Button
        driver.findElement(By.cssSelector("input[value='Business']")).click();

		//Select CheckBox
		String baseURL = "http://demo.guru99.com/selenium/facebook.html";
	    driver.get(baseURL);
		WebElement CkEFEBPersist = driver.findElement(By.id("persist_box"));
			for (int i=0; i<2; i++) {
				CkEFEBPersist.click(); 
				System.out.println(CkEFEBPersist.isSelected());
			}

}
}