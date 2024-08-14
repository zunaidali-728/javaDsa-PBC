import java.util.Arrays;

public class DAY3remove_duplicates {
    public static void main(String[] args) {
           int[] a = {1,1,1,2,2,3,3,3,4,4,4};
        System.out.println(Arrays.toString(removeDuplicates(a)));
    }
    public  static int[] removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] != nums[i+1]){
                k++;
            }
        }
        int index = 1;

        for (int i = 1; i <nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }



//      return (k+1);
        return nums;

    }
}
