public class Allocate_Books {
    public static void main(String[] args) {

    }
    static int maximumPagesOfMin(int[] a, int k){
        if(k > a.length){
            return -1;
        }

        int s = 0;
        int e = 0;

        for (int i : a){
            e += i;
            s = Math.max(s,i);
        }

        while(s<=e){
            int m = s +(e-s)/2;
            int sum = 0;
            int p = 0;

            for (int j : a){
                sum += j;
                if(sum > m){
                    p++;
                    sum = j;
                }
            }

            if (sum <= m) p++;

            if(p <= k){
                e = m - 1;
            }
            else {
                s = m + 1;
            }
        }

        return s;
    }

}
