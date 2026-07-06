package pages;

import com.microsoft.playwright.Page;

public class Loginpage {
	private Page page;
	private String username="input[name='username']";
	private String password = "input[name='password']";
	private String loginbtn = "button[type='submit']";
	private String logoutbutton = "//a[@href='/logout']";
	private String flasherror = "div[class='flash error']";
	public Loginpage(Page page) {
		this.page=page;
	}
	public String getTitle() {
		return page.title();
	}
	public String getUrl() {
		return page.url();
	}
	
	public void loginwithvalidcredentials(String uname,String pword) {
		page.fill(username,uname);
		page.fill(password,pword);
		page.click(loginbtn);
		if(!page.locator(flasherror).isVisible())
		page.click(logoutbutton);
	}

}
