public class MaximumExponent {
    public static void main(String[] args) {
/*        You are given a function:
        Int MaxExponents (int a , int b);
        You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.
        The algorithm to find the number with maximum exponent of 2 between the given range is

        Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
        Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so far in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
        Return ‘max’.

        Assumption: a < b
        Note: If two or more numbers in the range have the same exponents of 2 , return the small number.

        Example
        Input:
        7
        12

        Output:
        8   */
        int a = 10; int b = 20;
        System.out.println(maxExponent(a,b));
        System.out.println(powerOf_2_Or_Not(10));

    }
    static int maxExponent(int a, int b){
        int max_2_power = 0; int max_exp = 0; int exp;

        for(int i = a; i<=b; i++){
            int n = i;exp = 0;
            while((n&1) != 1){
                exp++;
                n >>= 1;
            }
            if ((int)Math.pow(2,exp) == i){
                if (exp > max_exp){
                    max_exp = exp;
                    max_2_power = i;
                }
            }
        }
        return max_2_power;
    }
     static boolean powerOf_2_Or_Not(int n){
//    without_loop using & operator
//         int a = n & (n-1); --> 0

//         return a == 0;
         //    without_loop using & , ~  operator
         int b = n & (-n); // n --> !(n-1) == -n;

         return b == n;


    }

}
