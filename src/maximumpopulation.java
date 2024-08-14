public class maximumpopulation {
    public static void main(String[] args) {
        int[][] a = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maxPol(a));
    }
    static int maxPol(int[][] logs){
        int n;
        int maxPol = 0;

        int i = 0;

        while (i < logs.length){
            n = 0;
            int x = logs[i][0];

            for (int[] a : logs){
                if(x >= a[0] && x < a[1]){
                    n++;
                }
            }

            if(n > maxPol){
                maxPol = n;
            }
            i++;

        }

        return logs[maxPol-1][0];
    }
}
