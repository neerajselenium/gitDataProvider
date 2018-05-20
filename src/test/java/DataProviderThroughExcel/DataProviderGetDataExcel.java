package DataProviderThroughExcel;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import ExcelReader.ExcelReader;

public class DataProviderGetDataExcel {
	
	
	
	@DataProvider(name="excelData")
	public static Object[][] AddCustomerTest(Method m)
	{
		ExcelReader excel= new ExcelReader("E:\\MavenDec\\DataProviderExample\\src\\test\\java\\ExcelReader\\TestData.xlsx");
		String sheetName = m.getName();
		int totalRows = excel.getRowCount(sheetName);
		int totalCols = excel.getColumnCount(sheetName);
		
		System.out.println( m.getName());
		
		System.out.println(totalRows);
		System.out.println(totalCols);

		Object[][] data = new Object[totalRows-1][1];
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= totalRows; rowNum++) { // 2

			table = new Hashtable<String,String>();
			
			for (int colNum = 0; colNum < totalCols; colNum++) {

			
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}
	
	public static boolean isTestRunnable(String testName, ExcelReader excel){
		
		String sheetName="getLoginData";
		int rows = excel.getRowCount(sheetName);
		
		
		for(int row=2; row<=rows; row++){
			
			String testCase = excel.getCellData(sheetName, "TCID", row);
			
			if(testCase.equalsIgnoreCase(testName)){
				
				String runmode = excel.getCellData(sheetName, "RunMode", row);
				
				if(runmode.equalsIgnoreCase("Y"))
					return true;
				else
					return false;
			}
			
			
		}
		return false;
	}
	
	
}
	