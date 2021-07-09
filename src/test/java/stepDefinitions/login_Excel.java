//package stepDefinitions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class login_Excel {
//
//    public static WebDriver driver;
//
//    @Given("I have opened the browser")
//    public void i_have_opened_the_browser() {
//
//        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver");
//        driver= new ChromeDriver();
//
//    }
//
//    @Given("User is on the stage site with login screen")
//    public void user_is_on_the_stage_site_with_login_screen() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.get("https://dev-54ta5gq-whlhb3bjsmuos.us-2.platformsh.site");
//    }
//
//
//
//
//    @When("I am doing a click on the login button")
//    public void i_am_doing_a_click_on_the_login_button() {
//        driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
//    }
//
//
//    @Then("I get redirected to the same page of the site with validations")
//    public void i_get_redirected_to_the_same_page_of_the_site_with_validations() {
//        System.out.println("test");
//    }
//
//    @Then("Close the browser")
//    public void close_the_browser() {
//        driver.close();
//    }
//
//}