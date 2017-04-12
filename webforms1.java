package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webforms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights");
		driver.findElement(By.xpath(".//*[@id='htmlDoc']/body/div[12]/div/a[1]")).click();
		System.out.println("before clicking the multicity rd button");
		System.out.println(driver.findElement(By.cssSelector("#return_date_sec")).isDisplayed());
		System.out.println("after clicking the multicity rd button");
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println(driver.findElement(By.cssSelector("#return_date_sec")).isDisplayed());

		
		
		
		

	}

}
