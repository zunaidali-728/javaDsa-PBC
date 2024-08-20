public class SquareRootOfNumber {
    public static void main(String[] args) {
        System.out.printf("%.2f", find_sqrt_BS(40));
//        System.out.println(find_square_root(46));
    }
    static int find_square_root(int n){
        // run the loop like
        for (int i = 1; i*i<=n; i++){
            if (i*i == n) return i;
        }
        return -1; // time complexity O( sqtr(n) )
    }
    static float find_sqrt_BS(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            int m = (s + e) >> 1; // --> s - (e-s)/2

            if (m * m == n) return find_exact_root(m,n);
            else if (m * m > n) e = m - 1;
            else s = m + 1;

        }
        return find_exact_root(e,n);
    }
    static float find_exact_root(float n, float x){
        float i = 0.1f;
        while(n*n <= x){
            n += i;
        }
        return (n-0.1f);
    }
}
