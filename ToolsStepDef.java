import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolsStepDef {
    @Given("user is on Home page")
    public void userIsOnHomePage() {
    }

    @And("user haven't registered")
    public void userHavenTRegistered() {
    }

    @When("user click {string} menu")
    public void userClickMenu(String arg0) {
        System.out.println("click Tools");
    }

    @Then("user can get list from {string} menu")
    public void userCanGetListFromMenu(String arg0) {
    }

    @Then("user get redirected to {string} page")
    public void userGetRedirectedToPage(String arg0) {
    }
}
