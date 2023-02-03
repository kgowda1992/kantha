package Sample;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Para_1 
{
	@Test
	public void deletecustomer() throws InterruptedException, IOException
	{
		EdgeOptions options=new EdgeOptions();
		File f=new File("C:\\Users\\Kinara\\Downloads\\ndgimibanhlabgdgjcpbbndiehljcpfh-4.6.2-Crx4Chrome.com.crx");
		options.addExtensions(f);
		WebDriver driver=new EdgeDriver(options);
		driver.get("https:\\www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(300);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Thread.sleep(300);
		driver.manage().window().maximize();
		Set<String> id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Kinara\\Desktop\\kantha\\k.png");
		FileUtils.copyFile(src, dest);
	}

}
