package cucumberproject.cucuberTest01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepFeatures {
	String str;
	@Given("type hello world")
	public void type_hello_world() throws Throwable {
	  str="hello world" ;
	   
	}

	@When("execute the code")
	public void execute_the_code()  throws Throwable  {
	    System.out.println(str);
	}

	@Then("hello world must be displayed in the console")
	public void hello_world_must_be_displayed_in_the_console()  throws Throwable  {
	   System.out.println("Displayed successfully");
	}
}
