import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number : " + randomNumber);
        int tryCount = 0;


        while (true){
            System.out.println("Enter a guess : ");
            int playerGuess = scan.nextInt();
            tryCount++;

            if (playerGuess == randomNumber){
                System.out.println("Correct!");
                System.out.println("Number of attempts : " + tryCount);
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Higher! Guess again");
            }else {
                System.out.println("Lower! Guess again");
            }
        }

    }
}
