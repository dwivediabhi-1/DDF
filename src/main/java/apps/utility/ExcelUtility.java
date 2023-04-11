package apps.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class ExcelUtility {

	public FileInputStream fis = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xclFilepath = "C://Users//Admin//eclipse-workspace//DelhiDutyFree//download//DDF.xlsx";

	private XSSFSheet getSheet(String sheetName) throws Exception {
		fis = new FileInputStream(xclFilepath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		return sheet;
	}

	public String getCellData(String sheetName, String colName, int rowNum) throws Exception {

		try {
			int col_Num = -1;
			XSSFSheet sht = getSheet(sheetName);
			row = sht.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}

			row = sht.getRow(rowNum - 1);
			cell = row.getCell(col_Num);

			if (cell.getCellType() == CellType.STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType() == CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist  in Excel";
		}
	}

	public Map<String, Map<String, String>> getExcelAsMap(String SheetName) throws Exception {
		XSSFSheet sheetname = getSheet(SheetName);
		Map<String, Map<String, String>> completeSheetData = new HashMap<String, Map<String, String>>();
		List<String> columnHeader = new ArrayList<String>();
		Row row = sheetname.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			columnHeader.add(cellIterator.next().getStringCellValue());
		}
		int rowCount = sheet.getLastRowNum() + 1;
		int columnCount = row.getLastCellNum();
		for (int i = 0; i <= rowCount - 1; i++) {
			Map<String, String> singleRowData = new HashMap<String, String>();
			Row row1 = sheetname.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				Cell cell = row1.getCell(j);
				singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
			}
			completeSheetData.put(String.valueOf(i), singleRowData);
		}
		return completeSheetData;
	}

	public String getCellValueAsString(Cell cell) {
		String cellValue = null;
		switch (cell.getCellType()) {
		case NUMERIC:
			cellValue = String.valueOf(cell.getNumericCellValue());
			break;
		case STRING:
			cellValue = cell.getStringCellValue();
			break;
		case BOOLEAN:
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case FORMULA:
			cellValue = cell.getCellFormula();
		case BLANK:
			cellValue = "BLANK";
		default:
			cellValue = "DEFAULT";
		}
		return cellValue;
	}
}
