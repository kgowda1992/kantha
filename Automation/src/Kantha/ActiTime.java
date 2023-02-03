package Kantha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Time-Track']")).click();
		driver.findElement(By.xpath("//a[@class='item active']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='View Time-Track']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Lock Time-Track']")).click();
		driver.findElement(By.xpath("//a[@class='item active']")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen20']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//span[@unselectable='on']")).click();
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		//driver.close();
		driver.getPageSource();
		driver.findElement(By.xpath("//div[normalize-space()='Notifications']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		//driver.findElement(By.id("//input[@id='tasksFilterSubmitButton']")).click();
	}

}
