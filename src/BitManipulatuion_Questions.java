 class Bit_Manipulation_Questions_1 {
    public static void main(String[] args) {
        // question is that all number appear twice except one only find the number
        int[] a = {2,5,5,3,4,3,2,4,8};
//        here all are repeat twice and except 8
        // fast that if all number repeat even times then except one number then use the XOR operations..
        System.out.println(find_num(a));
    }
    static int find_num(int[] num){
        int n = 0;
        for(int i  : num){
            n ^= i;
        }
        return n;
    }
}
