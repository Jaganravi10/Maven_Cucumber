package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

	WebDriver driver = new ChromeDriver();

	@Given("browser opened")
	public void browser_opened() {

		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://www.automationexercise.com/");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		WebElement emailAddress = driver.findElement(By.xpath("(//input[@name='email']) [1]"));
		emailAddress.sendKeys("mytest@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Test@123");

	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("(//button[@type='submit']) [1]")).click();
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		String pageSource = driver.getTitle();
		System.out.println(pageSource);

	}

}
