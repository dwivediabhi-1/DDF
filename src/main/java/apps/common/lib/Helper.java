package apps.common.lib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {
	
	protected WebDriver driver;

	// Reading Property File
	public Helper(WebDriver driver)
	{
	this.driver=driver;
	}

	private Properties properties;
	private final String propertyFilePath = "C://Users//Admin//eclipse-workspace//DelhiDutyFree//src//main//resources//configuration.properties";
	private JavascriptExecutor js;
	
	
	public Properties ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
		return properties;
	}
	
	public void scrollwindow(WebElement element)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	

}
