package cucumberproject.cucuberTest01;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class dtTableStep {
	@Given("open the application and land up in the search page")
	public void open_the_application_and_land_up_in_the_search_page() {
		System.out.println("User is in Search Page !!");

	}

	@When("type the below products and search for it")
	public void type_the_below_products_and_search_for_it(DataTable dataTable) {
		List<Map<String, String>>list=dataTable.asMaps(String.class, String.class);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Search for "+list.get(i).get("Products"));
		}
	}

	@Then("ensure that the products detail is dispalyed")
	public void ensure_that_the_products_detail_is_dispalyed() {
		System.out.println("User is able to view the details");

	}
}
