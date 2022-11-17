package test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

public class TestDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\VaishuSalenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage l=new LoginPage(driver);
		l.setLoginPageUn();
		l.setLoginPagePwd();
		l.clickLoginPageLgnBtn();
		
		HomePage h=new HomePage(driver);
		h.verifyHomePageLogo();
		
		LogoutPage lp=new LogoutPage(driver);
		lp.menubtnpage();
		lp.Logoutbtnclick();
		}

}
