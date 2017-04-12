package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://espncricinfo.com/england-v-pakistan-2016/engine/match/913641.html");
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.className("batting-table innings"));
	List <WebElement>	noofrows=table.findElements(By.tagName("tr"));
	System.out.println(noofrows.size());
	
	}

}
