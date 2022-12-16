import java.util.Random;

public class Home_Work_10 {
    public static void main(String[] args) {

        int amountNumbers = 7;
        int[] lotteryOrganizer = new int[amountNumbers];
        int[] answerPlayer = new int[amountNumbers];

        Random random = new Random();

        //lottery initialization
        System.out.println("Lottery numbers");
        for (int i = 0; i < lotteryOrganizer.length; i++) {
            lotteryOrganizer[i] = random.nextInt(10);
            System.out.print(lotteryOrganizer[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Player`s numbers: ");
        for (int i = 0; i < answerPlayer.length; i++) {
            answerPlayer[i] = random.nextInt(10);
            System.out.print(answerPlayer[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        // Lottery numbers sorting
        for (int i = 1; i < lotteryOrganizer.length - 1; i++) {
            for (int j = 0; j < lotteryOrganizer.length - i; j++) {
                if (lotteryOrganizer[j] > lotteryOrganizer[j + 1]) {
                    int temp = lotteryOrganizer[j];
                    lotteryOrganizer[j] = lotteryOrganizer[j + 1];
                    lotteryOrganizer[j + 1] = temp;
                }
            }
        }
        System.out.println("Lottery sorted: ");
        for (int i = 0; i < lotteryOrganizer.length; i++) {
            System.out.print(lotteryOrganizer[i] + " ");
        }
        System.out.println(" ");
        // Player's numbers sorting
        for (int i = 1; i < answerPlayer.length - 1; i++) {
            for (int j = 0; j < answerPlayer.length - i; j++) {
                if (answerPlayer[j] > answerPlayer[j + 1]) {
                    int temp = answerPlayer[j];
                    answerPlayer[j] = answerPlayer[j + 1];
                    answerPlayer[j + 1] = temp;
                }
            }
        }
        System.out.println("Player`s number sorted: ");
        for (int i = 0; i < answerPlayer.length; i++) {
            System.out.print(answerPlayer[i] + " ");
        }
        System.out.println(" ");

        int coincidence = 0;
        for (int i = 0; i < amountNumbers; i++)
            if (lotteryOrganizer[i] == answerPlayer[i]) {
                coincidence++;
            }
        System.out.println(" ");
        System.out.println("Кількість збігів: "+coincidence);
        }
    }




