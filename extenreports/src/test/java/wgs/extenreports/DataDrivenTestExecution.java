package wgs.extenreports;

import java.io.IOException;
import java.util.ArrayList;

public class DataDrivenTestExecution {

	
	  public static void main(String[] args) throws IOException {
	  
	  DataDriverTest d=new DataDriverTest();
	  
	  
	  ArrayList<String> data = d.getData("Delete profileData 2","Data 2");
	  
	 
	  System.out.println(data.toString());
	  
	  }
	 

}
