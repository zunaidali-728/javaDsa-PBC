import java.util.ArrayList;

public class Bit_Manipulation_Questions_2 {
    public static void main(String[] args) {
//        so, question is that what if the all number repeat trice, except one
        int[] a = {2,2,3,5,2,3,5,3,7,7,7,8,8,8,10,5};
        // here we see that all are repeat 3 times except 6
        System.out.println(findNum(a));
    }
    static int findNum(int[] num){
        int n = num.length;
        int[] bits = new int[n];

        for(int  i = 0; i <n; i++){
            bits[i] =countBits(num,i);
            if (bits[i] == 0){
                break;
            }
        }
        int j = 0;
        while(bits[j] != 0){
            bits[j++] %= 3;
        }
        int a = 0;
        for (int i = 0; i<j; i++){
            a += bits[i] * (int)Math.pow(2,i);
        }

        return a;
    }
    static int countBits(int[] a, int p){
        int count = 0;
        int bitmask = 1<<p;
        for (int i : a){
            if ((i & bitmask) != 0){
                count++;
            }
        }
        return count;
    }
}
