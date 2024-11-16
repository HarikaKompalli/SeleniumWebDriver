package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Min slider
		WebElement min_slider = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		System.out.println("Loc of min_slider: "+min_slider.getLocation()); //(59,249)=(x,y)
		act.dragAndDropBy(min_slider, 100, 249).perform(); 
		/*
			min_slider is current location of left side slider(59),100 is how many points we want slider to move and,
			249 is y axis point
			so now our slider will move from 58 point to 159 point(59+100)
		*/
		System.out.println("Location of the min slider after moving:"+min_slider.getLocation()); //(157, 249)
		
		//Max slider
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Loc of max_slider: "+max_slider.getLocation()); //(510, 249)=(x,y)
		act.dragAndDropBy(max_slider, -203, 249).perform(); 
		System.out.println("Location of the min slider after moving:"+max_slider.getLocation());//(307, 249)
	
	}

}
