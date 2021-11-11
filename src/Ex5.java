import java.util.Scanner;

public class Ex5 {
    public static int employeeDetails( int employeeType, int numberOfHour, int numberOfArrivalsToDestination) {
        int salaryForHour = 0;
        if (employeeType == 0) {
            salaryForHour = 50;
        } else if (employeeType == 1) {
            salaryForHour = 250;}
        int sum = (salaryForHour*numberOfHour) + (numberOfArrivalsToDestination*250);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your employee type: ");
        int employeeType = scanner.nextInt();
        System.out.println("enter your number of hours: ");
        int numberOfhour = scanner.nextInt();
        System.out.println("enter your number of day you arrivals to the destination : ");
        int numberOfArrivalsToDestination = scanner.nextInt();
        int monthlySalary = employeeDetails(employeeType ,numberOfhour , numberOfArrivalsToDestination);
        if(employeeType == 1 || employeeType ==0) {
            employeeDetails(employeeType, numberOfhour, numberOfArrivalsToDestination);
            System.out.println("your monthly salary is: " + monthlySalary);
        }
        else {
            System.out.println("employee number invalid");}


    }
}


