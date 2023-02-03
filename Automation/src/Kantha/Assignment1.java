package Kantha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.devtools.v105.page.Page.GetAppIdResponse;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kanthas78@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Realstar@1992");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//h5[normalize-space()='Quick Links']")).click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='text'][normalize-space()='Profile Summary']")).click();
		System.out.println(getText());
		
	}

	private static char[] getText() {
		// TODO Auto-generated method stub
		return null;
	}
}