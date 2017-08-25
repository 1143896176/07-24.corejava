package excel;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXls {
	
	public static void main(String[] args) throws Exception  {
		
		OutputStream out = new FileOutputStream("c:/07.24-file/demo.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("产品信息");
		
		HSSFRow row_title = sheet.createRow(0);
		
		HSSFCell row_title_cell0 = row_title.createCell(0);
		row_title_cell0.setCellValue("编号");
		HSSFCell row_title_cell1 = row_title.createCell(1);
		row_title_cell1.setCellValue("名称");
		HSSFCell row_title_cell2 = row_title.createCell(2);
		row_title_cell2.setCellValue("价格");
		
		for (int i = 1 ; i <= 3 ; i++) {
			HSSFRow row = sheet.createRow(i);
			
			for (int j = 0; j < 3; j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue(i + "-" + j);
			}
			
		}
		
		
		wb.write(out);
		
		out.flush();
		out.close();
		
		
		
	}

}
