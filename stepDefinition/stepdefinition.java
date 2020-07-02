package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	
	ChromeDriver driver;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kapilan\\Desktop\\Maven\\MavenProject\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	}

	@Given("^Open the page URL as \"([^\"]*)\"$")
	public void open_the_page_URL_as(String arg1) {
		driver.get(arg1);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@When("^User login into application with username as (.+) and password as (.+)$")
	public void user_login_into_application_with_username_as_and_password_as(String username, String password) {
		driver.findElementById("email").sendKeys(username);
		driver.findElementById("pass").sendKeys(password);
	}

	@Then("^Click on the login button$")
	public void click_on_the_login_button() {
		driver.findElementByXPath("//*[@type=\"submit\"]").click();
	}

	@Then("^Get the title of the page$")
	public void get_the_title_of_the_page() {
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}
	
}
