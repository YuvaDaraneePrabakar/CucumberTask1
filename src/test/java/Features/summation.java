package Features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class summation {
	
    private int r1, r2, r3;
    private String expectedResult;

    @Given("My data is ready")
    public void myDataIsReady() {
        // No action needed for this step as data is already set in the examples table
    }

    @When("My data is {int}, {int}, {int}")
    public void myDataIs(int r1, int r2, int r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Then("My data is {string}")
    public void myDataIsValid(String valid) {
        int sum = r1 + r2;
        expectedResult = (valid.equals("valid") && sum == r3) || (valid.equals("invalid") && sum != r3) ? "The given summation data is valid" : "The given summation data is invalid";
        System.out.println(expectedResult);// You can add assertion or logging here based on your testing framework or requirements
    }
}
