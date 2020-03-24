package sepgrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		System.setProperty("wbdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://www.easycalculation.com/";
		String expectedTitle="https://www.easycalculation.com/";
		String actualTitle="";
		
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
	driver.close();	
	}
	}

