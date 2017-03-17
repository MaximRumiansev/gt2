
/**
 * Created by student8 on 15.02.2017.
 */

import java.util.Scanner;

public class t10 {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int i = 0;
        int fib;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }

    }
}