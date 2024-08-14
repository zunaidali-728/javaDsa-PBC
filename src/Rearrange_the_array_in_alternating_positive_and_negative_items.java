import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange_the_array_in_alternating_positive_and_negative_items {
    public static void main(String[] args) {
        int[] a = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrange(a)));
        System.out.println(Arrays.toString(rearrangeArray(a)));

    }
    static int[] rearrange(int[] nums){
        int[] a = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();

        int j = 0;
        int k = 0;

        for(int i : nums){
            if (i > 0){
                if (2*j < nums.length) a[2*j++] = i;
            }
            if (i < 0){
                if (2*k+1 < nums.length) a[2*k++ + 1] = i;
            }
        }

        return a;
    }

    static int[] rearrangeArray(int[] nums){
        if(nums.length == 2){
            if ((nums[0] < 0)){
               int temp = nums[0];
               nums[0] = nums[1];
               nums[1] = temp;
            }
            return nums;
        }

        int j = 0;
        int i = 0;
        while(i < nums.length && 2*j < nums.length-2){

            if(nums[2*j] > 0){   // 3,1,-2,-5,2,-4
                j++;
                i++;
            }

            if(nums[i] > 0){
                int temp = nums[i];
                nums[i] = nums[2*j];
                nums[2*j] = temp;
            }
            i++;

        }

        return nums;
    }
}
