 class Arrays_Sorted_Recursion {
     public static void main(String[] args) {
         int[] a = {1, 2, 3, 7, 6, 9};
         System.out.println(isSorted(a, 0));
         System.out.println(isSort(a));
     }
     // with the double argument...
     static boolean isSorted(int[] a, int i) {
         if (i == a.length - 1) return true; // base condition for sorted, satisfy the one length array also

         if (a[i] > a[i + 1]) return false;  // base condition for the unsorted

         return isSorted(a, i + 1);
     }

     // with the single argument....
     static boolean isSort(int[] arr){
         return helper(arr,0); // 0 is the pointer to check the array element
     }
     static boolean helper(int[] a, int i){
         if (i == a.length-1){
             return true;
         }
         if (a[i] > a[i+1]){
             return false;
         }
         return helper(a,++i);
     }

     static boolean is_sorted(int[] arr, int i){
         if(i == arr.length-1){
             return true;
         }
         return arr[i] <= arr[i + 1] && is_sorted(arr, ++i);
     }

 }
