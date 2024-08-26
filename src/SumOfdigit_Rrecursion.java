public class SumOfdigit_Rrecursion {
    public static void main(String[] args) {
        System.out.println(sum_of_digit(1342,0));
        System.out.println(sum_of_digit(1342));
        System.out.println(product(351));
    }
    static int sum_of_digit(int n, int sum){
        if (n == 0){
            return sum;
        }

        sum += n%10;
        return sum_of_digit(n/10, sum);
    }
    static int sum_of_digit(int n){
        if (n == 0){
            return 0;
        }
        return n%10 + sum_of_digit(n/10);
//        int a = n%10 + sum_of_digit(n/10);
//        return a;
    }
    static int product(int n){
        if (n == 0) return 1;

        return (n%10) * product(n/10);

//        int a  = n % 10 * product(n/10);
//        return a;

    }
}
