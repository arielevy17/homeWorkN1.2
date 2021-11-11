import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1000);
        int yourGuess = 0;
        int caunter;
        for (caunter = 1; yourGuess != secretNumber; caunter++) {
            System.out.println("player 1 enter your guess: ");
            yourGuess = scanner.nextInt();
            if (yourGuess > secretNumber){
                System.out.println("Oops you guessed too big a number");
            }
            else if (yourGuess < secretNumber) {
                System.out.println("Oops you guessed too small a number");
            }
            else if (yourGuess == secretNumber) {
                System.out.println("In my congratulations player 1 guessed the right number: !!" + secretNumber + "you are the winner after " + caunter + " attempts.");
            }
            System.out.println("player 2 enter your guess: ");
            yourGuess = scanner.nextInt();
            if (yourGuess > secretNumber){
                System.out.println("Oops you guessed too big a number");
            }
            else if (yourGuess < secretNumber) {
                System.out.println("Oops you guessed too small a number");
            }
             else if (yourGuess == secretNumber) {
                System.out.println("In my congratulations player 2 guessed the right number: " + secretNumber + "you are the winner after " + caunter + " attempts.");
            }
        }
    }
}
