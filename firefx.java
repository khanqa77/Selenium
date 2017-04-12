package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefx {
static String whichbrowser;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

	driver.get("http://www.gmail.com");
	
	/*
	 System.out.println(driver.getCurrentUrl());*///used when there is deviation from the norms//
	
	/*
	System.out.println(driver.getTitle());//title of the page is displayed//
	*/
	System.out.println(driver.getPageSource());//displays the view of source code//
	

	
	
	
		
	} 
	
		
	}


