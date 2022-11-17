package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	//declaration
	@FindBy (xpath="//input[@id='user-name']") private WebElement un;
	@FindBy (xpath="//input[@id='password']") private WebElement pwd;
	@FindBy (xpath="//input[@id='login-button']") private WebElement btn;
	
	//initialization
	public LoginPages(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    //usage
	public void setLoginPagesUn()
	{
		un.sendKeys("standard_user");
	}

	public void setLoginPagespwd()
	{
		pwd.sendKeys("secret_sauce");
	}
	
	public void clickLoginPagesBtn()
	{
		btn.click();
	}
}
