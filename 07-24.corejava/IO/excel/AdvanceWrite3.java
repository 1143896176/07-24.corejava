package excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class AdvanceWrite3 {

	// ¹«Ê½
	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet spreadsheet = workbook.createSheet("formula");
		HSSFRow row = spreadsheet.createRow(1);
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("A =");
		cell = row.createCell(2);
		cell.setCellValue(2);
		row = spreadsheet.createRow(2);
		cell = row.createCell(1);
		cell.setCellValue("B =");
		cell = row.createCell(2);
		cell.setCellValue(4);
		row = spreadsheet.createRow(3);
		cell = row.createCell(1);
		cell.setCellValue("Total =");
		cell = row.createCell(2);
		// Create SUM formula
		cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
		cell.setCellFormula("SUM(C2:C3)");
		cell = row.createCell(3);
		cell.setCellValue("SUM(C2:C3)");
		row = spreadsheet.createRow(4);
		cell = row.createCell(1);
		cell.setCellValue("POWER =");
		cell = row.createCell(2);
		// Create POWER formula
		cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
		cell.setCellFormula("POWER(C2,C3)");
		cell = row.createCell(3);
		cell.setCellValue("POWER(C2,C3)");
		row = spreadsheet.createRow(5);
		cell = row.createCell(1);
		cell.setCellValue("MAX =");
		cell = row.createCell(2);
		// Create MAX formula
		cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
		cell.setCellFormula("MAX(C2,C3)");
		cell = row.createCell(3);
		cell.setCellValue("MAX(C2,C3)");
		row = spreadsheet.createRow(6);
		cell = row.createCell(1);
		cell.setCellValue("FACT =");
		cell = row.createCell(2);
		// Create FACT formula
		cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
		cell.setCellFormula("FACT(C3)");
		cell = row.createCell(3);
		cell.setCellValue("FACT(C3)");
		row = spreadsheet.createRow(7);
		cell = row.createCell(1);
		cell.setCellValue("SQRT =");
		cell = row.createCell(2);
		// Create SQRT formula
		cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
		cell.setCellFormula("SQRT(C5)");
		cell = row.createCell(3);
		cell.setCellValue("SQRT(C5)");
		workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
		FileOutputStream out = new FileOutputStream(new File("c:/07.24-file/formula.xls"));
		workbook.write(out);
		out.close();
		System.out.println("fromula.xlsx written successfully");
	}

}
