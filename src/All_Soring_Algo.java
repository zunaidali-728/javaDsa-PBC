import java.util.Arrays;

public class All_Soring_Algo {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
//        bubbleSort(a);
//        System.out.println(Arrays.toString(a));
//         selectionSort(a);
//        insertionSort(a);
        // it is work only with the array of range 1 to n; element in the array
        cyclicSort(a); // special case sort with the time complexity O(n);
        System.out.println(Arrays.toString(a));
    }

    static void cyclicSort(int[] a){
        // it is work only with the array of range 1 to n; element in the array
        int i = 0;
        while(i < a.length){
            if (i == a[i]-1) i++; // index i == index a[i] - 1;  // alter method is that to do with the element also a[i] == a[a[i]-1]
            else swap(a,i,a[i]-1);
        }

    }
    static void bubbleSort(int[] a){
        boolean isSort;
        for (int i = 0; i<a.length-1; i++){
            isSort =  false;
            for (int j = 1; j<a.length-i; j++){
                if (a[j] < a[j-1]){
                    swap(a,j-1,j);
                    isSort =  true; // very important statement
                }
            }
            if (!isSort) return;
        }
    }
    static void swap(int[] arr, int a , int b){
        // xor operations swapping
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    static void selectionSort(int[] a){
        for (int i = 0 ; i < a.length-1; i++){
            for (int j = i+1; j < a.length ; j++) {
                if (a[j] < a[i]) swap(a,j,i);
            }
        }
    }

    static void insertionSort(int[] a){
        for (int i = 0; i<a.length-1; i++){
            for (int j = i+1; j > 0 ; j--) {
                if (a[j] < a[j-1]) swap(a,j-1,j);
                else break;  // very important statement
            }
        }
    }
}
