package Kantha;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assgn_Bookmyshow_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		//File f=new File(".\\addons\\selectorshub.crx");
		//options.addExtensions(f);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.bookmyshow.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@alt='BANG']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[normalize-space()='Movies'])[1]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@class='h-e-f-Ra-c e-f-oh-Md-zb-k']")).click();
		
	}

}
