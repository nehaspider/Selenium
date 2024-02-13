package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	//constructor
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement logiButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLogiButton() {
		return logiButton;
	}
	
	

}
