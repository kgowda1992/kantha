package Kantha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement Spain=driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Norway=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement Copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement Seoul=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement Southkorea=driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement Stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Sweden=driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement Washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement Unitedstates=driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(rome, italy).perform();
		act.dragAndDrop(madrid, Spain).perform();
		act.dragAndDrop(oslo, Norway).perform();
		act.dragAndDrop(Copenhagen, Denmark).perform();
		act.dragAndDrop(Seoul, Southkorea).perform();
		act.dragAndDrop(Stockholm, Sweden).perform();
		act.dragAndDrop(Washington, Unitedstates).perform();
		
	}

}
