import java.awt.*;

public class DAY5_lINEARSearch1 {
    public static void main(String[] args) {
//          int[] a = {12,3,361,63111,3,3,4};
//          int start = 0;
//          int end = 3;
//          boolean ans = linearSearchInRANGE(a,63,start, end);
//        System.out.println(ans);
//        StringBuilder sb = new StringBuilder();
//        sb.append(23);
//
//        System.out.println(sb.length()%2==0);
//        System.out.println(evenNumberOfDigit(a));
        int[][] a = {{1,2,3},{3,2},{3}};
        System.out.println(richCustomerWealth(a));



    }

    static int richCustomerWealth(int[][] a){
        int sumOfWealth;
        int maxWealth = 0;

        for (int[] arr : a){
            sumOfWealth = 0;
            for (int i : arr){
                sumOfWealth += i;
            }
            if (sumOfWealth > maxWealth){
                maxWealth = sumOfWealth;
            }
        }

        return maxWealth;
    }
    static boolean linearSearchInRANGE(int[] a, int target, int start, int end){
        if (a.length == 0){
            return false;
        }

        for (int i = start; i <= end ; i++) {
            if (a[i] == target) {
                return true;
            }
        }


        return false;
    }
    static int evenNumberOfDigit(int[] a){
        int count = 0;

        for (int element : a){
           String s = String.valueOf(element);
           if (s.length()%2==0){
               count++;
           }
        }
        return count;
    }

//    static boolean even(int a){
////        int i = 0;
////        while(a > 0){
////            a /= 10;
////            i++;
////        }
////        return i%2 == 0;
//
//        // 2nd approach
//        return (int)(Math.log10(a)+1) % 2 == 0;
//    }
}
