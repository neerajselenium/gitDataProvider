package dataproviderexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	
	@Test(dataProvider="getData")
	public void DataProviderExample(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
		
	}

	@DataProvider(name="getData")
	public Object[][] getDataLogin()
	{
		 return new Object[][] 
			    	{
			            { "Ketan", "Kumari" },
			            { "AJab", "gazab" },
			            { "Debu", "Sica" }
			        };
		
		
	}
	
}
