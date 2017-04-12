package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locater3 {

	public static void main(String[] args) throws InterruptedException {
		// customizing xpath
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jashwantepuri");
		driver.findElement(By.cssSelector("input[id='next']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input[id='Passwd']")).sendKeys("jashwant123");
		driver.findElement(By.cssSelector("#Passwd")).sendKeys("jashwant123");
		driver.findElement(By.cssSelector("input[id= 'signIn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#gbqfq")).click();
		driver.findElement(By.cssSelector("#gbqfq")).sendKeys("ramakrisha");
		driver.findElement(By.cssSelector("#gbqfb")).click();
		
		
		
		

	}

}
