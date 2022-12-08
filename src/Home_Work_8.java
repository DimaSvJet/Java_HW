public class Home_Work_8 {
    public static void main(String[] args) {

        int shuttle = 100;
        int numberShuttle = 0;

        for (int i = 1; i <= shuttle; i++) {
            if ((numberShuttle + 1) != 4 & (numberShuttle + 1) != 9) {
                numberShuttle++;
            }
            else numberShuttle += 2;
            System.out.println(i + ") " + "№ шатла: "+numberShuttle);
        }

    }
}