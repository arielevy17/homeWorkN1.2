import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ex8 {
    public static int yourChoose (int yourNumber) {
        Scanner scanner = new Scanner(System.in);
        while (yourNumber < 5 || yourNumber > 20) {
            System.out.println("your number is not available!");
            System.out.println("enter your number again:");
            yourNumber = scanner.nextInt();
        }
        return yourNumber;
    }
    public static void star(int howMachStar) {
        for (int starCounter = 0; starCounter<howMachStar; starCounter++) {
            for (int i = 0; i <= starCounter; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your star number: ");
        int starNumber = yourChoose(scanner.nextInt());
        star(starNumber);
    }
}
