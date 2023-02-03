package Sample;

import java.awt.Window;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Para_2 
{
	@Test
	public void createcustome() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		File f=new File("C:\\Users\\Kinara\\Downloads\\ndgimibanhlabgdgjcpbbndiehljcpfh-4.6.2-Crx4Chrome.com.crx");
		options.addExtensions(f);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https:\\www.amazon.in");
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("football");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(300);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Thread.sleep(300);
		driver.manage().window().maximize();
		Set<String> id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	}
	

}
