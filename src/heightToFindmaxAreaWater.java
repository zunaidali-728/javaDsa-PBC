public class heightToFindmaxAreaWater {
    public static void main(String[] args) {
        int[] a = {1,8,5,4,6,8,3,7,4};
        System.out.println(findMAXWaterStore(a));
    }

    static int findMAXWaterStore(int[] a){
        int i = 0;
        int maxA = 0;
        int j = a.length-1;

        while(i < j){
            int cunA  = Math.min(a[i],a[j]) * (j-i);
            maxA = Math.max(cunA,maxA);
            i++; j--;
        }

        return maxA;
    }

}
