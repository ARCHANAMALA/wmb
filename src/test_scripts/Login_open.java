package test_scripts;

import org.testng.annotations.Test;

import generic_library.Browser;
import generic_library.Brwoser_launch;
import page_factory.Login;

public class Login_open {
	@Test
	public void open()
	{
		Brwoser_launch.dr=Brwoser_launch.launch();
		Brwoser_launch.dr.get(Browser.url);
		Login lg = new Login();
		lg.logintoapp("admin", "manager");
		//lg.logout();
	}
}
