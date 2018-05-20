package DataProviderThroughExcel;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	@Test(dataProvider="excelData",dataProviderClass=DataProviderGetDataExcel.class)
	
	public static void getLoginData(Hashtable<String,String> data){
		
		if(!data.get("RunMode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		System.out.println(data.get("firstname"));
		
		System.out.println(data.get("lastname"));
		
		
	}

}
