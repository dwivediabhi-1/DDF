package stepdefinitions;

import apps.common.lib.BaseClass;
import apps.utility.ExcelUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	protected static ExcelUtility excelutility;
	
	@Before
	public static void loadallreq()
	{
		
	}
	
	@After
	public static void before_or_after_all()
	{
		//System.out.println("Here");
		//closeallbrowser();
	}

}
