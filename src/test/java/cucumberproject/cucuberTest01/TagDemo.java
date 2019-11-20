package cucumberproject.cucuberTest01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TagDemo {
	@Given("User is testing for the login functionality")
	public void user_is_testing_for_the_login_functionality() {
	    System.out.println("Login!!");
	}

	@Then("User able to login successfully")
	public void user_able_to_login_successfully() {
	   System.out.println("Login successful !!"); 
	}

	@Given("User is testing the search functionality")
	public void user_is_testing_the_search_functionality() {
	 System.out.println("search for a product"); 
	}

	@Then("search works successfully")
	public void search_works_successfully() {
	System.out.println("search is successful !!");    
	}

	@Given("{string} is the tester on the testme app")
	public void is_the_tester_on_the_testme_app(String string) {
	System.out.println("Rishika is the tester on the testme app");   
	}
}
