package Kantha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().window().maximize();
		WebElement cat=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement dest=driver.findElement(By.xpath("//div[@class='dropBox']"));
		WebElement dest1=driver.findElement(By.xpath("//div[@id='dropBox2']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(cat, dest).perform();
		act.dragAndDrop(cat, dest1).perform();
	}
}
