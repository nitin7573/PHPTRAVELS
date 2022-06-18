package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//div[@class='form-group']//input[@type='email']")
	private WebElement usernameBox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passBox;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login (String user, String pass) {
		
		usernameBox.sendKeys(user);
		passBox.sendKeys(pass);
		loginButton.click();
	}
}
