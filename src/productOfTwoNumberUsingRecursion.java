public class productOfTwoNumberUsingRecursion {
    public static void main(String[] args) {
        // product of two number using recursion
        System.out.println(product(5,100));
    }
    static int product(int a, int b){
        if (a<b) return product(b,a);
        return ans(a,b,0);
    }
    static int ans(int a, int b, int p){
        if (b == 0){
            return p;
        }
        p += a;
        return ans(a,--b,p);
    }
}
