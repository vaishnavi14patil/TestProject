package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	//declaraion
	@FindBy (xpath="//button[@id='react-burger-menu-btn']") private WebElement applogo;
	@FindBy (xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
	
	//initialization
	public LogoutPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//usage
	public void clickApplogo()
	{
		applogo.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}

