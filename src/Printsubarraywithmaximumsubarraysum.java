import java.util.Arrays;

public class Printsubarraywithmaximumsubarraysum {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(maxSumSubArray(a)));
    }
    static int[] maxSumSubArray(int[] a){
        int sum = 0;
        int maxSum = 0;
        int s = 0, e = 0, i = 0;

        for (int j = 0; j < a.length ; j++) {
            sum += a[j];

            if (sum > maxSum){
                maxSum = sum;
                s = i;
                e = j;
            }

            if (sum < 0){
                sum = 0;
                i = j+1;
            }

        }

        return Arrays.copyOfRange(a,s,e+1);
    }
}
