public class max1sIn2DArray {
    public static void main(String[] args) {
        // array is sorted in row wise
        int[][] a = {{0,0,1,1},{0,0,0,1},{0,0,0,0},{1,1,1,1}};
        System.out.println(max1row(a));
    }
    static int max1row(int[][] a){
        int r = 0;
        int c = a[0].length-1;
        int row = -1;
        while(r < a.length && c >= 0){
            int e = a[r][c];

            if (e == 1){
                c--;row = r;
            }
            else{ // found zero
                r++;
            }

        }

        return row;
    }
}
