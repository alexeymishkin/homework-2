import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {
    static String firstName;
    static String lastName;
    static String middleName;
    static int age;
    static String sex;
    static String birthPlace;
    static String test;
    static Date birthDate;

    {

        Date now = new Date();
        DataGenerator generator = new DataGenerator();
        this.sex = generator.generateSex();
        this.firstName = generator.generateString("firstName", this.sex);
        this.lastName = generator.generateString("lastName", this.sex);
        this.middleName = generator.generateString("middleName", this.sex);
        this.birthPlace = generator.generateString("birthPlace", this.sex);
        this.birthDate = generator.generateDate();
        long age = generator.calcAge(this.birthDate);
        System.out.printf("\nName "+this.firstName);
        System.out.printf("\nMiddleName "+this.middleName);
        System.out.printf("\nLastNmae "+this.lastName);
        System.out.printf("\nSex "+this.sex);
        System.out.printf("\nBirthDate"+this.birthDate);
        System.out.printf("\nAge "+age);
        System.out.printf("\nBirthPlace "+this.birthPlace);
    }

}