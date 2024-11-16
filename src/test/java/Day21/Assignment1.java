package Day21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/*
Test Case 1 : - check  title of opencart
1)launch browser(Chrome)
2)open  url https://demo.nopcommerce.com/
3)validate the title "nopCommerce demo store"
4)close browser
* */
public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
List<WebElement> drp = driver.findElements(By.xpath("(//ul[@class=\"multiselect-container dropdown-menu\"])/child::li//a//input"));
for(WebElement i:drp) {
	if(i.getText().equals("Python")) {
		i.click();
		
	}
}

	}

}
