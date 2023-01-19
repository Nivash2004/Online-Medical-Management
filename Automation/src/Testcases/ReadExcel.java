package Testcases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

import org.openqa.selenium.WebDriver;

 

 


public class ReadExcel {

 

    WebDriver driver;

public Object[] read() throws IOException,InterruptedException  {


     Object data [] = new Object[1];

 

    //Create an object of File class to open xlsx file
    File src = new File("C:\\Users\\vakacharla.sri\\OneDrive - HCL Technologies Ltd\\Desktop\\FlipkartExcel.xlsx");

 

    //Create an object of FileInputStream class to read excel file
    FileInputStream fis = new FileInputStream(src);

 

     //Create an object of FileInputStream class to read excel file
    XSSFWorkbook wb1 = new XSSFWorkbook(fis);

     //Read sheet inside the workbook by its name
    XSSFSheet Sheet1 = wb1.getSheet("Sheet1");

    // To get the total no of rows
     Sheet1.getLastRowNum();

    // printing the total no of rows
    System.out.println(Sheet1.getLastRowNum());


              Sheet1.getRow(0).getCell(0).getStringCellValue();
              data[0]=Sheet1.getRow(0).getCell(0).getStringCellValue();
              System.out.println(Sheet1.getRow(0).getCell(0).getStringCellValue());

            return data;





}


    }