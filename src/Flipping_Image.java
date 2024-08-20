import java.util.Arrays;

public class Flipping_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] b = flipArray(arr);
        for(int[] a : b){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] flipArray(int[][] a){
        // first reverse the array then flip 0 -> 1 and 1 -> 0
        for(int[] arr : a){
            reverse(arr);
        }
        return a;
    }
    static void reverse(int[] a){
        int l = 0, r  = a.length-1;
        // reverse the array with the flipping with xor of 1
        while(l<=r){
            int temp = a[l]^1;
            a[l] = a[r]^1;
            a[r] = temp;
            l++;r--;
        }
    }
}
