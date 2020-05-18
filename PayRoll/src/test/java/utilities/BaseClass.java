package utilities;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseClass {
  public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Gopika\\drivers\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().setSize(new Dimension(1600, 1200));
  driver.get("https://www.qabible.in/payrollapp/site/login");
  }

  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}
