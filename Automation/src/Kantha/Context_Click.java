package Kantha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Click {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//div[@class='label'])[4]")).click();
		driver.findElement(By.xpath("//span[@unselectable='on']")).click();
		driver.findElement(By.xpath("//span[@id='userDataLightBox_titlePlaceholder']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kantha");
		driver.findElement(By.xpath("//div[.='Cancel']")).click();
		//Alert alt=driver.switchTo().alert();
		//System.out.println(alt.getText());
		//alt.dismiss();
		//alt.accept();
		
		WebElement user=driver.findElement(By.xpath("//div[contains(text(),'Time-Track')]"));
		Actions act=new Actions(driver);
		act.contextClick(user).perform();
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
