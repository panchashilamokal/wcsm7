package pageobjectmodel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		Thread.sleep(5000);
		Flib flib=new Flib();
		String validUsername=flib.readPropertyFile(PROP_PATH,"username");
		String validPassword=flib.readPropertyFile(PROP_PATH,"password");
		LoginPage lp=new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
		
		

	}

}
