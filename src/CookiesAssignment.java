import java.util.Arrays;

public class CookiesAssignment {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(maxChildContentCookies(g,s));
    }
    static int maxChildContentCookies(int[] g, int[] s){
     /*   g is the greedy factor of the children to take cookies, in simply it means the minimumsize need to take the cookies.
        s is the size of tghe cookies,  each children can get the at most one cookies;;;  */

        int n =  g.length; int m = s.length;

//        first we sort the arrays; use .sort method of Arrays
        Arrays.sort(g);Arrays.sort(s);
        int  i = 0, j = 0;
        while(i < n &&  j < m){
            if(g[i] <= s[j]){  // size of cookies big then the assign to child
                i++;
            } // if it false then the current cookies is not assignable to any child because it is smaller than the all the next numbers
            j++;    // one cookies assign to one child
        }

        return i;

    }
}
