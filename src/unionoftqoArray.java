import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class unionoftqoArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1};
        int[] b = {2,2,2,2,2};
        System.out.println(findUnion(a,b,5,5));
        System.out.println(union(a,b,5,5));

    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] a = new int[m + n];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < n) {
                a[i] = arr1[i];
            } else {
                a[i] = arr2[j++];
            }
        }

        Arrays.sort(a);

        list.add(a[0]);

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                list.add(a[i]);
            }
        }


        return list;
    }
    static ArrayList<Integer> union(int[] arr1, int[] arr2, int n , int m){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr1[0]);

        for (int i = 1; i < n; i++) {
            if (arr1[i] != arr1[i-1]){
                list.add(arr1[i]);
            }
        }

        for (int i = 0; i < m ; i++) {
            if(i > 0){
                if (arr2[i] != arr2[i-1]){
                    if (!ifnotexist(arr1,arr2[i])){
                        list.add(arr2[i]);
                    }
                }
            }
            else{
                if (!ifnotexist(arr1,arr2[i])){
                    list.add(arr2[i]);
                }
            }
        }

        Collections.sort(list);

        return list;


    }

    private static boolean ifnotexist(int[] a, int x) {
        int s = 0;
        int e = a.length -1;

        while(s <= e){
            int m =  s + (e-s)/2;

            if (a[m] == x){
                return true;
            }
            else if (x > a[m]){
                s = m+1;
            }
            else{
                e = m - 1;
            }
        }
        return false;
    }
}
