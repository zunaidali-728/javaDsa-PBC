import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subarray_Sum_divisible_by_k {
    public static void main(String[] args) {
      int[] a = {4,5,0,-2,-3,1};
        System.out.println(subArraySum(a,5));



    }
    static int  subArraySum(int[] nums, int k){
        int cnt = 0;
        int sum;
        for (int i = 0; i < nums.length ; i++) {
            sum = 0;
            for (int j = i; j < nums.length ; j++) {
                sum += nums[j];
                if(sum % k == 0){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
