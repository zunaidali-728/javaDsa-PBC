import java.util.Arrays;

public class DAY2 {
    public static void main(String[] args) {
        System.out.println(fiboElement(5));
        System.out.println(reverseNum(1534236469));
        System.out.println(Arrays.toString(gcdNLcm(14,8)));
    } //0 1 1 2 3 5 8

    static int fiboElement(int n) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    static int reverseNum(int x) {
        long n = 0;
        int a = x;

        if (x < 0) {
            x = -x;
        }

        while (x > 0) {
            n = n * 10 + (x % 10);
            x = x / 10;
        }

        if (n > 2147483647 || n < -2147483648) {
            return 0;
        }

        if (a < 0) {
            return (int) -n;
        }

        return (int) n;
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int n = 0;
        int a = x;

        while (x > 0) {

            n = n * 10 + (x % 10);
            x = x / 10;

        }

        if (n == a) {
            return true;
        }

        return false;

    }

    static int[] gcdNLcm(int a, int b){
        int[] x = new int[2];

        int p = a;
        int q  = b;

        while(a%b != 0){
            int rem = a%b;
            b = rem;
        }

        x[0] = b;

        int i = 1;
        while(i%p != 0 || i%q != 0){
            i++;
        }

        x[1] = i;

        return x;





    }
}
