public class Person {


    public static String personInfo(String name, String lastName, String city, String mob){
       String personInform = "Зателефонувати громадянинові " + name.trim() + " " + lastName.trim() + " із міста " +
                city.trim() + " можна за номером: " + Long.parseLong(mob.trim());
        return personInform;
    }


}
