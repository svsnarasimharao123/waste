package sepgrms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemoment {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\SVSSNR\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hdfcbank.com/");
		 
WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[3]"));
WebElement b=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[4]/a/span"));
Actions action=new Actions(driver);
action.moveToElement(a);
action.moveToElement(b).click().build().perform();

}
	}
