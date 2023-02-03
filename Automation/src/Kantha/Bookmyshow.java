package Kantha;

import java.awt.DisplayMode;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookmyshow 
{
	private static final boolean DisplayMode = false;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeswitches", Arrays.asList(("enable-automation")));
		//options.addArguments("start-maximized");
		//Thread.sleep(300);
		//driver.manage().window().maximize();
		Thread.sleep(300);
		//driver.findElement(By.xpath("//div[normalize-space()='Sign in']")).click();
		//driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8970447295");
		//driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Vedha']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Book tickets'])[1]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[normalize-space()='05']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//div[normalize-space()='01:00 PM'])[3]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//div[normalize-space()='Accept'])[1]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//div[normalize-space()='Select Seats'])[2]")).click();
		Thread.sleep(300);
		driver.findElement(By.id("wzrk-cancel")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		driver.findElement(By.xpath("(//div[normalize-space()='9'])[7]")).click();
		Thread.sleep(300);
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//span[normalize-space()='Rs.300.00'])[1]")).click();
		//Thread.sleep(300);
		//driver.findElement(By.xpath("//div[@id='prePay']")).click();
		
		
	}

}
