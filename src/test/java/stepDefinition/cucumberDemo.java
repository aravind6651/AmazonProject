package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberDemo {
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
	}

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		
		driver.findElement(By.xpath("")).sendKeys();
		driver.findElement(By.xpath("")).sendKeys();
	   
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	   
		driver.findElement(By.xpath("")).click();
	}

	@Then("user is on the home page")
	public void use_is_on_the_home_page() {
		
		System.out.println(driver.getTitle());
		driver.close();
	   
	}

}
