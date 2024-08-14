public class largetsAltitdue {
    public static void main(String[] args) {
         //  -5,1,5,0,-7
     //   0,-5,-4,1,1,-6
        int[] a = { -4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitudes(a));
    }

     static int largestAltitudes(int[] gain){
        // initial altitude
        int a = 0;
        int maxALT = 0;

        for (int j : gain) {
            a += j;
            if (a > maxALT) {
                maxALT = a;
            }
        }

        return maxALT;


    }
}
