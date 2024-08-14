import java.util.Arrays;

public class Nuniqiueelement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));

    }
    public static int[] sumZero(int n) {
        int[] a = new int[n];
        int j = 0;

        if (n%2==0){
            for (int i = 0; i<a.length/2; i++){
                a[j++] = n;
                a[j++] = -n;
                n--;
            }
        }
        else{
            a[j++] = 0;
            for(int i = 0; i < a.length/2; i++){
                a[j++] = n;
                a[j++] = -n;
                n--;
            }

        }

        return a;

    }
}
