package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("jas_epuri@yahoo.in");//used xpath//
		driver.findElement(By.id("pass")).sendKeys("XXXXXX");// used id//
		driver.findElement(By.id("u_0_o")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forg")).click();
		
		
	
	}

}
