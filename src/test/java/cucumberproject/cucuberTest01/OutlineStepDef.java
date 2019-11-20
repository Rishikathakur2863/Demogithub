package cucumberproject.cucuberTest01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutlineStepDef {
	String arg1,arg2;
	@Given("user must be in the login page")
	public void user_must_be_in_the_login_page() {
	System.out.println("User is in the login page"); 
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	   System.out.println("Login using "+arg1+" and "+arg2);
	}

	@When("performs login")
	public void performs_login() {
	  System.out.println("click on the login button");  
	}

	@Then("User must be in home page")
	public void user_must_be_in_home_page() {
	  System.out.println("User is in the home page");
	  System.out.println("******************************"); 
	}
}
