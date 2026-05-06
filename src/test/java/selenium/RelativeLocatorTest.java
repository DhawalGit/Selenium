package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("Above text entered");
		
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("below text entered");
		
		WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		near.click();
		driver.navigate().back();
		
		WebElement rightOf = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//fieldset/label[contains(text(),'Name')]")));
		rightOf.sendKeys("Name Test");
		
		WebElement leftOf = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.xpath("(//form[@id='load_form']//input[@class='button'][@value='Submit'])[2]")));
		leftOf.click();

	}

}
