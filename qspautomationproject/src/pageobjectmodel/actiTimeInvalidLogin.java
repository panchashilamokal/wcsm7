package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class actiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
    BaseTest bt=new BaseTest();
    bt.setUp();
    Flib flib =new Flib();
    LoginPage lp=new LoginPage(driver);
    int rc=flib.getrowCount(EXCEL_PATH, "invalidcreds");
    for(int i=1;i<=rc;i++)
    {
    	String invalidUsername = flib.readData(EXCEL_PATH,"invalidcreds", i,0);
    	String invalidPassword = flib.readData(EXCEL_PATH,"invalidcreds", i,1);

    	lp.actiTimeinValidLogin(invalidUsername, invalidPassword);
    

    }
	}

}
