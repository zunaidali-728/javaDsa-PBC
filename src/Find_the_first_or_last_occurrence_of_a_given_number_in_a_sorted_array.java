import java.util.Arrays;

public class Find_the_first_or_last_occurrence_of_a_given_number_in_a_sorted_array {
    public static void main(String[] args) {
                 int[] a = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(occurRance(a,10)));
    }
    static int[] occurRance(int[] nums, int target){
        int[] a  = new int[]{-1,-1};

        int firstOcc = search(nums,target, true);
        if (firstOcc != -1){
            int lastOcc = search(nums,target, false);
            a[0] = firstOcc;
            a[1] = lastOcc;
            return a;
        }

        return a;


      //  5,7,7,8,8,10
    }

     static int search(int[] nums, int target, boolean b) {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s <= e){
            int m = s + (e-s)/2;

            if(target == nums[m]){
                ans = m;
                if (b){
                    e = m -1;
                }
                else{
                    s = m + 1;
                }
            }
            else if (target > nums[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }

        }

        return ans;
    }
}
