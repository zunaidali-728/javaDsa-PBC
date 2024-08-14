public class Capacity_to_Ship_Packages_within_D_Days {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(minDayShip(a,5));
    }
    static int minDayShip(int[] weights, int days){
//      weight capacity RANGE  prefix sum or max number
        int s = 0;
        int e = 0;

        for (int i : weights){
            e += i;
            s = Math.max(s,i);
        }

        while(s<=e){
            int m = s + (e-s)/2;  // potential answer of weight capacity

            if(ableToShip(weights,m,days)){
                e = m - 1;
            }
            else{
                s = m + 1;
            }


        }

        return s;


    }

     static boolean ableToShip(int[] a, int wcap, int day) {
        int sow = 0;
        int nofDays = 0;

        for (int i : a){
            sow +=i;
            if (sow > wcap){
                nofDays++;
                sow = i;
            }
        }

        if(sow <= wcap) nofDays++;

        return nofDays<=day;

    }
}
