package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame(1);
driver.findElement(By.cssSelector("//input[@class='input_password']")).sendKeys("jashwant");


	}

}
