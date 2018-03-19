import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import java.io.*;


public class homework {
    public static void main(String[] args) {
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet("data");
        int len = dataGenerator.anyRandomIntRange(1,31);
        person[] persons = new person[len] ;
        int i =0;
        while (i<len-1) {
            HSSFRow row = sheet.createRow(i);
            person a = new person();
            HSSFCell firstName = row.createCell(0);
            firstName.setCellValue(a.firstName);
            HSSFCell middleName = row.createCell(1);
            middleName.setCellValue(a.middleName);
            HSSFCell lastName = row.createCell(2);
            lastName.setCellValue(a.lastName);
            HSSFCell sex = row.createCell(3);
            sex.setCellValue(a.sex);
            HSSFCell birthDate = row.createCell(4);
            HSSFDataFormat format = book.createDataFormat();
            HSSFCellStyle dateStyle = book.createCellStyle();
            dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
            birthDate.setCellStyle(dateStyle);
            birthDate.setCellValue(a.birthDate);
            HSSFCell age = row.createCell(5);
            age.setCellValue(a.age);
            HSSFCell birthPlace = row.createCell(6);
            birthPlace.setCellValue(a.birthPlace);

            i++;
        }
        sheet.autoSizeColumn(1);
        try {
            book.write(new FileOutputStream("output/123.xls"));
            book.close();
        }
        catch (FileNotFoundException qwe){System.out.println(qwe.getMessage());
        }
        catch (IOException qwe){System.out.println(qwe.getMessage());
        }


    }
}