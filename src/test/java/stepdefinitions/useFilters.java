package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import apps.common.lib.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class useFilters extends BaseClass {

	public static BaseClass baseClass;
	Map<String, Map<String, String>> excelData;
	String rownumber="";

	public useFilters() {
		super();
	}

	@Given("User goes on Home Page")
	public void user_goes_on_home_page() throws Exception {		
		
			baseClass = new BaseClass();
			baseClass.openbrowser("chrome");
			baseClass.implicitWait();
			baseClass.openUrl();
			loginpage.clickonmodal();		
			Thread.sleep(3000);
			excelData = excelutility.getExcelAsMap("Filter");
	}

	@Given("User Clicks on any of the Category Menu")
	public void user_clicks_on_any_of_the_category_menu() throws InterruptedException {
		
		String menu = excelData.get("1").get("MenuCategory");
		String xpathofmenu = "(//span[text()='"+menu+"'])[1]";
		driver.findElement(By.xpath(xpathofmenu)).click();
		Thread.sleep(3000);
	}

	@When("User Tries to Use Filters {string}")
	public void user_Tries_to_Use_Filters(String string)  throws InterruptedException {
		
		if(string.equalsIgnoreCase("Category"))
		{
			rownumber="1";
		}
		else if(string.equalsIgnoreCase("Brands"))
		{
			rownumber="2";
		}
		else if(string.equalsIgnoreCase("Price"))
		{
			rownumber="3";
		}
		
		String Filtertype = excelData.get(rownumber).get("Filter Type");
		String FilterParameter = excelData.get(rownumber).get("ParameterofFilter");
		usefiltergeneric(Filtertype, FilterParameter);
	}

	@Then("Selected Filters can be verified")
	public void selected_filters_can_be_verified() {
		WebElement filterverifydiv=driver.findElement(By.xpath("//*[@id='layered-filter-block']/div[2]/div[1]/ol/li"));
		String Filterval=filterverifydiv.getText();
		String expectedfilterval=excelData.get(rownumber).get("VerifyFilterVal");
		Assert.assertEquals(expectedfilterval,Filterval);
	}

	@Then("Clear Filter is clicked")
	public void clear_filter_is_clicked() throws Exception {
		WebElement clearbutton=driver.findElement(By.xpath("//*[@id='layered-filter-block']/div[2]/div[2]/a"));
		Thread.sleep(3000);
		clearbutton.click();
		
	}

	public void usefiltergeneric(String filterType, String filterValue) throws InterruptedException // fitertype ---> type of filter to be used ,
																									// filtervalue ---> the basis of which fiter is
																									// to be done
	{
		String filtervaluestring = "", actualpathstring = "";
		WebElement xpathfiltervalue = null, actualxpathforfilter = null;
		String xpathfiltertype = "//div[text()='" + filterType + "']";

		WebElement filterdiv = driver.findElement(By.xpath(xpathfiltertype));
		String property_expand = filterdiv.getAttribute("aria-expanded");

		if (property_expand.equalsIgnoreCase("false")) {
			filterdiv.click();
		}

		if (filterType.equalsIgnoreCase("category")) {
			filtervaluestring = "//label[text()='" + filterValue + "']";
			actualpathstring = filtervaluestring + "//..//input[@type='checkbox']";
			xpathfiltervalue = driver.findElement(By.xpath(filtervaluestring));
		}
		if (filterType.equalsIgnoreCase("brands")) {
			filtervaluestring = "//span[text()='" + filterValue + "']";
			actualpathstring = filtervaluestring + "//../..//input[@type='checkbox']";
			xpathfiltervalue = driver.findElement(By.xpath(filtervaluestring));
		}

		if (filterType.equalsIgnoreCase("price")) {
			String priceSliderLocator = "//div[@class='ui-slider-range ui-widget-header ui-corner-all']";
			WebElement priceSlider = driver.findElement(By.xpath(priceSliderLocator));
			Assert.assertTrue(priceSlider.isDisplayed());
			helper.scrollwindow(priceSlider);
			
			Dimension sliderSize = priceSlider.getSize();
			int sliderWidth = sliderSize.getWidth();
			
			int xCoord = priceSlider.getLocation().getX();
							
			Actions builder = new Actions(driver);   
			builder.moveToElement(priceSlider).click().dragAndDropBy(priceSlider,xCoord + sliderWidth, 0).build().perform();
		}
		if (filterType.equalsIgnoreCase("brands") || filterType.equalsIgnoreCase("category")) {
			helper.scrollwindow(xpathfiltervalue);
			Thread.sleep(3000);
			if (xpathfiltervalue.isDisplayed()) {
				actualxpathforfilter = driver.findElement(By.xpath(actualpathstring));
				actualxpathforfilter.click();
			}
		} else if (filterType.equalsIgnoreCase("price")) {
		}
		WebElement shopbyheader = driver.findElement(By.xpath("//strong[text()='Shop By']"));
		helper.scrollwindow(shopbyheader);
	}
	
}
	


