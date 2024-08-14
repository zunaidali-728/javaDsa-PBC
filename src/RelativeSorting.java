import java.util.Arrays;

public class RelativeSorting {
    public static void main(String[] args) {
        int[] a = {2,3,1,3,2,4,6,7,9,2,19};
        int[] b = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(sortRelatively(a,b)));
    }
    static int[] sortRelatively(int[] a, int[] b){
         int[] frequency = new int[1001];
         int[] arr = new int[a.length];
         
         for(int  i :  a){
             frequency[i]++;
         }
         int j = 0;
         for (int i : b){
             while(frequency[i] != 0){
                 arr[j++] = i;
                 frequency[i]--;
             }
         }

        for (int i = 0; i < frequency.length ; i++) {
            while(frequency[i]!=0){
                arr[j++] = i;
                frequency[i]--;
            }
        }

        return arr;
    }
}
