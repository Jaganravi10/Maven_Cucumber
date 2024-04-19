package stepdefinitions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import pages.LoginPage;
//
//public class LoginDemoSteps {
//
//	WebDriver driver = new ChromeDriver();
//	LoginPage login;
//
//	@Given("browser opened")
//	public void browser_opened() {
//
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://www.automationexercise.com/");
//	}
//
//	@When("^user enters valid (.*) and (.*)$")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		
//		login = new LoginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
////		driver.findElement(By.xpath("//*[@href='/login']")).click();
////		WebElement emailAddress = driver.findElement(By.xpath("(//input[@name='email']) [1]"));
////		emailAddress.sendKeys(username);
////		WebElement accountPassword = driver.findElement(By.xpath("//input[@name='password']"));
////		accountPassword.sendKeys(password);
//
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		
//		login.clickLogin();
//		
////		driver.findElement(By.xpath("(//button[@type='submit']) [1]")).click();
//	}
//
//	@Then("user navigated to the home page")
//	public void user_navigated_to_the_home_page() {
//		
//		login.checkLogoutIsDisplayed();
//		
////		String pageSource = driver.getTitle();
////		System.out.println(pageSource);
//
//	}
//
//}
