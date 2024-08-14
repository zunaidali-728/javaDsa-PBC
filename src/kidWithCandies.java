import java.util.ArrayList;

public class kidWithCandies {
    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        System.out.println(kidWithCandies(a,3));
    }
    static ArrayList<Boolean> kidWithCandies(int[] candies, int extCandies){
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandy = maxofcandies(candies);



        for (int e : candies) {
            if ((e+extCandies) >= maxCandy){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }

     static int maxofcandies(int[] candies) {
        int a = candies[0];
        for (int i : candies){
            if (i > a){
                a = i;
            }
        }
        return a;
    }
}
