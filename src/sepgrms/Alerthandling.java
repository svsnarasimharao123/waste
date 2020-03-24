package sepgrms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=3A892BD1AE3AC1C6337E4DB84831B5A8t");
WebElement a=driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input"));
Alert al=driver.switchTo().alert();
System.out.println(al.getText());
al.accept();
al.dismiss();

al.accept();
	
	
	
	
	}
	
	
	
	
	

}
