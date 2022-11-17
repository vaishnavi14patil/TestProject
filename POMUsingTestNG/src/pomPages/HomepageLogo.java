package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageLogo 
{
    //declaration
	@FindBy (xpath="//div[@class='login_logo']") private WebElement logo;
	
	//initialiazation
	public HomepageLogo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//usage
	public void verifylogo() 
	{
		boolean result=logo.isDisplayed();
		if(result==true)
		{
			System.out.println("Logo is visible");
		}
		else
			System.out.println("Logo is not visible");
	}
	
}
