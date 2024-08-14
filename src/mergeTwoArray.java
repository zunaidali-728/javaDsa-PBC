import java.util.Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {3,6,7};
        System.out.println(Arrays.toString(merge(a,b)));
        System.out.println(Arrays.toString(merge1(a,b)));
    }
    static int[] merge(int[] a, int[] b){
        //   with the extra space
        int n1 = a.length;
        int n2 = b.length;
        int[] arr = new int[n1+n2];
        int i = 0, j = 0;

        for (int k = 0; k <arr.length ; k++) {
            if (k<n1){
                arr[k] = a[i++];
            }
            else{
                arr[k] = b[j++];
            }
        }

        Arrays.sort(arr);

        return arr;

    }
    static int[] merge1(int[] x, int[] y){
//  without the using the in built function
        int n1 = x.length;
        int n2 = y.length;
        int[] a  =new int[n1+n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(x[i] <= y[j]){
                a[k++] = x[i++];
            }
            else{
                a[k++] = y[j++];
            }
        }
        while(i < n1){
            a[k++] = x[i++];
        }

        while(j < n2){
            a[k++] = y[j++];
        }

        return a;

    }
}
