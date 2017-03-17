/**
 * Created by student8 on 15.02.2017.
 */

import java.util.Scanner;

public class t4 {
    public static boolean isPalindrome(String src) {
        boolean result = true;
        for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.nextLine()));
    }

}
