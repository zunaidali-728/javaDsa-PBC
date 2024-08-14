public class Minimum_days_to_make_M_bouquets {
    public static void main(String[] args) {
//        System.out.println(Math.ceilDiv(5,2));
        int[] a = {7,7,7,7,12,7,7};
        System.out.println(minDays(a,2,3));

    }
    static int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }

        int s = bloomDay[0];
        int e = 0;
        int ans = Integer.MAX_VALUE;

        for (int i : bloomDay){
            s = Math.min(s,i);
            e = Math.max(e,i);
        }

        while(s<=e){
            int d = s + (e-s)/2;

            if (isitmade(bloomDay,d,m,k)){
                ans = Math.min(d,ans);
                e = d-1;
            }
            else{
                s = d+1;
            }


        }

        return ans < Integer.MAX_VALUE ? ans : -1;





    }
    static boolean isitmade(int[] a, int day, int m, int k){
        int cnt = 0;
        int nofBM = 0;

        for (int i : a){
            if (i <= day){
                cnt++;
            }
            else{
                nofBM += (cnt/k);  // check it that if it fullfill or not
                cnt = 0;
            }
        }
        nofBM += (cnt/k);
        return nofBM >= m;
    }
}
