package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/dhawa/OneDrive/Desktop/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement buttonBlock = driver.findElement(By.id("buttons3"));
		buttonBlock.findElements(By.id("btn1")).get(2).click();

//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://timesofindia.indiatimes.com/poll.cms");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		String str = driver.findElement(By.id("mathq2")).getText();
//		char[] strArray = str.toCharArray();
//		int firstNum = Character.getNumericValue(strArray[0]);
//		int secondNum = Character.getNumericValue(strArray[4]);
//		int total = firstNum + secondNum;
//		
//		WebElement inputBox = driver.findElement(By.id("mathuserans2"));
//		inputBox.sendKeys(String.valueOf(total));
	}

}
