public class Home_Work_8 {
    public static void main(String[] args) {

        int shuttle = 100;
        int numberShuttle = 1;
        String numberStrShuttle;

        for (int i = 1; i <= shuttle; i++) {
            System.out.println(i + ") " + "№ шатла: " + numberShuttle);
            do {numberShuttle++; numberStrShuttle = Integer.toString(numberShuttle);
                } while ((numberStrShuttle.indexOf('4') >= 0) || (numberStrShuttle.indexOf('9') >= 0));
        }

        }

    }

