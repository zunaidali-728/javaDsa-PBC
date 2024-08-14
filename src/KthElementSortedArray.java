import java.util.Arrays;

public class KthElementSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {3,6,7};
        System.out.println(kthElement(a,b,5));
        System.out.println(kthElementWOExtraSpace(a,b,5));
    }
    static int kthElement(int[] a, int[] b, int p){
        int n = a.length;
        int m = b.length;
        int x = n+m;
        int[] arr = new int[x];
        int i = 0, j = 0;
        for (int k = 0; k <x ; k++) {
            if (k<n){
                arr[k]  = a[i++];
            }
            else{
                arr[k]  = b[j++];
            }
        }

        Arrays.sort(arr);

        return arr[p-1];
    }
    static int kthElementWOExtraSpace(int[] a, int[] b, int p){
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        int cnt = 0; // use to  store the merge array value in sorted manner hypothetically
        int index = p-1, e = -1;

        while(i < n && j < m){
            if (a[i] <= b[j]){
                if (cnt == index) e = a[i];
                cnt++;
                i++;
            }
            else{
                if (cnt == index) e = b[j];
                cnt++;
                j++;
            }
        }

        while(i < n){
            if (cnt == index) e = a[i];
            cnt++; i++;
        }
        while(j < m){
            if (cnt == index) e = b[j];
            cnt++; j++;
        }


        return e;

    }
}
