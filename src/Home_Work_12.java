import java.util.Random;
import java.util.Scanner;

public class Home_Work_12 {
    public static void main(String[] args) {
        String personCall;

        personCall = Person.personInfo("Will","Smith", "New York", "2936729462846");
        System.out.println("a. " +personCall);


        personCall = Person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println("b. " +personCall);



        personCall = Person.personInfo("Sherlock", "Holmes", "London", "37742123513");
        System.out.println("c. " +personCall);

    }
}



