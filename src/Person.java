public class Person {

    public String name;
    public String lastName;
    public String city;
    public long mob;

    public Person(String name, String lastName, String city, String mob) {
        this.name = name.trim();
        this.lastName = lastName.trim();
        this.city = city.trim();
        this.mob = Long.parseLong(mob.trim());
    }

    public static String personInfo(String name, String lastName, String city, String mob){
       String personInform = "Зателефонувати громадянинові " + name.trim() + " " + lastName.trim() + " із міста " +
                city.trim() + " можна за номером: " + Long.parseLong(mob.trim());
        return personInform;
    }


    @Override
    public String toString() {
        return "Зателефонувати громадянинові " +
                name +
                " " + lastName + " із міста " +
                city +
                " можна за номером: " + mob;
    }
}
