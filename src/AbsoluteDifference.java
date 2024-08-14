import java.util.*;
public class AbsoluteDifference {
    public static void main(String[] args) {
/*        You are given a function,
        int findCount(int arr[], int length, int num, int diff);
        The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’.
        Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.

        Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

        Example:
        Input:
        arr: 12 3 14 56 77 13
        num: 13
        diff: 2

        Output:
        3     */
        Scanner sc = new Scanner (System.in);
        int  num = sc.nextInt();
        int  diff = sc.nextInt();
        int[] a = {12, 3, 14, 56, 77, 13};
        int n = a.length;
        System.out.println(findCount(a,n,num,diff));
    }

    static int findCount(int[] arr, int n, int num, int diff) {
        if (n == 0) {
            return -1;
        }
        int count = 0;
        for (int i : arr) {
//            int current_diff = Math.max(num, i) - Math.min(num, i);
            int current_diff = Math.abs(num - i); // it give absolute positive number
            if (current_diff <= diff) count++;
        }


        if (count == 0) return -1;


        return count;


    }
}
