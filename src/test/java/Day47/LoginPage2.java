//2) using PageFactory

package Day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	
	//constructor
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); //Mandatory line
	}
	
	//locators
	
	@FindBy (xpath="//input[@placeholder='Username']") WebElement txt_userName_loc;
	@FindBy (xpath="//input[@placeholder='Password']") WebElement txt_password_loc;
	@FindBy (xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;
	
	
	@FindBy(tagName="a") List<WebElement> links;
	

	//Action methods
	
	public void setUserName(String userName) {
		txt_userName_loc.sendKeys(userName);
	}
	
	public void setPassWrd(String pwd) {
		txt_password_loc.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btn_login_loc.click();
	}
}
