import org.w3c.dom.ls.LSOutput;

public class Check_Palindrome_Recursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
    static boolean isPalindrome(int n){
        // first reverse the number
        int rev = reverse(n,0);

        return rev==n;
    }
    static int reverse(int n, int ans){
        if (n == 0){
            return ans;
        }
        ans  = ans * 10 + n%10;
        return reverse(n/10,ans);
    }
}
