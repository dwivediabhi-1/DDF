package apps.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

	@FindBy(xpath = "//*[@id='enter']")
	WebElement acceptmodal;
	
	@FindBy(xpath = "//*[@id='header-top']/div/div/div[3]/ul/li[2]/div")
	WebElement MyAccountButton;
	
	@FindBy(xpath = "(//input[@id='email'])[2]")
	WebElement loginemail;
	
	@FindBy(xpath = "(//input[@id='pass'])[2]")
	WebElement loginpassword;
	
	@FindBy(xpath = "(//button[@id='send2'])[1]")
	WebElement signinbutton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			//initializes all the elements
	}
	
	public void clickonmodal()
	{
		if(acceptmodal.isDisplayed()==true)
		{
			acceptmodal.click();
		}	
	}
	
	public void clickonmyaccounts() {
		MyAccountButton.click();
	}
	
	public void setloginEmail(String email) {
		loginemail.sendKeys(email);
	}
	
	public void setloginPass(String password) {
		loginpassword.sendKeys(password);
	}
	
	public void clickonSingnIn() {
		signinbutton.click();
	}
	
}
