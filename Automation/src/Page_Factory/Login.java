package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	@FindBy(name="username")
	private WebElement un;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy(xpath = "//div[normalize-space()='Login']")
	private WebElement signin;
	
	public WebElement username()
	{
		return un;
	}
	public WebElement password()
	{
		return pwd;
	}
	public WebElement signin()
	{
		return signin;
	}
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}
