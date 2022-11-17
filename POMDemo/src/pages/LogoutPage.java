package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	//declaration
   @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menubtn;
   @FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
   
public LogoutPage(WebDriver driver) 
{
	//initialization
	PageFactory.initElements(driver, this);
}

   //usage
public void menubtnpage()
{
	menubtn.click();
}
	
public void Logoutbtnclick()
{
	logout.click();
}
}
