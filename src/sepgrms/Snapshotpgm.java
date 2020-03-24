package sepgrms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshotpgm {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(SrcFile,new File("C:\\Users\\BLTuser.BLT0209\\eclipse-workspace\\Seleniumcourse\\Screenshot\\naar.png"));

	
	


}
}

