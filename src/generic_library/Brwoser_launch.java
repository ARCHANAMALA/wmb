package generic_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brwoser_launch implements Browser {
public static WebDriver dr;
public static WebDriver launch()
{
	if(Browser.browser.equals("firefox"))
	{
		dr=new FirefoxDriver();
		
	}
	else if (Browser.browser.equals("chrome"))
	{
		dr=new ChromeDriver();
	}
	return dr;
}

}
