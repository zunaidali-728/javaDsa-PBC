import java.util.Arrays;

public class SelectonSort_Recursion {
    public static void main(String[] args) {
        int[] a = {9,5,2,1,6,4,3};
        selection_sort(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void selection_sort(int[] arr, int i, int j){
        if (j == arr.length-1){
            return;
        }
        if (i > j){
            if (arr[i] < arr[j]){
                swap(arr,i,j);
            }
            selection_sort(arr,i-1,j);
        }
        else{
            selection_sort(arr,arr.length-1,j+1);
        }
    }
   static void swap(int[] a, int i, int j){
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
