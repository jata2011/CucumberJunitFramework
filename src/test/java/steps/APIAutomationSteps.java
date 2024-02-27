package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.*;


public class APIAutomationSteps {

    private static Response response;
    private String requestBodyCreate;
    private int petId;


    @Given("I have a PET with name {string}")
    public void i_have_a_pet_with_name(String petName) {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Build a Request payload for creation
        requestBodyCreate = "{\"id\": 1234321, \"name\": \"" + petName + "\", \"status\": \"available\"}";
    }
    @When("I create the PET")
    public void i_create_the_pet() {
        // Send the POST request to create a new pet
        response = RestAssured.given()
                .contentType("application/json")
                .body(requestBodyCreate)
                .post("/pet");

    }
    @Then("the PET is created successfully")
    public void the_pet_is_created_successfully() {

        //Fetch PetID
        petId = response.then().extract().path("id");
        assertEquals(200, response.getStatusCode());

    }
    @When("I update the PET name to {string}")
    public void i_update_the_pet_name_to(String newPetName) {

        // Build the request payload for update
        String requestBodyUpdate = "{\"id\": " + petId + ", \"name\": \"" + newPetName + "\", \"status\": \"available\"}";

        // Send the PUT request to update the pet name
        response = RestAssured.given()
                .contentType("application/json")
                .body(requestBodyUpdate)
                .put("/pet");

    }
    @Then("Pet is updated to {string}")
    public void pet_is_updated_to(String newPetName) {

        String responseBody = response.getBody().asString();
        assertTrue(responseBody.contains(newPetName));


    }
    @When("I delete the PET")
    public void i_delete_the_pet() {

        // Send the DELETE request to delete the pet
        response = RestAssured.delete("/pet/" + petId);

    }

    @Then("the PET is deleted successfully with status code {int}")
    public void the_pet_is_deleted_successfully_with_status_code(int expectedStatusCode) {

        // Verify that the response status code is 200 (OK)
        assertEquals(expectedStatusCode, response.getStatusCode());

    }


}
