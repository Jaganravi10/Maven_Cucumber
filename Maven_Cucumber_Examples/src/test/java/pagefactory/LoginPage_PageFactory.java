package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	@FindBy(linkText = "/login")
	WebElement txt_signuploginbutton;
	
	@FindBy(name = "email")
	WebElement txt_emailaddressfield;
	
	@FindBy(name = "password")
	WebElement txt_passwordfield;
	
	@FindBy(className = "btn btn-default")
	WebElement txt_loginbuttonfield;
	
	WebDriver driver;
	
	public LoginPage_PageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage_PageFactory.class);
	}
	
	public void clickSignupLogin() {
		txt_signuploginbutton.click();
	}
	
	public void emailAddressField(String userName) {
		txt_emailaddressfield.sendKeys(userName);
	}
	
	public void passwordField(String password) {
		txt_passwordfield.sendKeys(password);
	}
	
	public void loginButton() {
		txt_loginbuttonfield.click();
	}
	
	
	
}
