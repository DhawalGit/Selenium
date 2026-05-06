package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebTable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// //table[@class='dataTable']/tbody/tr - Total # of rows
		// //table[@class='dataTable']/tbody/tr[1]/td - Total columns in a row
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total Rows: "+rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total Columns: "+cols.size());
		
		for(int row = 1; row <= rows.size(); row++) {
			for(int col = 1; col <= cols.size(); col++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+col+"]")).getText()+" ");
			}
			System.out.println();
		}
	}

}
