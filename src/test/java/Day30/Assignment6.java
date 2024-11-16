package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"mytext5\"]")).sendKeys("5Welcome");
		WebElement clickLink = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='https://a9t9.com']")));
		clickLink.click();
		
		
		
		
		
	}

}
