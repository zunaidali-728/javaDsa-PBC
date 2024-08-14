import java.util.Arrays;

public class SortArrayWith1_sBit {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(sortArrayBit(a)));
    }
    static int[] sortArrayBit(int[] a){
        int n = a.length;
        Arrays.sort(a);
        int[] bits = new int[n];
        int bit; int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, j = 0;

        for(int i : a){
            bit = find(i);  // no. of set bit in element
            bits[j++] = bit;  // store the bit
            min = Math.min(min,bit); // find the min bit
            max = Math.max(max,bit); // find the max bit
        }

        int[] ans  = new int[n]; int in = 0;

        for(int i = min; i<= max; i++){
            for (int k = 0; k < n; k++){
                if(bits[k] == i){
                    ans[in++] = a[k];
                }
            }
        }

        return ans;


    }
    static int find(int n ){
        int c = 0;
        while(n > 0){
            c += n&1;
            n >>= 1;
        }
        return c;
    }
}
