import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class csvreader {

    public static String readLine(String filename)
    {
        ArrayList<String> lst= new ArrayList<String>();
        try {
            CSVReader reader = new CSVReader(new FileReader(filename), ',', '"', 1);
            java.lang.String[] str;
            while ((str = reader.readNext()) != null) {
                if (str!=null){
                    lst.add(str[0]);
                }}
        }
        catch(FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        catch(IOException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        if (lst.size()>0) {
            return lst.get(dataGenerator.anyRandomIntRange(0, lst.size()));
        }
        else{
            throw new java.lang.Error("Файл пуст или отсутствует");
        }
    }
}
