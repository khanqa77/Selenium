/**
 * 
 */
package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author HARISH
 *
 */
public class countoflinksinapage {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://ebay.com");
//gives the count of links from the web page
System.out.println(driver.findElements(By.tagName("a")).size());
//gives the count of the links from footer
WebElement footer=driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
System.out.println(footer.findElements(By.tagName("a")).size());
//limit the links to second column and find the size of it
WebElement seccol =driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
System.out.println(seccol.findElements(By.tagName("a")).size());
//getting text of the links in sec colounm
int i=0;

while(i<seccol.findElements(By.tagName("a")).size())
{
	
	if(seccol.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
	{
		System.out.println(i);
		System.out.println(seccol.findElements(By.tagName("a")).get(i).getText());
		System.out.println(driver.getTitle());
		seccol.findElements(By.tagName("a")).get(i).click();
		break;
		
	}
	i++;
	
}
System.out.println(driver.getTitle());

	}

}
