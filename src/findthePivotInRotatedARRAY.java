public class findthePivotInRotatedARRAY {
    public static void main(String[] args) {
        int[] a = {2};
        System.out.println(searchPivot(a));
    }
    static int searchPivot(int[] a){
//        if (a.length==1){
//            return -1;
//        }

        int s = 0;
        int e = a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if (m < a.length-1 && a[m] > a[m+1]){
                return m;
            }
            else if (a[m] > a[0] || a[m] > a[a.length-1]){
                s = m + 1;
            }
            else{
                e =  m - 1;
            }
//            else if (a[m] <  a[0] || a[m] < a[a.length-1]){
//                e = m - 1;
//            }
        }

        return -1;
    }
    
}
