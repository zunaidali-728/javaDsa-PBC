public class Repeated_sum_of_digits {
    public static void main(String[] args) {
        // sum of the digit till single digit.....
        System.out.println(sum(12345));
    }
    static int sum(int n){
        if (n < 10){
            return n;
        }
        return sum(digSum(n,0));
    }
    static int digSum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n % 10;
        return digSum(n / 10, sum);
    }
}
