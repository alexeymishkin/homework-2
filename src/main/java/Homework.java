import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import java.io.*;
import java.util.Arrays;



public class Homework {
    public static void main(String[] args) {
        int len = DataGenerator.anyRandomIntRange(1,31);
        Person[] persons = new Person[len] ;
        int i =0;
        while (i<len-1) {
            persons[i] = new Person();
            //persons[i] = a;
            System.out.printf(persons[i].lastName);
            i++;
        }
        //ExportUtils.exportToExcel(persons);
        System.out.println(persons[2].lastName);
        System.out.println(persons[0].lastName);
    }
}