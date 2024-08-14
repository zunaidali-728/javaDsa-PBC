import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        long n = 2147483647;
        System.out.println(0%2);
    }
    static int thirdMaxElement(int[] a){
        int n = a.length;
        Arrays.sort(a);

        int i = n-2; int k = 1;

        while(i >= 0){
            if(a[i] < a[i+1]) k++;
            if (k==3) break;
            i--;
        }

        if(i >= 0){
            return a[i];
        }

        return a[n-1]; // if the 3rd element not exist then the return the max element
    }
}
