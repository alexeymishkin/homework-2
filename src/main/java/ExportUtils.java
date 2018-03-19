import org.apache.poi.hssf.usermodel.*;
import java.io.*;

public class ExportUtils {

    public static void exportToExcel(Person[] persons) {
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet("data");
        //for (int i=0;i<persons.length;i++) {
        int i = 0;
        for (Person  a: persons){
            System.out.printf(i + a.lastName);
            HSSFRow row = sheet.createRow(i);
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
