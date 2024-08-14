import java.util.Arrays;

public class cretethearraywithgivenorder {
    public static void main(String[] args) {
        int[] a = {5,11,1,1,15,13,17,10,11,7,13,9,1,14,8,12,12,10,10};
        int[] b = {0,0,2,1,3,0,2,1,6,8,2,4,4,1,5,3,11,4,7};
        System.out.println(Arrays.toString(arrayCreation(a,b)));
//        13,14,10,12,10,13,11,10,8,1,9,17,1,12,5,11,15,7,1
    }


    static int[] arrayCreation(int[] nums, int[] index){
        int[] a = new int[nums.length];
        boolean[] b = new boolean[nums.length];

        for (int i = 0; i <  nums.length ; i++) {
            if (!b[index[i]]){
                a[index[i]] = nums[i];
                b[index[i]] = true;
            }
            else{
                int k = index[i];
                int j = i;
                while(j != k){
                    a[j] = a[j-1];
                    b[j] = true;
                    j--;
                }
                a[k] = nums[i];
            }
        }
        return a;

    }
}
