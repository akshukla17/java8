package com.app.media;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileOperation {
	static String excel="/home/raghav/Desktop/testStorage.xlsx";

	public static void main(String[] args) {
		 writeExcelOperation();
		 readExcelOpeation();
	}

	private static void readExcelOpeation() {

		try {
			BufferedReader br=new BufferedReader(new FileReader(new File(excel)));
			XSSFWorkbook workBook=new XSSFWorkbook(new File(excel));
			Sheet sheet=workBook.getSheetAt(0);
			Iterator<Row> itr=sheet.iterator();
			  while (itr.hasNext()) {

	                Row currentRow = itr.next();
	                Iterator<Cell> cellIterator = currentRow.iterator();

	                while (cellIterator.hasNext()) {

	                    Cell currentCell = cellIterator.next();
	                    //getCellTypeEnum shown as deprecated for version 3.15
	                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
	                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
	                        System.out.print(currentCell.getStringCellValue() + "--");
	                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
	                        System.out.print(currentCell.getNumericCellValue() + "--");
	                    }

	                }
	                System.out.println();

	            }
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeExcelOperation() {
		XSSFWorkbook workbook = new XSSFWorkbook();
		 
		 XSSFSheet sheet=workbook.createSheet("Datatype in java");
		 Object[][]datatypes= {
				 {"Data type", "type","Size(in java)"},
				 {"int","primitive",4},
				 {"float","primitive",8},
				 {"char","primitive",1},
				 {"string","non-primitive","no fixed size"}
		 };
		 
		 int rowNum = 0;
	        System.out.println("Creating excel");

	        for (Object[] datatype : datatypes) {
	            Row row = sheet.createRow(rowNum++);
	            int colNum = 0;
	            for (Object field : datatype) {
	                Cell cell = row.createCell(colNum++);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	        }

	        try {
	            FileOutputStream outputStream = new FileOutputStream(excel);
	            workbook.write(outputStream);
	            workbook.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");
	}

}
