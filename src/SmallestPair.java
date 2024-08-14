import java.util.Arrays;
import java.util.*;

public class SmallestPair {
    public static void main(String[] args) {
 /*       Implement the following Function
        def ProductSmallestPair(sum, arr)
        The function accepts an integer sum and an integer array arr of size n.
        Implement the function to find the pair, (arr[j], arr[k]) where j!=k,such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair.

                Note:
        Return -1 if array is empty or if n < 2
        Return 0, if no such pairs found.
        All computed values lie within integer range.

                Example:
        Input
        sum:9
        Arr:5 2 4 3 9 7 1

        Output
        2    */
        Scanner sc = new Scanner(System.in);
        int sum = 9;
        int[] a = {5,2,4,3,9,7,1};
        System.out.println(ProductSmallestPair(sum,a));
    }

    static int ProductSmallestPair(int sum, int[] arr){
          int n = arr.length;
          if(n < 2){
              return -1;
          }
          Arrays.sort(arr);
//        int min = Integer.MAX_VALUE;
//          for(int i  : arr){
//              min = Math.min(min,i);
//          }
//        int second_min  = Integer.MAX_VALUE;


          int p = arr[0]*arr[1];
          if(p<=sum){
              return p;
          }
          return 0;
    }
}
