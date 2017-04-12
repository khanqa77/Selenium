package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class miscillenous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).click();
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("jashwant@gmail.com");
		driver.findElement(By.xpath(".//*[@id='m_rtxtPassword']")).click();
		driver.findElement(By.xpath(".//*[@id='m_rtxtPassword']")).sendKeys("jas@hwnat");
	
	Select si = new Select(driver.findElement(By.xpath(".//*[@id='m_selDate']")));
	si.selectByIndex(5);
	Select s1 = new Select(driver.findElement(By.xpath(".//*[@id='m_selMonth']")));
	s1.selectByIndex(2);
	Select s2 = new Select(driver.findElement(By.xpath(".//*[@id='m_selYear']")));
	s2.selectByValue("1990");
	driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[6]/p")).click();
	driver.findElement(By.xpath(".//*[@id='registerClick']")).click();
		
		

	}

}
