import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
  int[][] a = {
          {5,  6, 7, 8},
          {10,12,13,15},
          {17,18,19,20},
          {22,25,28,29}
              };

        System.out.println(Arrays.toString(search(a,6)));
    }

    static int[] rangeBinarySearch(int[][] mat, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd) {
            int m = cStart + (cEnd - cStart) / 2;

            if (mat[row][m] == target) {
                return new int[]{row, m};
            } else if (mat[row][m] > target) {
                cEnd = m - 1;
            } else {
                cStart = m + 1;
            }
        }

            return new int[]{-1,-1};
    }
    static int[] search(int[][] a,int k){
        int r = a.length;
        int c = a[0].length;
        if (r == 1){
           return rangeBinarySearch(a,0,0,c-1,k);
        }

        int rStart = 0;
        int rEnd = r-1;
        // we select the column to eliminate the rows  middle of the column
        int cMid = (rStart+(c-1))/2;

        while(rStart < rEnd-1){
            int mid = rStart+(rEnd-rStart)/2;

            if (a[mid][cMid] == k){
                return new int[]{mid,cMid};
            }
            else if(k > a[mid][cMid]){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }


        // now we have the two rows if answer not found
        // so what should we do...., lets check the a[rstart][cmid] if it nit found then check the other four cases..
        if (a[rStart][cMid]==k) return new int[]{rStart,cMid};

//        case 1
        else if (k < a[rStart][cMid]){
            int[] arr = rangeBinarySearch(a,rStart,0,cMid-1,k);
            if(arr[0] != -1) return arr;
        }
//        case 2
        else if (k > a[rStart][cMid]) {
            int[] arr =  rangeBinarySearch(a, rStart, cMid + 1, c - 1, k);
            if(arr[0] != -1) return arr;
        }
//        case 3
        else if (k < a[rStart+1][cMid]) {
            int[] arr =  rangeBinarySearch(a, rStart+1, 0, cMid-1, k);
            if(arr[0] != -1) return arr;
        }
//          case 4 --> last and all case
            return rangeBinarySearch(a, rStart+1, cMid + 1, c - 1, k);

    }
}
