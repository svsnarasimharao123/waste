package sepgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	public static void main(String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/draggable/");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Droppable")).click();
	}

}
