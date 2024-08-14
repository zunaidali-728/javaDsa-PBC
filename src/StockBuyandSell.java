public class StockBuyandSell {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(stock(a));
        System.out.println(stock2(a));
    }
    static int stock(int[] a){
        int minvalue = Integer.MAX_VALUE;
        int maxP = 0, p;

        for (int i : a){
            p = 0;
            if (i < minvalue){
                minvalue = i;
            }
            p = i - minvalue;
            if (p > maxP){
                maxP = p;
            }
        }

        return maxP;
    }

    static int stock2(int[] prices){

        int[] min = minNo(prices);
        int max = maxNo(prices,min[0]+1,prices.length-1);

        return (max-min[1]);

    }

     static int maxNo(int[] prices, int start, int end) {
        int n = Integer.MIN_VALUE;
         for (int i = start ; i <= end ; i++) {
             if (prices[i] > n){
                 n = prices[i];
             }
         }

         return n;

    }

     static int[] minNo(int[] prices) {
        int a = prices[0];
        int index = 0;

         for (int j = 0; j < prices.length ; j++) {
             if (prices[j] < a){
                 a = prices[j];
                 index = j;
             }
         }

         return new int[]{index,a};

    }
}
