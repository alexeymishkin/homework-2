import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.GregorianCalendar;

public class dataGenerator {



    public static int anyRandomIntRange(int low, int high) {
        Random random = new Random();
        int randomInt = random.nextInt(high - low) + low;
        return randomInt;
    }

    public static String generateString(String mode, String sex) {
        String data;
        if (mode != "firstName" & mode!="lastName" & mode!="middleName"){
            data = csvreader.readLine(mode+".csv");
        }
        else {
            data = csvreader.readLine(mode.concat(sex) + ".csv");
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

}
