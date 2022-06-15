package testngpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
	@Test
	
	public void b()
	{
		Assert.fail();
		Reporter.log("Remo Cass method",true);
	}

}
