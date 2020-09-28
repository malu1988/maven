package pckg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("/Users/maluabhilash/Desktop/mmm.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		int r=xt.getPhysicalNumberOfRows();
		
		for(int i=0;i<=r;i++) {
			XSSFRow xr=xt.getRow(i);
			for(int j=0;j<xr.getPhysicalNumberOfCells();j++)
			{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
		}
		
	}

}
