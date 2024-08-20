public class Bit_Manipulation_Questions_3 {
    public static void main(String[] args) {
      // find the nth magic number.. basically magic number is power of 5 and sum of uniques power of 5
        System.out.println(findNthMagicNum(4));

        int n = 23546;
        int base = 5;
        System.out.println(no_Of_digit(n,base));
    }
    static long findNthMagicNum(int n){
      int base = 5;
        long num = 0;
        while(n != 0){  // the time complexity is that is equal to log(n)  it run till n = 0 with total digit in binary Form 6 --> 110 total digit in binary form is 3 it runs 3 times
            int last_num = n&1;
            num += last_num * base;
//            num += (n&1)*(int)Math.pow(5,i++);  //(n&1) tell us about what is the last bit 0/1
            base *= 5;
            n >>= 1;
        }
        return num;
    }
    static int no_Of_digit(int n,int base){
//        first, we count in each iteration and till n!=0
//        next is formula -> (int)Math.log(base)(num)+1
   //     int digit = (int)Math.log10(n)+1; // it give the digit of n on the basis of base 10 because the base is 10

        int digit = (int)(Math.log(n) / Math.log(base)) + 1;

        return digit;

    }

}
