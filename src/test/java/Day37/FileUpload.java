package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\WorkSpace\\Notes\\Selenium_pavanSir\\Day37\\Day-37.txt");
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Day-37.txt")) {
			System.out.println("File uploaded sucessfully");
		}else {
			System.out.println("File upload failed");
		}*/
		
		//Multiple files uploaded
		String file1 = "C:\\WorkSpace\\Notes\\Selenium_pavanSir\\Day37\\Day-37.txt";
		String file2 = "C:\\WorkSpace\\Notes\\Selenium_pavanSir\\Day36\\Day-36.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li")).size();
		if(noOfFilesUploaded==2) {
			System.out.println("all files uploaded");
		}else {
			System.out.println("all files didn't upload");
		}
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[1]")).getText().equals("Day-37.txt")&&
				driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[2]")).getText().equals("Day-36.txt")) {
			System.out.println("File uploaded sucessfully");
		}
		else 
		{
			System.out.println("File upload failed");
		}

	}

}
