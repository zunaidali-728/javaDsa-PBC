public class peakElementInMountain {
    public static void main(String[] args) {
        int[]  a = {1,2,8,9,11,10,6,4,3,1,0};
        System.out.println(peak(a));
    }
    static int peak(int[] a){
        if (a.length == 1){
            return a[0];
        }
        if (a[0] > a[1]){
            return a[0];
        }
        if (a[a.length-1] > a[a.length-2]){
            return a[a.length-1];
        }

        int s = 1;
        int e = a.length-2;

        while(s<=e){
            int m = s + (e-s)/2;

            if (a[m] > a[m+1] && a[m] > a[m-1]){
                return a[m];
            }
            else if(a[m] < a[m+1]){
                s = m + 1;
            }
            else if(a[m] > a[m+1]){
                e = m-1;
            }
        }

        return -1;

    }
}
