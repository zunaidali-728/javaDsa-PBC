import java.util.Arrays;

public class sort_jumble {
    public static void main(String[] args) {
        int[] a = {8,9,4,0,2,1,3,5,7,6};
        int[] b = {1000000000,99999999};
        System.out.println(Arrays.toString(sortJumbled(a,b)));
//        System.out.println(2<<2);
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int[] a = new int[nums.length];
        int j = 0;

        for (int i : nums){
            a[j++] = check(mapping,i);

        }

        for(int i = 0; i<nums.length-1; i++){
            for (int k = i+1; k<nums.length; k++){
                if(a[k] < a[i]){

                    nums[i] = nums[i]^nums[k];
                    nums[k] = nums[i]^nums[k];
                    nums[i] = nums[i]^nums[k];

                    a[i] = a[i]^a[k];
                    a[k] = a[i]^a[k];
                    a[i] = a[i]^a[k];

                }
            }
        }


        return nums;



    }
   static int check(int[] a, int k){
       String s = Integer.toString(k);
       int r = 0;

       for (int i = 0; i<s.length(); i++){
           r = r*10 + a[Integer.parseInt(String.valueOf(s.charAt(i)))];
       }

       return r;

    }
}
