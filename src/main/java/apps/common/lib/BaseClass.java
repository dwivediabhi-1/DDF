package apps.common.lib;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import apps.page.objects.HomePage;
import apps.page.objects.LoginPage;
import apps.page.objects.MyAccountPage;
import apps.utility.ExcelUtility;

public class BaseClass {

	protected static WebDriver driver = null;
	protected static Helper helper;
	protected static LoginPage loginpage;
	protected static MyAccountPage myaccountpage;
	protected static HomePage homepage;
	protected static ExcelUtility excelutility;
	Properties propertyval;

	public void openbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			// System.out.println("driver1 --> "+driver);
		}

		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			// System.out.println("driver2 --> "+driver);
		}

		loginpage = new LoginPage(driver);
		myaccountpage = new MyAccountPage(driver);
		homepage=new HomePage(driver);
		helper = new Helper(driver);
		excelutility = new ExcelUtility();

	}

	public void openUrl() {
		driver.manage().window().maximize(); // maximizing the window
		propertyval = helper.ConfigFileReader();
		String url = propertyval.getProperty("baseURL");
		driver.get(url);
	}

	public void implicitWait() {
		// helper = new Helper();
		propertyval = helper.ConfigFileReader();
		String timeoutval = propertyval.getProperty("implictwaittime");
		int timeoutduration = Integer.parseInt(timeoutval);
		driver.manage().timeouts().implicitlyWait(timeoutduration,TimeUnit.SECONDS);
	}

	public String getReportConfigPath() {
		propertyval = helper.ConfigFileReader();
		String reportConfigPath = propertyval.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static void closeallbrowser() {
		driver.close();
	}

}
