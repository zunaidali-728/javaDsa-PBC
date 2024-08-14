import java.util.Arrays;

public class medianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {3,6,7};
        System.out.println(merge(a,b));
        System.out.println(merge1(a,b));
        System.out.println(mergeMedianBS(a,b));
    }
    static double merge(int[] a, int[] b){
        int n = a.length;
        int m  = b.length;
        int x  = n+m;
        int[] arr = new int[x];
        int  i = 0,j=0;
        for(int k = 0; k < arr.length; k++){
            if (k < n){
                arr[k] = a[i++];
            }
            else{
                arr[k]  = b[j++];
            }
        }
        Arrays.sort(arr);

        return x%2==0 ? (arr[x/2]+arr[(x/2)-1])/2.000 : arr[x/2];



    }
    static double merge1(int[] a, int[] b){
        /// hypothetical space without extra space
        int i = 0,j = 0,cnt = 0;
        int n1 = a.length;
        int n2 = b.length;
        int n = a.length+b.length;

        int id1 = n/2;
        int id2 = id1-1;
        int e1 = -1,e2 = -1;

        while(i< n1 && j < n2){
            if(a[i] <= b[j]){
                if (cnt == id1) e1 = a[i];
                if (cnt == id2) e2 = a[i];
                cnt++;
                i++;
            }
            else{
                if (cnt == id1) e1 = b[j];
                if (cnt == id2) e2 = b[j];
                cnt++;
                j++;
            }
        }

        while(i < n1){
            if (cnt == id1) e1 = a[i];
            if (cnt == id2) e2 = a[i];
            cnt++;
            i++;
        }
        while(j < n2){
            if (cnt == id1) e1 = b[j];
            if (cnt == id2) e2 = b[j];
            cnt++;
            j++;
        }

        return n%2==0 ? (e1+e2)/2.0000 : (double)e1;


    }

    static double mergeMedianBS(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int x = n+m;
        if (n>m) return mergeMedianBS(b,a);

        int s = 0;
        int e = n;
        int leftSideTotalElement = (n+m+1)/2;
        while(s<=e){
            int m1 = s + (e-s)/2; // pick the first array
            int m2 = leftSideTotalElement-m1; // pick the second array

            int l1 = Integer.MIN_VALUE , l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (m1 < n) r1 = a[m1];
            if (m2 < m) r2 = b[m2];
            if (m1 > 0) l1 = a[m1-1];
            if (m2 > 0) l2 = b[m2-1];

            if (l1 <= r2 && l2 <= r1){
                return x%2==0 ? (Math.max(l1,l2)+Math.min(r1,r2))/2.000 : Math.max(l1,l2);
            }

            if (l2 > r1){
                s = m1+1;
            }
            else{
                e = m1-1;
            }

        }


        return 0;


    }
}
