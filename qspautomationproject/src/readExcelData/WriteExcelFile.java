package readExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Flib flib=new Flib();
		flib.writeExcelData("./Data/ActiTimeTestData.xlsx","validcreds",0,3,"status");

	}

}
