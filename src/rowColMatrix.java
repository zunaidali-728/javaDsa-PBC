import java.util.Arrays;

 class rowColMatrixSorted {
    public static void main(String[] args) {
        // matrix is sorted in the row manner and column manner
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(searchInMatrix(a,1)));
    }
    static int[] searchInMatrix(int[][] a, int k ){
        int r = 0;
        int c = a[0].length-1;

        while(r < a.length && c >= 0){
            int e = a[r][c];
            if (e == k){
                return new int[]{r,c};
            }
            else if(e > k){
                c--;
            }
            else{
                r++;
            }
        }

        return new int[]{-1,-1};
    }
}
