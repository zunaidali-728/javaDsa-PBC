import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortQuestions {
    public static void main(String[] args) {
        int[] a = {9,8,3,6,5,4,2,1,0};
        System.out.println(missingNum(a));
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(allMissingMNum(arr));
        System.out.println(fidAllDuplicates(arr));
        int[] b = {1,2,2,3};
        System.out.println(Arrays.toString(setMismatch(b)));
        int[] ar = {1,2};
        System.out.println(findSmallestMissingNum(ar));
    }
    static int findSmallestMissingNum(int[] a){
        // leetcode hard problem
//        smallest positive such that it exist between 1 to n apply cyclic sort...
        // it ask smallest than it will give the intutions about 1 to n; not found means all the positive then smallest is n+1;

        int i = 0;
        int n = a.length;

        while (i < n){
            if (a[i] > 0 && a[i] < n){  // it avoid the negative and large number than the lenght of array
                if (a[i] == a[a[i]-1] || a[i] > (n-1)) i++;
                else swap(a,i,a[i]-1);
            }
            else{
                i++;
            }
        }


        for (int j = 0; j<n; j++){
            if (a[j] != j+1) return (j+1);
        }

        return n+1; // if it not found or than the answer is n+1; it minimum smallest that is missing..
    }
    static int[] setMismatch(int[] a){
        int i = 0; int n = a.length;

        while(i < n){
            int correctIndex = a[i]-1;
            if (a[i] == a[correctIndex]){
                if (i != correctIndex) return new int[]{a[i],i+1};
                i++;
            }
            else swap(a,i,correctIndex);
        }

        return null;

    }
    static List<Integer> fidAllDuplicates(int[] a ){
        List<Integer> l = new ArrayList<>();
        int i = 0; int n = a.length;
        while(i < n ){
            int correctIndex = a[i] - 1;
            if (a[i] == a[correctIndex]){
//                if (i != correctIndex) l.add(a[i]); // this will not work because it work only single duplicate
                i++;
            }
            else swap(a,i,correctIndex);
        }

        for (int j = 0; j <n ; j++) {
            if (a[j] !=  j+1) l.add(a[j]);
        }

        return l;
    }
    static int DuplicateNum(int[] num){
        // use of extra space use hashing
//        boolean[] a = new boolean[num.length+1];
//
//        for(int i : num){
//            if(a[i]) return i;
//            else a[i] = true;
//        }
//
//        return -1; // if it is not exist

        // second approach is the cyclic sort because the rage is {1,n};
        int i = 0;
        while(i < num.length){
            int correctIndex = num[i]-1; // index
            if (num[i] == num[correctIndex]){
                if (i != correctIndex) return num[i];
                i++;
            }
            else swap(num,i,num[i]-1);
        }
          // we can find the duplicate element in duration sort itself
//        for (int j = 0; j<num.length; j++){
//            if (num[j] != j+1) return num[j]; //  j+1 is the missing  element
//        }

        return -1;



    }
    static List<Integer> allMissingMNum(int[] a){
        List<Integer> l = new ArrayList<>();
        int i = 0; int n  = a.length;
        while(i < n){
            int correctIndex = a[i]-1; // because it is 1 to n [1,n];
            if (a[i] == a[correctIndex]) i++;
            else swap(a,i,a[i]-1);
        }

        for (int j = 0; j<n ; j++) {
            if (a[j] != j+1) l.add(j+1);  // j+1 is the element is the right place so, it is the missing element if it is nt present
        }

        return l;
    }
    static int missingNum(int[] a){
        // array of  range  o to n
//        then apply cyclic sort
        int i = 0;
        int n = a.length;
        while(i < n){
            if (i == a[i] || a[i] > (n-1)) i++;
            else swap(a,i,a[i]);
        }

        // then we have the two possibility search the i in the array if exist then return the index, not return i; linear search or binary search...

        // do with the linear search
//        for (int j = 0; j < n ; j++) {
//            if (j != a[j]) return j;
//        }
//
//        return i;

        // do binary search with find the i if present then return the index because index == element [0,n]
        return binarySearch(a,0,n-1,i);

    }
    static void swap(int[] a, int i, int j ){
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    static int binarySearch(int[] a, int s, int e, int k){
        while(s<=e){
            int m = s+(e-s)/2;

            if (a[m] == k){
                return m;
            }
            else if (k > a[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return k;
    }
}
