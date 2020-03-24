package sepgrms;

import java.io.IOException;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
	WrapperMethod wm=new WrapperMethod();
	
	wm.LaunchApp("https://opensource-demo.orangehrmlive.com/");
	wm.enterById("txtUsername","Admin");
	wm.enterById("txtPassword","admin123");
	wm.clickByXpath("//*[@id=\"btnLogin\"]");
	wm.clickByLinktext("Leave");
	wm.screenshot("C:\\Users\\BLTuser.BLT0209\\eclipse-workspace\\Seleniumcourse\\Screenshot\\now.png");
	wm.closeApp();
	
	
	

	}

}
