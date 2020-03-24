package sepgrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxlaunch {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumJars\\Firefox Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

}
