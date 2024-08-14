import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class movesZeros {
    public static void main(String[] args) {
        int[] a  = {1,0,2,0,3,3,0};

        moveZeroes(a);
        System.out.println(Arrays.toString(a));

    }
    public static  void moveZeroes(int[] nums) {

        int n = 0;
         for (int  i : nums){
             if(i == 0){
                 n++;
             }
         }

        int k = nums.length-1;
         if (nums[k] == 0){
             k--;
         }

         int j  = nums.length-n;
         int i = 0;



         while(k >= j){


             if(nums[i] != 0){
                 i++;
             }

             for (int l = i; l < k  ; l++) {
                 if(nums[l] == 0){
                     int temp = nums[l];
                     nums[l] = nums[l+1];
                     nums[l+1] = temp;
                 }
             }

             if(nums[k] == 0){
                 k--;
             }

         }






    }
}
