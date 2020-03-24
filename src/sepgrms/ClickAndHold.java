package sepgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/selectable/");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement a=driver.findElement(By.xpath("/html/body/ol/li[1]"));
		 WebElement b=driver.findElement(By.xpath("/html/body/ol/li[2]"));
		 WebElement c=driver.findElement(By.xpath("/html/body/ol/li[3]"));
		 WebElement d=driver.findElement(By.xpath("/html/body/ol/li[4]"));
		 Actions action=new Actions(driver);
		 action.clickAndHold(a).release(d).build().perform();
		 
		 

}
}