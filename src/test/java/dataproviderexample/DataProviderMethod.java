package dataproviderexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {

	
	@Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
	public void methodExample(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	
	
}
