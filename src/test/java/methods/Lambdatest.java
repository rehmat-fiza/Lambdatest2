package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lambdatest {
	
	WebDriver driver;
	
	public Lambdatest(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnLink() {
	   	WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() ='Simple Form Demo']"));
	    	simpleFormDemo.click();  
	  }
	
	 public void singleInputField() {
		 
	    	WebElement enterMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
			enterMessage.sendKeys("Hi , this is Rehmat here");
			WebElement getCheckedValue = driver.findElement(By.xpath("//button[@id='showInput']"));
			getCheckedValue.click();
			String expectedMsg = "Hi , this is Rehmat here";
			String actualMsg = driver.findElement(By.xpath("//p[contains(text(),'Hi , this is Rehmat here')]")).getAttribute("id");
			Assert.assertEquals(actualMsg, expectedMsg, "Test case failed");

	   	
	   }
	 
	 public void twoInputField() {
	    	WebElement getTextOne = driver.findElement(By.xpath("//input[@id='sum1']"));
			getTextOne.sendKeys("Hi!!!");
			WebElement getTextTwo = driver.findElement(By.xpath("//input[@id='sum2']"));
			getTextTwo.sendKeys("from Rehmat");
			WebElement getValue = driver.findElement(By.xpath("(//button[@type = 'button'])[2]"));
			getValue.click();
	    	
	    }

	

}
