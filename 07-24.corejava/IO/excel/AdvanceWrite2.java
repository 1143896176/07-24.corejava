package excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class AdvanceWrite2 {

	/***
	 * ×ÖÌå
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet spreadsheet = workbook.createSheet("Fontstyle");
		HSSFRow row = spreadsheet.createRow(2);
		// Create a new font and alter it.
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) 30);
		font.setFontName("IMPACT");
		font.setItalic(true);
		font.setColor(HSSFColor.BRIGHT_GREEN.index);
		// Set font into style
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFont(font);
		// Create a cell with a value and set style to it.
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("Font Style");
		cell.setCellStyle(style);
		FileOutputStream out = new FileOutputStream(new File("c:/07.24-file/fontstyle.xls"));
		workbook.write(out);
		out.close();
		System.out.println("fontstyle.xlsx written successfully");
	}

}
