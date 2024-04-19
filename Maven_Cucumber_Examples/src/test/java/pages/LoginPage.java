//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage {
//	
//	protected WebDriver driver;
//
//	private By txt_signup_login = By.xpath("//*[@href='/login']");
//	private By txt_username = By.xpath("//*[@placeholder='Email Address']");
//	private	By txt_passsword = By.xpath("//input[@name='password']");
//	private	By btn_login = By.xpath("(//button[@type='submit']) [1]");
//	private	By btn_logout = By.xpath("//*[@href='/logout']");
//	
//	public LoginPage(WebDriver driver){
//		this.driver = driver;
//	}
//	
//	public void signUpLogin() {
//		
//		driver.findElement(txt_signup_login).click();
//	}
//	
//	public void enterUsername(String actualUsername) {
//		
//		driver.findElement(txt_username).sendKeys(actualUsername);	
//	}
//	
//	public void enterPassword(String actualPassword) {
//		
//		driver.findElement(txt_passsword).sendKeys(actualPassword);	
//	}
//	
//	public void clickLogin() {
//		
//		driver.findElement(btn_login).click();	
//	}
//	
//	public void checkLogoutIsDisplayed() {
//		
//		driver.findElement(btn_logout).isDisplayed();	
//	}
//	
//	public void loginValidUser(String actualUsername, String actualPassword) {
//		
//		driver.findElement(txt_signup_login).click();
//		driver.findElement(txt_username).sendKeys(actualUsername);	
//		driver.findElement(txt_passsword).sendKeys(actualPassword);
//		driver.findElement(btn_login).click();	
//		
//	}
//	
//}
