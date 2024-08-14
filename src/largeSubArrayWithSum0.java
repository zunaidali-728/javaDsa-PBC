import java.util.Arrays;

public class largeSubArrayWithSum0 {
    public static void main(String[] args) {
    //        System.out.println(maxLength(a));
//        System.out.println(max(a));
    }
    static int maxLength(int[] a){
        int i = 0, j= 0, sum = 0;
        int max = 0;

        while(j < a.length){

            sum += a[j];
            while(sum > 0){
                sum  -= a[i];
                i++;
            }

            if (sum == 0) max = Math.max(max,(j-i)+1);
            j++;

        }
        if (max == 1) return 0;

        return max;
    }
    static int max(int[] arr){
       int maxi = 0;

        for (int i = 0; i <arr.length; i++) {
          int   sum = 0;
            for (int j = i; j<arr.length; j++){
                sum += arr[j];
                if (sum == 0) maxi = Math.max(maxi,(j-i)+1);
            }
        }

        return maxi;
    }
}
