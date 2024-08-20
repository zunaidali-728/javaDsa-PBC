public class Bit_Manipulation_Questions_5 {
    public static void main(String[] args) {
        System.out.println(xor_of_0_to_a(5));
        System.out.println(xor(5));
        System.out.println(xor_a_to_b(3,9));
    }
    static int xor_of_0_to_a(int a){
        // we will do with the recursion also...
        switch(a%4){
            case 0 : return a;
            case 1: return 1;
            case 2 : return a+1;
            case 3 : return 0;
        }
        return -1;
    }
    static int xor(int a){
        if(a == 0){
            return 0;
        }
        return a ^ xor(a-1);
    }
    static int xor_a_to_b(int a, int b){
        // intution is that find xor of 0 to b ans subtract xor of 0 to a-1;
        int xor_of_0_to_b = xor_of_0_to_a(b); // xor of 0 to b
        int xor_of_0_to_a_1 = xor_of_0_to_a(a-1); // xor of 0 ot a-1;


        return xor_of_0_to_b ^ xor_of_0_to_a_1;

    }
}
