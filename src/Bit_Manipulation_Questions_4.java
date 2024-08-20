public class Bit_Manipulation_Questions_4 {
    public static void main(String[] args) {
//        power of a raised to power b with bit manipulation T.C = O(log b)
        System.out.println(powerOf_a_upon_b(3,6));
        System.out.println(nthRowSum_pascal_triangle(3));
        System.out.println(first_bit_or_right_most_bit(16));
    }
    static int powerOf_a_upon_b(int base, int power){
        int ans = 1;
        while(power != 0){
            if ((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }
    static int nthRowSum_pascal_triangle(int n){
        // we know that nth row sum = 2 ^ (n-1) and sum of  all nth row 0 to n = 2^n
        // we know that a<<b = a*2^b
        int sum = 1 << (n-1); // it give the 1*2^(n-1)
        return sum;

    }
    static int first_bit_or_right_most_bit(int n){
//we use the power of two and run the exponent value to 0 to k at first we get the x > 0 it is the first bit...
        // we do with bit of negative number
        int num = n & -n; // ,if it ask about the value of first bit it is num
        int count = 0; // it give the position of the first bit, right most bit
        while(num > 0){
            num >>= 1;
            count++;
        }

        return count;

    }
    static int count_set_bit(int n){
        // use the inbuilt funtion
//       return Integer.bitCount(n);

        // use this
//        int count = 0;
//        while(n > 0){
//            n = n & (n-1);
//            count++;
//        }
//
//        return count;

        // use  this also
        int count = 0;
        while(n > 0){
            n -= (n & -n); // subtract the every bit till zero
            count++;
        }
        return count;
    }
}
