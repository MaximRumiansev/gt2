/**
 * Created by student8 on 15.02.2017.
 */
public class t9 {
    public static void main(String[] args) {
        int n = 100;
        boolean[] a = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!a[i]) {
                for (int j = i * i; j < n; j += i) {
                    a[j] = true;
                }
            }
        }

        for (int i = 2; i < n; ++i) {
            if (!a[i]) {
                System.out.println(i);
            }
        }
    }
}

