import java.util.Arrays;

public class inversion_Count {
    public static void main(String[] args) {
      int[]  a =  {2, 4, 1, 3, 5};
        System.out.println(inversionCount(a));
    }
    static int inversion(int[] a){
        boolean isdec = true;
        for (int i = 1; i <a.length ; i++) {
            if (a[i-1] < a[i]){
                isdec = false;
                break;
            }
        }
        if (!isdec){
            int c = 0;
            for (int i = 1; i <a.length ; i++) {
                c += i;
            }
            return c;
        }

        int i = 0, j = i;

        while(j < a.length){

            if (a[i] > a[j]){
                swap(a[i],a[j]);
                i++;
            }
            if(a[i] <= a[j]){
                j++;
            }
        }

        return i;


//       int s = 0;
//       int  e = 0;
//       for(int i = 1; i<a.length; i++){
//           e += i;
//       }
//
//       while(s<=e){
//           int m = s + (e-s)/2;
//
//       }


    }
    static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
    }
    static int inversionCount(int[] arr){
        int c = 0;
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[i]) c++;
            }
        }
        return c;
    }
}
