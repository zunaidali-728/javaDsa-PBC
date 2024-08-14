import java.util.Arrays;

public class missing_repeatNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,3};
        System.out.println(Arrays.toString(m_r_num(a)));
    }
    static int[] m_r_num(int[] arr){
        int[] a =  new int[arr.length+1];
        int r = 0;

        for (int  i : arr){
            if (a[i]!=0){
                r = i;
            }
            else{
                a[i] = 1;
            }
        }

        int arraySum =0, currentSum = 0;

        for (int i = 0; i <arr.length ; i++) {
            arraySum += arr[i];
            currentSum += (i+1);
        }

        return new int[]{r,r-(arraySum-currentSum)};



    }
}
