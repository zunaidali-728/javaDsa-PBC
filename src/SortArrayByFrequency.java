import java.util.Arrays;

public class SortArrayByFrequency {
    public static void main(String[] args) {
        int[] a  = {1,3,2,3,2,3,3,2,1};
        System.out.println(Arrays.toString(sortArray(a)));
    }
    static int[] sortArray(int[] num){
        int n = num.length; // store the length of array
        Arrays.sort(num);

// according to the question we have to sort the array  respective of their frequency, if same frequency element have the sort in decreasing order
 // now, creating the frequency of the array element store their freq. at the  starting index corresponding element
      int[] freq = new int[n]; int min = 1000; int max = 0;
      int c = 1; // count the frequency
        int j = 1; // traversing counter;
        int i = 0; // track the starting index of element and help to store their frequency at same index,,
        while(j < n){
            if (num[j] == num[j-1]){
                c++;
            }
            else{
                freq[i] = c;
                min = Math.min(min,c); // minimium frequency
                max = Math.max(max,c); // maximum frequency
                i = j; //  it store the index of first occurrance of element
                c = 1;
            }
            j++;
        }
        freq[i] = c; // it store the remaining frequency that occur at last
        min = Math.min(min,c);
        max = Math.max(max,c);
        int[] ans = new int[n]; int in = n-1; // store the value from the behind

        for (int t = max; t >= min; t--){ // traverse from the max to min
             for (int  k = 0; k < n; k++){
                 if (freq[k] == t){ // freqeucy is at k index is belong element of kth index in original array
                     for (int l = 0; l <t ; l++) { // print the element the t times
                         ans[in--] = num[k]; // we store the element from the back large frequency put at back if same frequency then put smallest element first.., it will to print like that manner
                     }
                 }
             }
        }


        return ans;



    }
}
