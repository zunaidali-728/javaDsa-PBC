public class Recursion_question {
    public static void main(String[] args) {
        // through recursion print the  n to 1
        print(5);
        System.out.println();
        print_1(1);
        System.out.println();
        print_1_n(1);
        System.out.println();
        num(5);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sum_upto(5));
        System.out.println(sumOf(1,0));


    }
    static void print(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    static void print_1(int n){
        if (n == 6){
            return;
        }
        print_1(n+1);
        System.out.print(n + " ");
    }
    static void print_1_n(int n){
        if (n == 6){
            return;
        }
        System.out.print(n + " ");
        print_1_n(n+1);
    }
    static void num(int n){
        if (n == 0){
            return;
        }
        num(n-1);
        System.out.print(n + " ");
    }
    static  int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        if (n<0){
            return -1;
        }
        return n * factorial(n-1);
    }
    static int sum_upto(int n){
        if (n == 1) return 1;
        return n + sum_upto(n-1);
//        int a = n + sum_upto(n-1);   // return n + sum_upto(n-1);
//        return a;
    }
    static int sumOf(int n , int total_sum) {
        if (n == 6) return total_sum;

        total_sum += n;
        return sumOf(n + 1, total_sum);
    }
}
