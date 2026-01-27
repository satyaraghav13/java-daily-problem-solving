import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Solution01 {



	    public static void main(String[] args) {

	        String filePath = "C:/Users/satya/Desktop/data.xlsx";

	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	            Sheet sheet = workbook.getSheetAt(0);

	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    System.out.print(cell.toString() + "\t");
	                }
	                System.out.println();
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
