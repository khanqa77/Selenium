package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon 
{
	
			public static void main(String[] args) 
			{
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.amazon.com");
				driver.close();
				

			}
						
			
			

}
