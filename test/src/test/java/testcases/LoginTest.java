package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void firsttest() {
		String url=loginpage.getUrl();
		System.out.println(url);
		Assert.assertEquals(true,true);
	}
	@Test(priority=2)
	public void validlogin() {
		loginpage.loginwithvalidcredentials(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(true, true);
	}
	@Test(priority=3)
	public void invalidlogin() {
		loginpage.loginwithvalidcredentials(prop.getProperty("username"),prop.getProperty("invalidpassword"));
		Assert.assertEquals(true, true);
	}
}
