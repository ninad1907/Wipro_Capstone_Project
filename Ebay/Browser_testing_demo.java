package cross_browser_testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Browser_testing_demo {
	WebDriver driver;
	@BeforeTest//1(primary condition)
	  public void beforeTest() throws InterruptedException {

			Thread.sleep(2000);

}

  @Test
  public void chromeBrowser() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	  driver.close();
  }
  
  @Test
  public void firefoxBrowser() throws InterruptedException
  {
	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	  driver.close();

  }
  
  @Test
  public void edgeBrowser() throws InterruptedException
  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\owner\\OneDrive\\Desktop\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
