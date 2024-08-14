import java.util.Arrays;
public class singleNmber {
    public static void main(String[] args) {
        int[] a  = {4,2,1,2,1,3,3};
        System.out.println(single(a));

    }
    static int single(int[] nums){

        int a = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            a = a ^ nums[i];
        }
        return a;
    }
}
