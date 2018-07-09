package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class QAAutomationSteps {
	
	
	WebDriver driver;
	
	
	@Given("^that the user has navigated to the Web Application URL$")
	public void that_the_user_has_navigated_to_the_Web_Application_URL() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.valtech.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("^title of the page is titled Where Experiences are Engineered - Valtech$")
	public void title_of_the_page_is_titled_Where_Experiences_are_Engineered_Valtech() {
	    
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		Assert.assertEquals("Where Experiences are Engineered - Valtech", title);
	}

	@Then("^the section at the bottom called Latest News should be displayed$")
	public void the_section_at_the_bottom_called_Latest_News_should_be_displayed() {
	    
		WebElement latestNewsSection = driver.findElement(By.cssSelector("#container > div:nth-child(2) > div:nth-child(3) > div.news-post__listing-header > header > h2"));
		boolean flag = latestNewsSection.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Then("^user clicks on the About link$")
	public void user_clicks_on_the_About_link()  {
	    
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[1]/a/span")).click();
	}
	
	
	@Then("^the user clicks on the our officies link$")
	public void the_user_clicks_on_the_our_officies_link()  {
	    
		driver.findElement(By.xpath("//a[contains(text(),'Our offices')]")).click();
	}
	
	
	
	
	

	@Then("^the total number of offices is displayed$")
	public void the_total_number_of_offices_is_displayed() {
	    
		List<WebElement> totalOffficeCount = driver.findElements(By.xpath("//img['@680&format=jpg']"));
		System.out.println("Total number of offices is " + totalOffficeCount.size());
	}
	
	
	@Then("^the user clicks on Services link and verifies the header$")
	public void the_user_clicks_on_services_link_and_verifies_the_header() {
		
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[3]/a/span")).click();
		WebElement header_text = driver.findElement(By.tagName("h1"));
		System.out.println(header_text.getText());
		
	}
	
	
	
	
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		
		driver.close();
		driver.quit();
	}
	
	
	
	

}
