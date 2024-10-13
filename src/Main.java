import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playerAgain;
        Random gen = new Random();

        do {
            playerA = getPlayerMove("A", in);

            playerB = getPlayerMove("B", in);

            String result = determineWinner(playerA, playerB);
            System.out.println(result);

            System.out.println("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().trim();
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}