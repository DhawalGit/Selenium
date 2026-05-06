package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;

public class TestCheckboxes {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		 * driver.findElement(By.xpath("//blockquote[1]/form/input[1]")).click();
		 * driver.findElement(By.xpath("//blockquote[1]/form/input[2]")).click();
		 * driver.findElement(By.xpath("//blockquote[1]/form/input[3]")).click();
		 * driver.findElement(By.xpath("//blockquote[1]/form/input[4]")).click();
		 */
		WebElement checkboxBlock = driver.findElement(By.className("Example"));
		int size = checkboxBlock.findElements(By.tagName("input")).size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {

			WebElement checkbox = driver.findElement(By.xpath("//blockquote[1]/form/input[" + i + "]"));
			checkbox.click();
			File checkboxSelection = checkbox.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(checkboxSelection, new File("./screenshot/checkboxSelection"+i+".jpg"));
		}

	}

}
