import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the IRS Please enter your arrival details.");
        System.out.println("enter your day visit: ");
        int day = scanner.nextInt();
        System.out.println("Enter the earliest time you can arrive: ");
        int earliestHour = scanner.nextInt();
        System.out.println("enter your later ime you can arrive: ");
        int laterHour = scanner.nextInt();
        if (day<1 || day>7) {
            System.out.println("day not exist!");
        }
        else if (day == 6 || day == 7) {
            System.out.println("the offices is closing in the weekend's!  The following are the opening hours of the income tax offices:\n" +
                    "On Sundays, Mondays, Wednesdays and Thursdays the offices are open from 09:00 to 17:00.\n" +
                    "On Tuesdays the offices are open from 08:00 to 12:00.");
        }
        else if (laterHour < 0 || laterHour> 23 ){
            System.out.println("hour not exist!");
        }
        else if (earliestHour < 0 || earliestHour > 23) {
            System.out.println("hour not exist!");
        }
        else if (earliestHour > laterHour) {
            System.out.println("the earlie hour can't be latter from the latter hour!");
        }
        else if ((day >= 1 || day<=5) && (day!=3) && (earliestHour < 9 || earliestHour>17)) {
            System.out.println(" The following are the opening hours of the income tax offices:\n" +
                    "On Sundays, Mondays, Wednesdays and Thursdays the offices are open from 09:00 to 17:00.\n" +
                    "On Tuesdays the offices are open from 08:00 to 12:00.");
        }
        else if ((day == 3 )&& (earliestHour < 8 || earliestHour>12)) {
            System.out.println(" The following are the opening hours of the income tax offices:\n" +
                    "On Sundays, Mondays, Wednesdays and Thursdays the offices are open from 09:00 to 17:00.\n" +
                    "On Tuesdays the offices are open from 08:00 to 12:00.");
        }
        else if ((day >= 1 || day<=5 )&& (day!=3) && (laterHour < 9 || laterHour>17)) {
            System.out.println(" The following are the opening hours of the income tax offices:\n" +
                    "On Sundays, Mondays, Wednesdays and Thursdays the offices are open from 09:00 to 17:00.\n" +
                    "On Tuesdays the offices are open from 08:00 to 12:00.");
        }
        else if ((day ==3) && (laterHour < 8 || laterHour>12)) {
            System.out.println(" The following are the opening hours of the income tax offices:\n" +
                    "On Sundays, Mondays, Wednesdays and Thursdays the offices are open from 09:00 to 17:00.\n" +
                    "On Tuesdays the offices are open from 08:00 to 12:00.");
        }
        else {
            System.out.println("Your order has been successfully placed!");
        }
    }
}
