package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIsElementPresent {
	public static WebDriver driver;

/*	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable e) {
			// TODO: handle exception
			return false;
		}

	}
*/
	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Throwable e) {
			// TODO: handle exception
			return false;
		}

	}

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//System.out.println(isElementPresent("//select[@id='searchLanguage']"));
		System.out.println(isElementPresent(By.id("searchLanguage")));

	}

}
