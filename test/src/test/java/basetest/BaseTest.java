package basetest;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import factory.DriverFactory;
import model.Herokuappcustomer;
import pages.Loginpage;
import utilities.JsonReader;

import org.testng.annotations.Parameters;

public class BaseTest {
	DriverFactory pf;
	Page page;
	protected Loginpage loginpage;
	protected Properties prop;
	protected Herokuappcustomer customerdata;
	
	@Parameters({ "browser" })
	@BeforeTest
	public void setup(String browsername) {
		pf=new DriverFactory();
		prop=pf.init_prop();
		customerdata= JsonReader.getdata();
		if(browsername!=null) {
			prop.setProperty("browser", browsername);
		}
		page=pf.initbrowser(prop);
		loginpage=new Loginpage(page);
	}
	@AfterTest
	public void teardown() {
		page.context().browser().close();
	}

}
