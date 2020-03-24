package sepgrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IElaunching {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\SeleniumJars\\Internet Explorer Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		
		

	}

}
