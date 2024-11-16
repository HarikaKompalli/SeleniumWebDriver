//1) without using PageFactory
package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	WebDriver driver;
	
	//constructor
	LoginPage1(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By txt_userName_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc= By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	
	
	

	//Action methods
	
	public void setUserName(String userName) {
		driver.findElement(txt_userName_loc).sendKeys(userName);
	}
	
	public void setPassWrd(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
}
