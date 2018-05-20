package dataproviderexample;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataproviderClass {
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider(Method m){
        if(m.getName().equalsIgnoreCase("methodExample")){
        return new Object[][] {
                { "Raju", "Mhra" },
                { "Kamal", "Gupta" },
                { "Raju", "Kumari" }
            };}
        else{
        return new Object[][] {
                { "India" },
                { "US" },
                { "UK" }
            };}       
    }
}