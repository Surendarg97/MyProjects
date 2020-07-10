package wgs.extenreports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriverTest {
	
	@Test
	public ArrayList<String> getData(String testCaseName,String coulumnName) throws IOException {
		
		//Fileinputstream argument
		
		ArrayList<String> values=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("E:\\Files\\Selenium learning from udemy course\\DemoData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);		
		int numberOfSheets = workbook.getNumberOfSheets();
		
		for (int i=0;i<numberOfSheets;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				
				XSSFSheet workingSheeet = workbook.getSheetAt(i);
				
				//Identifying testcase cell by iterating each row
				
				Iterator<Row> rowIterator = workingSheeet.iterator();  //collection of rows
				
				Row indexZeroRow = rowIterator.next();
				
				Iterator<Cell> cellIterator = indexZeroRow.cellIterator(); //collection of cells
				
				int k=0;
				
				int desiredColumnIndex = 0;
				
				while(cellIterator.hasNext()) {
					
					Cell indvidualCell = cellIterator.next();
					
					String stringCellValue = indvidualCell.getStringCellValue();
					
					if(stringCellValue.equalsIgnoreCase(coulumnName)) {
						
						//Desired column
						
						desiredColumnIndex=k;
					}
					k++;
				}
				
				System.out.println(desiredColumnIndex);
				
				
				// Scanning each to find the desired row to look up the value
				
				while(rowIterator.hasNext()) {
					
					Row r = rowIterator.next();
					
					if(r.getCell(desiredColumnIndex).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						
						Iterator<Cell> allCellValuesOfTheDesiredRow = r.cellIterator();
						
						while(allCellValuesOfTheDesiredRow.hasNext()) {
							
							 if(allCellValuesOfTheDesiredRow.next().getCellTypeEnum()==CellType.STRING)
							
							 {//System.out.println(desiredStringValues);
							
							values.add(allCellValuesOfTheDesiredRow.next().getStringCellValue());}
							 
							 else {
								 
								
								 
								 values.add(NumberToTextConverter.toText(allCellValuesOfTheDesiredRow.next().getNumericCellValue()));}
							
							
							
							
						}
					}
				}
				
			}
			
		} 
		
		//System.out.println(values.toString());
		
		return values;
		
		
		
		
		
	}

}
