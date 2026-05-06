package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.tagName("select")).sendKeys("Haiti");
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(dropdown);
		List<WebElement> list = select.getOptions();
		System.out.println("Total options: "+list.size());
		for(WebElement option: list){
			System.out.println(option.getText());
		}
		select.selectByVisibleText("Haiti");
		select.selectByValue("Albania");
		
		List<WebElement> optionList = driver.findElements(By.tagName("option"));
		System.out.println("Total Options: "+optionList.size());
		
	}

}
