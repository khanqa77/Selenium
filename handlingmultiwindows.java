package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingmultiwindows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());//gives title
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();//clicks on learn more
		Set<String>ids = driver.getWindowHandles();// all window ids are kept on to ids
		Iterator<String>it=ids.iterator();//
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
	}

}
