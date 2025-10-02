package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {
    WebDriver driver;

    @Given("I open Google")
    public void i_open_google() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String keyword) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }

    @Then("I should see results")
    public void i_should_see_results() {
        boolean resultsExist = driver.getPageSource().contains("OpenAI");
        assert resultsExist;
        driver.quit();
    }
}
