import java.util.Arrays;

public class Agreessive_Cow {
    public static void main(String[] args) {
        int[] a = {0,3,4,7,10,9};
        System.out.println(cow(a,4));

    }
    static int cow(int[] stalls, int k){
        if(k > stalls.length){
            return -1;
        }
        if(stalls.length==2){
            return Math.max(stalls[0],stalls[1])-Math.min(stalls[0],stalls[1]);
        }

//        Arrays.sort(stalls);

        int s = 1;
        int e = stalls[stalls.length-1]-stalls[0];


        while(s<=e){
            int m = s + (e-s)/2;

            if(possible(stalls,m,k)){
                s = m+1;
            }
            else{
                e = m-1;
            }

        }


        return e;


    }
    static boolean possible(int[] a, int n, int k){
        int nc = 0;
        int j = a[0];

        for (int i : a){
            if(i-j >= n){
                nc++;
                j = i;
            }
        }


        return (nc+1)>=k;


    }
}
