package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class login {

    public static WebDriver driver;

    @Given("I have opened the browser")
    public void i_have_opened_the_browser() {

        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver");
        driver= new ChromeDriver();

    }

    @Given("User is on the stage site with login screen")
    public void user_is_on_the_stage_site_with_login_screen() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("https://dev-54ta5gq-whlhb3bjsmuos.us-2.platformsh.site");
    }

    @When("User enters correct credentials with data in excel at {string}")
    public void user_enters_correct_credentials_with_data_in_excel_at(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello");
    }


// @When("I entering correct {string} and I enter correct {string}")
// public void i_entering_correct_username_and_i_enter_correct_password(String username, String password) throws InterruptedException {
// Thread.sleep(5000);
// driver.findElement(By.xpath("//input[@id=\"edit-name\"]")).clear();
// Thread.sleep(2000);
// driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(username);
// Thread.sleep(3000);
// driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(password);
// }

//    @When("I entering correct username and I enter correct password")
//    public void i_entering_correct_username_and_i_enter_correct_password(DataTable table) throws InterruptedException {
//
////Solution 4
////        List<List<String>> lists = table.asLists(String.class);
////        for (List<String> list: lists){
//////            System.out.println(list.get(0).get);
////             driver.findElement(By.name(list.get(0))).sendKeys(list.get(0));
////        }
//
//
//
////Solution 3
//        List<List<String>> data = table.asLists(String.class);
////        String buildingName = data.get(0).get(0);
////      String reference = data.get(1).get(1);
//        System.out.println();
//        System.out.println(data);
//        System.out.println();
//        driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//// System.out.println(buildingName);
//// System.out.println(reference);
//
////Solution 2
//// table.asList();
//// List<String> dtTable = table.asList(String.class);
//// driver.findElement(By.id("username").sendKeys(table.get(0).get(0)));
//// driver.findElement(By.id("username")).sendKeys(dtTable.get(0));
//// driver.findElement(By.id("password")).sendKeys(dtTable.get(1));
//
//
//// Solution 1
//// Thread.sleep(5000);
//// driver.findElement(By.xpath("//input[@id=\"edit-name\"]")).clear();
//// Thread.sleep(2000);
//// driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(credentials.asList().get());
//// Thread.sleep(3000);
//// driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(password);
//
//    }

    @When("I am doing a click on the login button")
    public void i_am_doing_a_click_on_the_login_button() {
        driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
    }


    @Then("I get redirected to the same page of the site with validations")
    public void i_get_redirected_to_the_same_page_of_the_site_with_validations() {
        System.out.println("test");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
