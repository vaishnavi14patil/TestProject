package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomPages.HomepageLogo;
import pomPages.LoginPages;
import pomPages.LogoutPage;

public class TestclassDemo {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\VaishuSalenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		HomepageLogo h=new HomepageLogo(driver);
		h.verifylogo();
		
		
		LoginPages l=new LoginPages(driver);
		l.setLoginPagesUn();
		l.setLoginPagespwd();
		l.clickLoginPagesBtn();
		
		LogoutPage lp=new LogoutPage(driver);
		lp.clickApplogo();
		lp.clickLogout();
  }
}
