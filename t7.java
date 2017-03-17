/**
 * Created by student8 on 15.02.2017.
 */

import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        int n;
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.println("Число " + n + " делится на ");
        for (int i = 1; i <= n/2; i++) {
            if ((n % i) == 0) {
                System.out.println(i);
            }

        }System.out.println(n);
    }
}

