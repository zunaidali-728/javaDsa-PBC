import java.util.ArrayList;
public class LUCKYnUMBER {
    public static void main(String[] args) {
        int[][] a = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(a));

    }

    public static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
       boolean is = true;

        for (int[] a : matrix){
            int[] m = minimum(a);

            if(istrue(m,matrix)){
                list.add(m[0]);
            }

        }



        return list;


    }

    private static boolean istrue(int[] m, int[][] n) {

        for (int[] a : n){
            if(a[m[1]] > m[0]){
                return false;
            }
        }

        return true;

    }

    static int[] minimum(int[] a) {
        int n = a[0];
        int j = 0;
         for (int i = 0; i < a.length ; i++) {
             if (a[i] < n){
                 n = a[i];
                 j = i;
             }
         }
        return new int[]{n,j};
    }
}
