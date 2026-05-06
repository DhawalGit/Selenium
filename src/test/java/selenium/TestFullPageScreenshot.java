package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFullPageScreenshot {

	public static void main(String[] args) throws IOException {
		File srcFile;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//blockquote[1]/form/input[1]")).click();
		// Cast driver to FirefoxDriver to access native method
		srcFile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshot/checkboxSelection/input1.jpg"));
		driver.findElement(By.xpath("//blockquote[1]/form/input[2]")).click();
		srcFile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshot/checkboxSelection/input2.jpg"));
		driver.findElement(By.xpath("//blockquote[1]/form/input[3]")).click();
		srcFile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshot/checkboxSelection/input3.jpg"));
		driver.findElement(By.xpath("//blockquote[1]/form/input[4]")).click();
		srcFile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshot/checkboxSelection/input4.jpg"));

	}

}
