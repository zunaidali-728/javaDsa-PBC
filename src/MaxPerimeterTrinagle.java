import java.util.Arrays;

public class MaxPerimeterTrinagle {
    public static void main(String[] args) {
   int[] a = { 1,2,3,2};
        System.out.println(maxPerimeter(a));
    }
    static int maxPerimeter(int[] a){
        Arrays.sort(a);
        int n = a.length;
        int i = n-1, j = n-2, k = n-3;
        while(k >= 0){
            int  p = a[i]+a[j]+a[k];
            if (p > 2*a[i]) return p;
            i--;k--;j--;
        }

        return -1;  // or 0 not have the valid triangle....
    }
}
