import au.com.bytecode.opencsv.CSVReader;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.GregorianCalendar;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class DataGenerator {



    public static int anyRandomIntRange(int low, int high) {
        Random random = new Random();
        int randomInt = random.nextInt(high - low) + low;
        return randomInt;
    }

    public static String generateString(String mode, String sex) {
        String data;
        if (mode != "firstName" & mode!="lastName" & mode!="middleName"){
            data = readLineFromDict("data_dict/"+mode+".csv");
        }
        else {
            data = readLineFromDict("data_dict/"+mode.concat(sex) + ".csv");
        }
        return data;
    }

    public static int generateInt() {
        return anyRandomIntRange(0, 30);
    }

    public static Date generateDate() {
        Date d1 = new GregorianCalendar(anyRandomIntRange(1950, 2000), anyRandomIntRange(1, 12), anyRandomIntRange(1, 28)).getTime();
        return d1;
    }

    public static long calcAge(Date birthDate) {
        Date now = new Date();
        return (now.getTime() - birthDate.getTime()) / (1000l * 60 * 60 * 24 * 365);
    }

    public static String generateSex() {
        String sex = new String();
        int n = anyRandomIntRange(1, 3);
        if (n == 1) {
            sex = "Male";
        } else {
            sex = "Female";
        }
        return sex;
    }

    public static String readLineFromDict(String filename)
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
            return lst.get(DataGenerator.anyRandomIntRange(0, lst.size()));
        }
        else{
            throw new java.lang.Error("Файл пуст или отсутствует");
        }
    }

}
