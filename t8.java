/**
 * Created by student8 on 15.02.2017.
 */

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class t8 {
    public static void main(String[] args) {
        int n;
        int temp;
        boolean isPrime = true;
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();

        for (int i = 2; i <= sqrt(n); i++) {
            temp = n % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " - Простое число");
        } else {
            System.out.println(n + " - Cоставное число");
        }
    }

}

