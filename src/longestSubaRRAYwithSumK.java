public class longestSubaRRAYwithSumK {
    public static void main(String[] args) {
        int[] a = {10,15,5,2,1,7,9};
//        System.out.println(lenOfLongSubarr(a,6,16));
        System.out.println(lenSybARRAY(a,7,15));
    }
    public static int lenOfLongSubarr(int A[], int N, int K) {
        //Complete the function
        int sum = 0;

        for (int i : A){
            sum += i;
        }

        if(sum == K){
            return N;
        }

        if (sum < K){
            return 0;
        }


        int i = 0;
        int j = N-2;


        while(i <= j){

            int l = i;
            int m = j;

            while(m < N) {

                int a = 0;
                for (int k = l; k <= m; k++) {  // 10,5,2,7,1,9
                    a += A[k];
                }

                if (a == K) {
                    return (m - l) + 1;
                }
                else {
                    l++;
                    m++;
                }
            }
            j--;
        }

        return 0;

    }
    static int lenOfSuBArray(int[] a, int k){
       int len = 0;
       int sum;
        for (int i = 0; i < a.length ; i++) {
            sum = 0;
            for (int j = i; j < a.length ; j++) {
               sum += a[j];
               if (sum == k) len = Math.max(len, (j-i) + 1);
            }
        }

        return len;
}

static int lenSybARRAY(int A[] , int N, int K){  // only work on the positive array
    int j = 0;
    int len = 0;
    int sum = 0;

    for (int i = 0; i < N ; i++) {
        sum += A[i];

        while(j < N && sum > K){
            sum -= A[j];
            j++;
        }

        if (sum == K) len = Math.max(len,(i-j)+1);

    }
    return len;
}
}
