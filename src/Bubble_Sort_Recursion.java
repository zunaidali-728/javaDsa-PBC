import java.util.Arrays;

public class Bubble_Sort_Recursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        bubble_sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr, int i, int j){
        if(i == 0){
            return;
        }
        if (j<i){
            if(arr[j] > arr[j+1]){
                swap(arr,j,j+1);
            }
            bubble_sort(arr,i,j+1);
        }
        else{
            bubble_sort(arr,i-1,0);
        }

    }
    static void swap(int[] a, int i, int j){
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
