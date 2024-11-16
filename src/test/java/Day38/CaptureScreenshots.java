package Day38;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//1)Full page Screenshot
		/*
		
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		//Actual path where we want to store screenshot -C:\WorkSpace\SeleniumWebDriver\Seleniumwebdriver\Screenshots
		
		File TargetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullPage.png");
		Sourcefile.renameTo(TargetFile);// copy sourcefile to target file
		*/
		
		//2) capture the screenshot of specific section
		/*
		WebElement FeaturedProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File Sourcefile = FeaturedProducts.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\FeaturedProducts.png");
		Sourcefile.renameTo(TargetFile);
		*/
		
		//3)capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']//a"));
		File sourecFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourecFile.renameTo(targetFile);
		
		driver.quit();

	}

}
