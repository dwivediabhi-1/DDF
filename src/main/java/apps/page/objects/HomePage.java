package apps.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

	@FindBy(xpath = "//*[@id='header-top']/div/div/div[2]/a")
	WebElement homebuttonlogo;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			//initializes all the elements
	}
	
	public void clickhomebuttonlogo()
	{
		if(homebuttonlogo.isDisplayed()==true)
		{
			homebuttonlogo.click();
		}	
	}
	
		
}
