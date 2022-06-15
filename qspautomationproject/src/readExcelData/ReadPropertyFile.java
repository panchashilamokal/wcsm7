package readExcelData;

import java.io.IOException;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		Flib flib=new Flib();
		String value=flib.readPropertyFile("./Data/config.properties","username");
		System.out.println(value);
		

	}

}
