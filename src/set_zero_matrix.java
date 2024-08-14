import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class set_zero_matrix {
    public static void main(String[] args) {

        int[][] a = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        zeroMatrix(a);

        for (int[] b : a){
            System.out.println(Arrays.toString(b));
        }

        System.out.println(isPowerOfTwo(16));

    }
    static void zeroMatrix(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();

        int n = 0;
        for (int[] a : matrix){
            for (int i : a){
                if (i == 0){
                    n++;
                }
            }
        }

        if(n == matrix.length*matrix[0].length){
            return;
        }

        int[] arr = new int[2*n];
        int k = 0;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] == 0){
                    arr[k++] = i;
                    arr[k++] = j;
                }
            }
        }

        int r = 0;
        int c = 1;


       while(c < arr.length){

           for (int i = 0; i < matrix[0].length ; i++) {
               matrix[arr[r]][i] = 0;
           }
           for (int i = 0; i < matrix.length ; i++) {
               matrix[i][arr[c]] = 0;
           }
           r = c+1;
           c = r+1;

       }



    }

    public static boolean isPowerOfTwo(int n) {
        int a = n;
        int k = 0;

        if(a != 1){
            a /= 2;
            k++;
        }

        int bit = 1 << k;

        return ((~bit) & n) == 0;


    }
}
