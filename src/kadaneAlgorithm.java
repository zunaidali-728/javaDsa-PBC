import java.util.ArrayList;
import java.util.List;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
    
        System.out.println(largestSumSubArray(a));
        System.out.println(maxSumSubArrayLength(a));
        System.out.println(largestSumSubArrayPrint(a));
    }
    static int largestSumSubArray(int[] a){
         int sum = 0;
         int maxSum = 0;

         for(int i : a){
             sum += i;
             maxSum = Math.max(sum,maxSum);
             if (sum < 0) sum = 0;
         }
         return maxSum;
    }
    static int maxSumSubArrayLength(int[] a){
        int sum = 0;
        int maxSum = 0; int len = 0; int maxlen = 0;

        for(int i : a){
            sum += i;
            len++;
            if (sum > maxSum){
                maxSum = sum;
                maxlen = Math.max(maxlen,len);
                len = 1;
            }
            if (sum < 0) sum = 0;
        }

        return maxlen;
    }
    static List<Integer> largestSumSubArrayPrint(int[] a){
        int sum = 0;
        int maxSum = 0;
        int s = 0; int e = 0; int j = 0;
        ArrayList<Integer> l = new ArrayList<>();


        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
            if (sum > maxSum){
                maxSum = sum;
                s = j;
                e = i; //end index will goes on to with i when it get max because we want the max sum subArray
            }
            if (sum < 0){
                sum = 0;
                j = i+1; // it is that where the sum zero start index go the next index
            }
        }
        l.add(s);l.add(e);

        return l;
    }
}
