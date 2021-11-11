import java.util.Scanner;

public class Ex9 {
    public static boolean modulo(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primeNumber(int aNumber) {
        if (aNumber == 1 || aNumber == 2) {
            return (true);
        }
        for (int prime = 2; prime < aNumber; prime++) {
            if (modulo(aNumber,prime)) {
                return (false);
            } else if (prime == aNumber - 1) {
                return (true);
            }
        }return true;
    }
    public static int positive(int positiveNumber){
        Scanner scanner = new Scanner(System.in);
        while (positiveNumber<1){
            System.out.println("enter a positive number!");
            positiveNumber= scanner.nextInt();
        } return positiveNumber;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive number: ");
        int newNumber = positive(scanner.nextInt());
        for (int allOpshen=1;allOpshen<newNumber;allOpshen++ ){
            primeNumber(allOpshen);
            if (primeNumber(allOpshen)==true){
                System.out.println(allOpshen);
            }
        }
    }
}

