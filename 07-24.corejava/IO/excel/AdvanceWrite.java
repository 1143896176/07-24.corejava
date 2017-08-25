package excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

public class AdvanceWrite {

	
	//ÑשÊ½
	
	public static void main(String[] args) throws Exception {

		HSSFWorkbook workbook = new HSSFWorkbook(); 
	      HSSFSheet spreadsheet = workbook.createSheet("cellstyle");
	      HSSFRow row = spreadsheet.createRow((short) 1);
	      row.setHeight((short) 800);
	      HSSFCell cell = (HSSFCell) row.createCell((short) 1);
	      cell.setCellValue("test of merging");
	      //MEARGING CELLS 
	      //this statement for merging cells
	      spreadsheet.addMergedRegion(new CellRangeAddress(
	      1, //first row (0-based)
	      1, //last row (0-based)
	      1, //first column (0-based)
	      4 //last column (0-based)
	      ));
	      //CELL Alignment
	      row = spreadsheet.createRow(5); 
	      cell = (HSSFCell) row.createCell(0);
	      row.setHeight((short) 800);
	      // Top Left alignment 
	      HSSFCellStyle style1 = workbook.createCellStyle();
	      spreadsheet.setColumnWidth(0, 8000);
	      style1.setAlignment(HSSFCellStyle.ALIGN_LEFT);
	      style1.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
	      cell.setCellValue("Top Left");
	      cell.setCellStyle(style1);
	      row = spreadsheet.createRow(6); 
	      cell = (HSSFCell) row.createCell(1);
	      row.setHeight((short) 800);
	      // Center Align Cell Contents 
	      HSSFCellStyle style2 = workbook.createCellStyle();
	      style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	      style2.setVerticalAlignment( 
	      HSSFCellStyle.VERTICAL_CENTER);
	      cell.setCellValue("Center Aligned"); 
	      cell.setCellStyle(style2);
	      row = spreadsheet.createRow(7); 
	      cell = (HSSFCell) row.createCell(2);
	      row.setHeight((short) 800);
	      // Bottom Right alignment 
	      HSSFCellStyle style3 = workbook.createCellStyle();
	      style3.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
	      style3.setVerticalAlignment( 
	      HSSFCellStyle.VERTICAL_BOTTOM);
	      cell.setCellValue("Bottom Right");
	      cell.setCellStyle(style3);
	      row = spreadsheet.createRow(8);
	      cell = (HSSFCell) row.createCell(3);
	      // Justified Alignment 
	      HSSFCellStyle style4 = workbook.createCellStyle();
	      style4.setAlignment(HSSFCellStyle.ALIGN_JUSTIFY);
	      style4.setVerticalAlignment(
	      HSSFCellStyle.VERTICAL_JUSTIFY);
	      cell.setCellValue("Contents are Justified in Alignment"); 
	      cell.setCellStyle(style4);
	      //CELL BORDER
	      row = spreadsheet.createRow((short) 10);
	      row.setHeight((short) 800);
	      cell = (HSSFCell) row.createCell((short) 1);
	      cell.setCellValue("BORDER");
	      HSSFCellStyle style5 = workbook.createCellStyle();
	      style5.setBorderBottom(HSSFCellStyle.BORDER_THICK);
	      style5.setBottomBorderColor(
	      IndexedColors.BLUE.getIndex());
	      style5.setBorderLeft(HSSFCellStyle.BORDER_DOUBLE);
	      style5.setLeftBorderColor( 
	      IndexedColors.GREEN.getIndex());
	      style5.setBorderRight(HSSFCellStyle.BORDER_HAIR);
	      style5.setRightBorderColor( 
	      IndexedColors.RED.getIndex());
	      style5.setBorderTop(HSSFCellStyle.BIG_SPOTS);
	      style5.setTopBorderColor( 
	      IndexedColors.CORAL.getIndex());
	      cell.setCellStyle(style5);
	      //Fill Colors
	      //background color
	      row = spreadsheet.createRow((short) 10 );
	      cell = (HSSFCell) row.createCell((short) 1);
	      HSSFCellStyle style6 = workbook.createCellStyle();
	      style6.setFillBackgroundColor(
	      HSSFColor.LEMON_CHIFFON.index );
	      style6.setFillPattern(HSSFCellStyle.LESS_DOTS);
	      style6.setAlignment(HSSFCellStyle.ALIGN_FILL);
	      spreadsheet.setColumnWidth(1,8000);
	      cell.setCellValue("FILL BACKGROUNG/FILL PATTERN");
	      cell.setCellStyle(style6);
	      //Foreground color
	      row = spreadsheet.createRow((short) 12);
	      cell = (HSSFCell) row.createCell((short) 1);
	      HSSFCellStyle style7=workbook.createCellStyle();
	      style7.setFillForegroundColor(HSSFColor.BLUE.index);
	      style7.setFillPattern( HSSFCellStyle.LESS_DOTS);
	      style7.setAlignment(HSSFCellStyle.ALIGN_FILL);
	      cell.setCellValue("FILL FOREGROUND/FILL PATTERN");
	      cell.setCellStyle(style7);
	      FileOutputStream out = new FileOutputStream(
	      new File("c:/07.24-file/cellstyle.xls"));
	      workbook.write(out);
	      out.close();
	      System.out.println("cellstyle.xlsx written successfully");
	}

}
