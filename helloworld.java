package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class helloworld {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\HARISH\\Desktop\\ChromeDriver.exe" );//working with chrome//
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
			System.out.println(driver.getPageSource());*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HARISH\\Desktop\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://fb.com");
		System.out.println(driver.getCurrentUrl());
		if ()


	}

}
