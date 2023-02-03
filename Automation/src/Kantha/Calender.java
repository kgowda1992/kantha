package Kantha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
		String month="March";
		String date="21";
		int i=1;
		while(i<=12)
		{
			try
			{
				driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
			    break;
			}
			catch(Throwable t)
			{
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			    Thread.sleep(2000);
			}
			
		}
	

	}
}
