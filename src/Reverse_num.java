public class Reverse_num {
    public static void main(String[] args) {
        System.out.println(reverse(1023,0));
       rev(125);
//       System.out.println(sum); sum is global variable it is static

//      by the use of the helper function.....
        System.out.println(revers(351));

        System.out.println(reverse_a_number(12354));

    }
    static int reverse(int n, int ans){
        if (n == 0) return ans;

        ans = ans * 10 + n%10;
        return reverse(n/10, ans);
    }
    /// by the use of the global variable, static only
    static int sum = 0;  // it is a global function that's why it is static, we can print it in anywhere in any function
    static void rev(int n){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum * 10 + n%10;
        rev(n/10);
    }

    // reversing the number using the helper functions
    static int revers(int n){
        // on the add the additional args we use instead of the helper function do the recursion
        int digit = (int)Math.log10(n) + 1;
        return helper(n, digit); // call the helper function that do recursion
    }

    static int helper(int n , int digit){ // this function do the recursion.
        if (n==0){
            return 0;
        }
        int a = (n%10) * (int)Math.pow(10,digit-1) + helper(n/10,digit-1);
        return a;
    }
    static int reverse_a_number(int n){
        return help(n,0);
    }
    static int help(int n, int ans){
        if (n==0){
            return ans;
        }
        ans = ans * 10 + n%10;
        return help(n/10,ans);
    }


}
