package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://amazon.com");
	Actions abc =new Actions(driver);
	Thread.sleep(3000);
	abc.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"))).build().perform();
	WebElement xyz = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
	abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("necklace").build().perform();
	
	}

}
