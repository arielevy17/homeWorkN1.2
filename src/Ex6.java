import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.Scanner;

public class Ex6 {
    public static String invoiceSeries(int a1,int d, int n) {
        int an = a1;
        if (n < 1 || n % 1 != 0) {
            System.out.println("n- must be an integer and positive!");
        } else {
            System.out.print(a1 + "_");
            for (int dCounter = 0; dCounter <= n; dCounter++, an = a1 + (dCounter * d)) {
                System.out.print(d + an + "_");
            }
        } return " ";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a1: ");
        int a1 = scanner.nextInt();
        System.out.println("enter d: ");
        int d = scanner.nextInt();
        System.out.println("enter n: ");
        int n = scanner.nextInt();
        System.out.print("your members of the series are: ");
        System.out.println(invoiceSeries(a1,d,n) );
    }
}

