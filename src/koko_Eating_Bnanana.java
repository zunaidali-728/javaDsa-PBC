import java.lang.reflect.Array;
import java.util.Arrays;

public class koko_Eating_Bnanana {
    public static void main(String[] args) {
        int[] a = {30,11,23,4,20};
        System.out.println(findMinK(a,6));
    }
    static int findMinK(int[] piles, int h){
        int  s = piles[0];
        int e = 0;
        int ans = Integer.MAX_VALUE;

        for (int  i : piles){
            s = Math.min(s,i); // k min value
            e = Math.max(e,i);  // k max value
        }

        while(s<=e){
            int k = s + (e-s)/2; // may be potential k;

            long totalH = calculateHourstoeat(piles,k);

            if (totalH <= h) {
                e = k - 1;
                ans = Math.min(ans,k);
            }
            else{
                s = k + 1;
            }


        }

        return ans;

    }
    static long calculateHourstoeat(int[] p, long eath){
        long total = 0;
        for (int i : p){
            total += Math.ceilDiv(i,eath);
        }
        return total;
    }
}
