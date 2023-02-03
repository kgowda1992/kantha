package Kantha;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		WebElement paytm_for_consumer=driver.findElement(By.xpath("//a[normalize-space()='Paytm for Consumer']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(paytm_for_consumer).perform();
		
		
	}

}
