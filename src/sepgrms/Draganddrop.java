package sepgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				 WebElement a=driver.findElement(By.id("draggable"));
		 WebElement b=driver.findElement(By.id("droppable"));
		 Actions action=new Actions(driver);
		 action.dragAndDrop(a,b).build().perform();
		 
	}

}
