import java.util.Arrays;

public class findThePeakInGrid {
    public static void main(String[] args) {
        int[][] a = {{10,50,40,30,20},{1,500,2,3,4}};
        System.out.println(Arrays.toString(findPeakInGrid(a)));
    }
    static int[] findPeakInGrid(int[][] mat){
       int n = mat.length;
        int rs = 0;
        int re = mat.length-1;
        // apply the binary search in the selection of the row and then find the each row max element index
        while(rs<=re){
            int m = rs+(re-rs)/2;

            int  peakIndex = findPeakInRow(mat[m]);  // find the max element index in a row


            if (m > rs && m < re && (mat[m][peakIndex] > mat[m+1][peakIndex] && mat[m][peakIndex] > mat[m-1][peakIndex])){ // check the adjacent element grater in the row of same coloumn
                return new int[]{m,peakIndex};
            }
            else if (m == 0 && mat[m+1][peakIndex] < mat[m][peakIndex]){
                return new int[]{m,peakIndex};
            }
            else if(m == mat.length-1 && mat[m-1][peakIndex] < mat[m][peakIndex]){
                return new int[]{m,peakIndex};
            }
            else if (mat[m][peakIndex] < mat[m+1][peakIndex]){
                rs = m+1;
            }
            else{
                re = m-1;
            }

        }

        return null;

    }
    static int findPeakInRow(int[] a){
        int maxIndex = -1;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
