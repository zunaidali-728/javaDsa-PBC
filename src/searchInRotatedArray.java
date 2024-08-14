public class searchInRotatedArray {
    public static void main(String[] args) {


    }

    static int searchRA(int[] a, int x) {
        int pivot = pivot(a);
        if (pivot == -1) {
            return binarySearch(a, x, 0, a.length - 1);
        } else if (a[pivot] == x) {
            return pivot;
        }
        int f = binarySearch(a, x, 0, pivot);
        if (f == -1) {
            return binarySearch(a, x, pivot + 1, a.length - 1);
        }
        return f;
    }

    static int pivot(int[] a) {
        int s = 0;
        int e = a.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (a[m] > a[m + 1]) {
                return m;
            } else if (a[m] < a[m - 1]) {
                return m - 1;
            } else if (a[m] > a[s]) {
                s = m + 1;
            } else if (a[m] <= a[s]) {
                e = m - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] a, int target, int start, int end){
        while (start<=end){
            int m = start  + (end-start)/2;

            if (a[m] == target){
                return m;
            }
            else if (a[m] < target){
                start = m + 1;
            }
            else{
                end  = m - 1;
            }
        }

        return -1;
    }

}
