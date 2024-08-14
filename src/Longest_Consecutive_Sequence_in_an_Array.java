import java.util.Arrays;
import java.util.HashMap;

public class Longest_Consecutive_Sequence_in_an_Array {
    public static void main(String[] args) {
        int[] a = {0,1,1,2};
        System.out.println(longestConsecutive(a));
//        HashMap<Integer, Integer> p = new Pair<Integer, Integer>(-1, -1);




    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return 0;
        }

        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int runlen = 0;
        int maxlen = 0;

        while (j < nums.length) {

            if(nums[i] == nums[j]){
                i++;
                j++;
            }

            int d = nums[j] - nums[i];

            if (d == 1 || d == -1) {
                runlen++;
            }
            else {
                if (runlen > maxlen) {
                    maxlen = runlen;
                }
                runlen = 0;
            }
            j++;
            i++;
        }

        if (runlen > maxlen){
            maxlen = runlen;
        }

        return maxlen+1;
    }
}
