package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppSearch {
	WebDriver driver;
	@Before("@SmokeTest")
	public void setDriver() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String url=driver.getCurrentUrl();
	    Assert.assertEquals(url,"https://adactinhotelapp.com/");
	}

	@When("I enter username {string}")
	public void i_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
		System.out.println(string);
	}

	@When("I enter password {string}")
	public void i_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("I am logged in successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I enter Location {string}")
	public void i_enter_location(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location=driver.findElement(By.id("location"));
		Select select=new Select(location);
		select.selectByVisibleText(string);
	}

	@When("I enter Hotel name {string}")
	public void i_enter_hotel_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement hotel=driver.findElement(By.id("hotels"));
		Select select=new Select(hotel);
		select.selectByVisibleText(string);
	}

	@When("I enter Room Type {string}")
	public void i_enter_room_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement RoomType=driver.findElement(By.id("room_type"));
		Select select=new Select(RoomType);
		select.selectByVisibleText(string);
	}

	@When("I click on Search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Submit")).click();
	}

	/*@Then("I have search is successfully")
	public void i_have_search_is_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}*/
	/*@After
	public void details() {
		driver.quit();
	}*/
}
