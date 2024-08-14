import java.util.ArrayList;
import java.util.Collections;

public class ArrayPartition {
    public static void main(String[] args) {
/*        You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd)
        in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on.
        Then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices.
        Example:
        enter the size of array : 5
        enter element at 0 index : 3
        enter element at 1 index : 4
        enter element at 2 index : 1
        enter element at 3 index : 7
        enter element at 4 index : 9
        Sorted even array : 1 3 9
        Sorted odd array : 4 7
        7      */
        int[] a = {3,4,1,7,9};
        System.out.println(second_largest_sum(a));
    }
    static int  second_largest_sum(int[] arr){
        int n = arr.length;
        if (n < 2){
            return -1;
        }
        ArrayList<Integer> even_index = new ArrayList<>();
        ArrayList<Integer> odd_index = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if (i%2==0) even_index.add(arr[i]);
            else odd_index.add(arr[i]);
        }

        Collections.sort(even_index);
        Collections.sort(odd_index);

        System.out.print("Even Index Sorted Elements: ");
        for(int i : even_index){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd Index Sorted Elements: ");
        for(int i : odd_index){
            System.out.print(i + " ");
        }
        System.out.println();




        return even_index.get(even_index.size()-2)+odd_index.get(odd_index.size()-2);





    }

}
