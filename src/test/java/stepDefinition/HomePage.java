package stepDefinition;


import java.util.List;
import java.util.Map;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
     WebDriver driver;
	
	@Given("user is on the fb login page")
	public void user_is_on_the_fb_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("user enters the fb username and password")
	public void user_enters_the_fb_username_and_password(DataTable table) {
	
   
		List<Map<String, String>> asMaps = table.asMaps();
		
		Map<String, String> map = asMaps.get(0);
		
		String user = map.get("username");
		
		String pass = map.get("password");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	   
	}

	@When("user clicks the fb login button")
	public void user_clicks_the_fb_login_button() {
	   
	}

	@Then("user is on the fb home page")
	public void user_is_on_the_fb_home_page() {
	  
	}

}
