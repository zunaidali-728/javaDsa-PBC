public class secondlargestElemnt {
    public static void main(String[] args) {

        long[] a = {3,4,7};
        System.out.println(findFloor(a,3,6));

    }
   static int print2largest(int arr[], int n) {
        // code here
        int maxIndex = maxinArray(arr);

        int x = 0;

        for (int  i = 0; i< arr.length; i++){
            if(i!=maxIndex){
                if(arr[i] > x){
                    x = arr[i];
                }
            }
        }

        return x;
    }

    static int maxinArray(int[] a) {
        int m = a[0];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
                j = i;
            }
        }

        return j;
    }
    static int findFloor(long arr[], int n, long x) {

        if (x < arr[0]) {
            return -1;
        }

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (arr[m] == x) {
                return m;
            }
            else if (x > arr[m]) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }

        }

        return e;
    }
}
