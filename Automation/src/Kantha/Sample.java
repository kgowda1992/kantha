package Kantha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8970447295");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Realstar@1992");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		driver.findElement(By.id("All")).click();
	}

}
