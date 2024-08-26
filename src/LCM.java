public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,7));
    }
    static int lcm(int a, int b){
        int gcd = hcf(a,b);
        return (a*b)/gcd;
    }
    static int hcf(int a, int b){
        if (a == 0) return b;

        return hcf(b%a,a);
    }
}
