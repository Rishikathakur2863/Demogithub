package cucumberproject.cucuberTest01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bgDef {
	int a,b,s,p;
	@Given("User must enter input values")
	public void user_must_enter_input_values()  {
	 System.out.println("User enters the input");
	 a=10;
	 b=20;
	}

	@Then("Assign the values to variables a & b")
	public void assign_the_values_to_variables_a_b()  {
	 System.out.println(a+" "+b);   
	}

	@When("add two input")
	public void add_two_input()  {
	    s=a+b;
	}

	@Then("display the sum")
	public void display_the_sum()  {
	   System.out.println("Sum is"+s);
	}

	@When("multiply two numbers")
	public void multiply_two_numbers()   {
	  p=a*b;
	}

	@Then("display the product")
	public void display_the_product()  {
	  System.out.println("product is"+p);
	}
}
