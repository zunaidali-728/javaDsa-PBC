 class Recursion_Question_Basic {
    public static void main(String[] args) {
//        int ans  =fib(6);
//        System.out.println(ans);
//
//        int[] a = {12,25,29,27,30,36,40};
//        System.out.println(binarySearch(a,12,0,6));

//        System.out.println(sumOfNum(5,0));
//        System.out.println(sumOfNumber(5));
        System.out.println(factorial(5));
    }
    static int fib(int n){
        if (n < 2){
            return n;
        }
        int a = fib(n-1) + fib(n-2);
        return a;
    }
    static int binarySearch(int[] a, int target, int s, int e){
        // binary search using Recursion....
        if (s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if (a[m] == target) return m;

        else if (target > a[m]){ // s = m+1 and e = e
            return binarySearch(a, target,m+1,e);
        }

        return binarySearch(a,target,s,m-1); // if target < a[m] e = m-1, s = s

    }
    static int sumOfNum(int n, int sum){
        if (n == 0){
            return sum;
        }
        sum += n;
        return sumOfNum(n-1,sum);
    }
     static int sumOfNumber(int n){
         if (n == 0){
             return 0;
         }

        return sumOfNumber(n-1) + n;

     }
     static int factorial(int n) {
         if (n == 0) {
             return 1;
         }
//         int ans = n * factorial(n-1);
//         return ans;
         return n * factorial(n-1);
     }
}
