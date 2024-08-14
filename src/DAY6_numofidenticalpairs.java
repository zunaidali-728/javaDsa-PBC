public class DAY6_numofidenticalpairs {
    public static void main(String[] args) {
          int[] a = {1,1,1,1};
        System.out.println(identicalPairs(a));
    }
    static int identicalPairs(int[] nums){
         int n = 0;
        for (int i = 0; i <  nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    n++;
                }
            }
     }

        return n;

    }

}
