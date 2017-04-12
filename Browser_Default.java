package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Default 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com");
		d.navigate().to("http://www.facebook.com");
		System.out.println(".....The Title of the Current Page is ....."+d.getTitle());
		d.findElement(By.id("email")).sendKeys("demo123@gmail.com");
		d.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(5000);
		d.findElement(By.id("u_0_q")).click();
		d.close();
	}

}
