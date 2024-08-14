import java.util.Arrays;

public class CountTheNumberSmaller {
    public static void main(String[] args) {
        int[] a = {4,5,3,6,9,8,2};
        // return the array with the no. of smaller element with the corresponding element, smaller element is the element index value in  sorted manner
        System.out.println(Arrays.toString(countSmaller(a)));
    }
    static int[] countSmaller(int[] a){
        int n = a.length;
        int[] temp = Arrays.copyOf(a,n);
        Arrays.sort(temp);

        int[] ans = new int[n]; int j = 0;

        for(int i : a){
            ans[j++] = indexOf(i,temp); // binary search for finding the index
        }

        return ans;

    }
    static int indexOf(int x , int[] a){
        int s = 0, e = a.length-1;
        while(s<=e){
            int m = s+(e-s)/2;

            if (a[m] == x){
                if (m > 0 && a[m] == a[m-1]) e = m-1; // find the smallest index of duplicate element
                else return m;
            }
            else if(x > a[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
}
