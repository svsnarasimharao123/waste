package sepgrms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunch {
public static void main(String args[]) 

{
	System.setProperty("webdriver.chrome.driver","E:\\SVSSNR\\Drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.co.in/");
}
}
