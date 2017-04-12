package basic;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG6 {

	public static void main(String[] args) {
      String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
      System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();

      driver.get(baseUrl);
      //click on the "Facebook" logo on the upper left portion
      driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

      //verify that we are now back on Facebook's homepage
      if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
          System.out.println("We are back at Facebook's homepage");
      } else {
          System.out.println("We are NOT in Facebook's homepage");
      }
      driver.close();
  }
}