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
	
	
<<<<<<< HEAD
	
	
	@Then("^user clicks on the About link and verifies that the H(\\d+) tag is displayed$")
	public void user_clicks_on_the_About_link_and_verifies_that_the_H_tag_is_displayed(int arg1) {
	    
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[1]/a/span")).click();
		WebElement about_header = driver.findElement(By.tagName("h1"));
		System.out.println("The header tag for about page is " + about_header.getText());
	}
	
	
	@Then("^the user clicks on Work link and verifies that the H(\\d+) tag is displayed$")
	public void the_user_clicks_on_Work_link_and_verifies_that_the_H_tag_is_displayed(int arg1) {
		
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[2]/a/span")).click();
		WebElement work_header = driver.findElement(By.tagName("h1"));
		System.out.println("The header tag for work screen is " + work_header.getText());
	   
=======
	@Then("^user clicks on the About link$")
	public void user_clicks_on_the_About_link()  {
	    
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[1]/a/span")).click();
	}
	
	
	@Then("^the user clicks on the our officies link$")
	public void the_user_clicks_on_the_our_officies_link()  {
	    
		driver.findElement(By.xpath("//a[contains(text(),'Our offices')]")).click();
>>>>>>> e3b3edf546b99e3d8077c00b03ada6ffc92f195d
	}
	
	
	
	
	
<<<<<<< HEAD
	
	@Then("^the user clicks on the Services link and verifies that the H(\\d+) tag is displayed$")
	public void the_user_clicks_on_the_Services_link_and_verifies_that_the_H_tag_is_displayed(int arg1)  {
		
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[3]/a/span")).click();
		WebElement services_header = driver.findElement(By.tagName("h1"));
		System.out.println("The header tag for services page is " + services_header.getText());
	}

=======

	@Then("^the total number of offices is displayed$")
	public void the_total_number_of_offices_is_displayed() {
	    
		List<WebElement> totalOffficeCount = driver.findElements(By.xpath("//img['@680&format=jpg']"));
		System.out.println("Total number of offices is " + totalOffficeCount.size());
	}
>>>>>>> e3b3edf546b99e3d8077c00b03ada6ffc92f195d
	
	
	@Then("^the user clicks on Services link and verify the header$")
	public void the_user_clicks_on_services_link_and_verify_the_header() {
		
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[3]/a/span")).click();
		WebElement header_text = driver.findElement(By.tagName("h1"));
		System.out.println(header_text.getText());
		
	}
	
	
<<<<<<< HEAD
	@Then("^the user goes to the contact page and verifies the total location count$")
	public void the_user_goes_to_the_contact_page_and_verifies_the_total_location_count() {
		
		driver.findElement(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Our offices')]")).click();
		List<WebElement> totalOffficeCount = driver.findElements(By.xpath("//img['@680&format=jpg']"));
		System.out.println("Total number of offices is " + totalOffficeCount.size());
	}
	
	
=======
>>>>>>> e3b3edf546b99e3d8077c00b03ada6ffc92f195d
	
	
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		
		driver.close();
		driver.quit();
	}
	
	
	
	

}
