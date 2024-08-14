import java.util.Arrays;

public class SortTheSquareOfArray {
    public static void main(String[] args) {
        int[] a = {-3,-2,-1,0,2,5,6,7,8};
        System.out.println(Arrays.toString(sortArray(a)));
    }
    static int[] sortArray(int[] arr){
         int n = arr.length;
         int[] a  = new int[n];
         int l = 0; int r = n-1;
//         compare the sure of l and r index then put it from the back ;
        for (int i = n-1; i>= 0; i--){
            if (arr[l]*arr[l] >= arr[r]*arr[r]){
                a[i] = arr[l]*arr[l];
                l++;
            }
            else {
                a[i] = arr[r]*arr[r];
                r--;
            }
        }

        return a;
    }
}
