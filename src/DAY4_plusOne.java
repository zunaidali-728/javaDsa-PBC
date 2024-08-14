import java.util.Arrays;

public class DAY4_plusOne {
    public static void main(String[] args) {
          int[] a = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(a)));

    }
//    public static int[] plusOne(int[] digits) {
//        if(digits[digits.length-1] == 0){
//            digits[digits.length-1] = 1;
//            return digits;
//        }
//        long a = 0;
//        for (int digit : digits) {
//            a = a * 10 + digit;
//        }
//
//        long n  = a+1 ;
//
//        int size = (int)Math.log10(n)+1;
//
//        int[] arr = new int[size];
//            int index = 0;
//
//        while(n > 0){
//            arr[arr.length-1-index++] = (int)(n%(long)10);
//            n  /= 10;
//        }
//
//        return arr;


    static int[] plusOne(int[] digits) {
        int[] a = new int[digits.length+1];
        a[0] = 1;

        int i = digits.length-1;
        if (digits[digits.length-1] != 9){
           digits[digits.length-1] += 1;
           return digits;
        }
        else{
            while (i >= 0 && digits[i] == 9){
                    digits[i] = 0;
                    i--;
            }
        }

        if (i < 0){
            for (int j = 1; j < a.length ; j++) {
                a[j] = digits[j-1];
            }
            return a;
        }
        else{
            digits[i] += 1;
            return digits;
        }
    }
}
