package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumberproject.cucuberTest01.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	@Given("User has launched testme app in the browser")
	public void user_has_launched_testme_app_in_the_browser() {
		driver = UtilityClass.openBrowser("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("string");
		  driver.findElement(By.name("password")).sendKeys("string2");

	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		  driver.findElement(By.name("Login")).click();

	}

	@Then("User must be logged in successfully")
	public void user_must_be_logged_in_successfully() {
	 Assert.assertEquals("Home", driver.getTitle()); 
	}

}
