public class sumOfProduct {
    public static void main(String[] args) {
        System.out.println(sumofproduct(2));
    }
    public static long sumofproduct(int n)
    {
        // code here
        sum(n,n);
        return total;
    }
    static long total = 0;
    static void sum(int n,int N){
        if(n == 0){
            return;
        }

        sum(n-1,N);

        int x = n;
        int y = Math.floorDiv(N,x);

        total = total + (long)(x*y);

    }
}
