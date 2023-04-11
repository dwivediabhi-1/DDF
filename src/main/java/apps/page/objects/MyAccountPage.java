
package apps.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/h1/span")
	WebElement MyAccountLanding;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			//initializes all the elements
	}
	
	public String getLandingPageText() {
		String landingpagetext=MyAccountLanding.getText();
		return landingpagetext;
	}

}
