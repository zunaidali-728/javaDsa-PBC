import java.util.Arrays;

public class maximumSubArray_KadaneAlgo {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("subArray sum");
        System.out.println(subSrraySum(a));
        System.out.println("subArray Length");
        System.out.println(subArrayLength(a));
        System.out.println(Arrays.toString(subArrayIndex(a)));

    }
    static int subSrraySum(int[] num){
        int sum = 0;
        int maxSUm = 0;


        for (int i : num){
            sum += i;

            if(sum > maxSUm){
                maxSUm = sum;

            }

            if (sum < 0){
                sum = 0;
            }
        }

        return maxSUm;

    }

    static int subArrayLength(int[] nums){
        int sum = 0;
        int maxSUm = 0;
        int j = 0;


        for (int i : nums){
            sum += i;

            if(sum > maxSUm){
                maxSUm = sum;
                j++;
            }

            if (sum < 0){
                sum = 0;
            }
        }

        return j;

    }
    static int[] subArrayIndex(int[] a){
        int sum = 0;
        int maxSum = 0;
       int start = 0;
       int end = 0;
       int j = 0;

        for (int i = 0; i < a.length ; i++) {
            sum += a[i];

            if(sum > maxSum){
                maxSum = sum;
                start = j;
                end  = i;
            }

            if(sum < 0){
                sum = 0;
                j = i+1;
            }
        }

        return new int[]{start,end};

    }
}
