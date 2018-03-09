package page_factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_library.Brwoser_launch;

public class Login {
	@FindBy(name="username")
	private WebElement usn;
	 @FindBy(name="pwd")
	 private WebElement pd;
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement ln;
	 public Login()
	 {
		PageFactory.initElements(Brwoser_launch.dr,this);
	 }
	  
	 public void logintoapp(String name, String pswd)
	 {
		 usn.sendKeys(name);
		 pd.sendKeys(pswd);
		 ln.click();
	 }
@FindBy(xpath="//img[@class='logoutImg']")
private WebElement lg;

public void logout()
{
	lg.click();
	
}
}
