package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	
	WebDriver driver;
@Given("user is on Home Page")
public void user_is_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
   driver=new ChromeDriver();
   System.out.println("User is on home page..");
   driver.get("https://www.rediff.com/");
   driver.findElement(By.linkText("Sign in")).click();
}
@When("user clicks Sign in link check title")
public void user_clicks_sign_in_link_check_title() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Click on Sign in link");
	String title=driver.getTitle();
	System.out.println("Title="+title);
	Assert.assertEquals(title, "Rediffmail");
}
@Then("user enters user Name")
public void user_enters_user_name() {
	
	driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
  
}
@Then("Password")
public void password() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("password")).sendKeys("arpana123");
	   
   driver.findElement(By.id("remember")).click();
}
@Then("clicks on submit button")
public void clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.name("proceed")).click();
}
@Then("check login successful and display message Login")
public void check_login_successful_and_display_message_login() {
    // Write code here that turns the phrase above into concrete actions
 System.out.println("Login Successful...");
 driver.quit();
}



}
