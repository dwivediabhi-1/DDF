package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import apps.common.lib.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseClass {

	public static BaseClass baseClass;
	Map<String, Map<String, String>> excelData;

	public LoginTest() {
		super();
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Exception {
		baseClass = new BaseClass();
		baseClass.openbrowser("chrome");
		excelData = excelutility.getExcelAsMap("Login");
		baseClass.implicitWait();
		baseClass.openUrl();
		loginpage.clickonmodal();
		Thread.sleep(3000);
	}

	@When("User Click on My Account button")
	public void user_click_on_my_account_button() throws InterruptedException {
		loginpage.clickonmyaccounts();
		Thread.sleep(3000);
	}

	@When("Enters the UserId and Password")
	public void enters_the_user_id_and_password() throws Exception {
		//String username = excelutility.getCellData("Login", "Username", 2);
		String username = excelData.get("1").get("Username");
		//String password = excelutility.getCellData("Login", "Password", 2);
		String password = excelData.get("1").get("Password");
		
		loginpage.setloginEmail(username);
		loginpage.setloginPass(password);
	}

	@When("clicks Login button")
	public void clicks_login_button() {
		loginpage.clickonSingnIn();
	}

	@Then("He Lands on My Account Page")
	public void he_lands_on_my_account_page() throws InterruptedException {
		String landingpagetext = myaccountpage.getLandingPageText();
		Assert.assertEquals("My Account", landingpagetext);
		Thread.sleep(3000);
	}

	@Given("User is on DDF Home Page")
	public void user_is_on_ddf_home_page() throws InterruptedException {
		baseClass = new BaseClass();
		baseClass.openbrowser("chrome");
		baseClass.implicitWait();
		baseClass.openUrl();
		System.out.println(driver);
		loginpage.clickonmodal();
		Thread.sleep(3000);
	}

	@When("User Click on Account button")
	public void user_click_on_account_button() throws InterruptedException {
		loginpage.clickonmyaccounts();
		Thread.sleep(3000);
	}

	@When("Enters the UserId {string} and Password {string}")
	public void enters_the_user_id_and_password(String string, String string2) {
		loginpage.setloginEmail(string);
		loginpage.setloginPass(string2);
	}

	@When("clicks Signin button")
	public void clicks_signin_button() {
		loginpage.clickonSingnIn();
	}

	@Then("He Lands on My Account Landing Page")
	public void he_lands_on_my_account_landing_page() throws InterruptedException {
		String landingpagetext = myaccountpage.getLandingPageText();
		Assert.assertEquals("My Account", landingpagetext);
		Thread.sleep(3000);
	}

}
