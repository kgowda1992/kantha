package Page_Factory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Data_control.DC_Excel;


public class Base 
{
	public WebDriver driver=null;
	
@BeforeMethod
public void signin()
{
  driver = new ChromeDriver();
  driver.get("http://localhost:8080/login.do");
  Login lg = new Login(driver);
  lg.username().sendKeys("admin");
  lg.password().sendKeys("manager");
  lg.signin().click();
  

}
	

}
