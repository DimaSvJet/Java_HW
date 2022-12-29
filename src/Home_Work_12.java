import java.util.Random;
import java.util.Scanner;

public class Home_Work_12 {
    public static void main(String[] args) {
        String personCall;
        String personCall1;
       Person person1 = new Person("Will","Smith", "New York", "2936729462846");
        personCall = Person.personInfo("Will","Smith", "New York", "2936729462846"); //a
        personCall1 = person1.personInfo("Will","Smith", "New York", "2936729462846");//b
        System.out.println("a. " +personCall);
        System.out.println("b. " +personCall1);
        System.out.println("c. " +person1);

       Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
       //System.out.println(person2);
       Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
       //System.out.println(person3);
    }
}



