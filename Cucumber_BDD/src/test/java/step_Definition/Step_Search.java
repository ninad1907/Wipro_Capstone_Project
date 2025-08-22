package step_Definition;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Search {
//	WebDriver driver;
//	@Given("Search page should open in default browser")
//	public void search_page_should_open_in_default_browser() {
//		 	driver=new ChromeDriver();
//		    driver.get("https://www.ebay.com/");
//		    driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//
//	@When("Click on search box")
//	public void click_on_search_box() {
//
//		driver.findElement(By.cssSelector("input[title=\"Search\"]")).click();
//	}
//
//	@And("search for a product")
//	public void search_for_a_product() throws InterruptedException {
//			  WebElement search=driver.findElement(By.id("gh-ac"));
//			  search.clear();
//			  search.sendKeys("Sports");
//		}
//
//	@And("click on search button")
//	public void click_on_search_button() {
//	    driver.findElement(By.id("gh-search-btn")).click();
//	}
//
//	@Then("open the searched product")
//	public void open_the_searched_product() {
//	   System.out.println("Searched successfully");
//	   driver.close();
//	}
//
	
	WebDriver driver;

	@Given("Search page should open in default browser")
	public void search_page_should_open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("Click on search box")
	public void click_on_search_box() {
		driver.findElement(By.cssSelector("input[title=\"Search\"]")).click();
	}

	@When("^search for multiple (.*)$")
	public void search_for_multiple_products(String products) {
		  WebElement search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys(products);
	}

	@When("click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("gh-search-btn")).click();
	}

	@Then("open the searched product")
	public void open_the_searched_product() {
		   System.out.println("Searched successfully");
		   driver.close();
	}



}


