import java.util.Arrays;

 class RankTransformArrays {
    public static void main(String[] args) {
        int[] a = {100,100,2,78,0,10};
        // rank is, larger the element larger the rank same element share same rank....
        System.out.println(Arrays.toString(TransFromArrayWithRnk(a)));

    }
    static int[] TransFromArrayWithRnk(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOf(a,n);
        Arrays.sort(temp);

        int[] ranking = new int[n];
        ranking[0] = 1; int rank = 2, j = 1;

        while(j < n){
            if(temp[j] != temp[j-1]){
                ranking[j++] = rank++;
            }
            else{
                ranking[j++] = rank-1;
            }
        }

        // now we get the rank array, corresponding sorted array temp

        int[] ans  = new int[n];
        int k = 0;

        for(int i : a){
            ans[k++] = ranking[indexOf(i,temp)];
        }

        return ans;



    }
    static int indexOf(int x, int[] a){
        int s = 0, e = a.length-1;
        while(s<=e){
            int m = s+(e-s)/2;

            if(a[m] == x){
                return m;
            }
            else if(a[m] < x){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
}
