import java.util.Arrays;
import java.util.Scanner;

public class DAY1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
//        int n = sc.nextInt();
//
//        float[] a = new float[n];
//
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = sc.nextFloat();
//        }
//
//        float sum = 0;
//
//        for (float v : a) {
//            sum += v;
//        }
//
//        System.out.println("the sum of the array element is: " + sum);


//        int size = sc.nextInt();
//        int x = sc.nextInt();
//        int[] num = new int[size];
//
//        for (int i = 0; i < num.length ; i++) {
//            num[i] = sc.nextInt();
//        }




//        System.out.println(checkTheIntegerPresence(num,x));
//        System.out.println(averageMarks(num));
//        System.out.println(Arrays.toString(reverseArray(num)));
//        maxElementArray(num);
//        System.out.println(sortedOrNot(num));
//        printName();
        System.out.println(Math.PI);







    }

    public static boolean checkTheIntegerPresence(int[] a, int x){
        for (int i : a){
            if (i == x){
                return true;
            }
        }

        return false;
    }

    static float averageMarks(int[] a){
        float sum = 0;
        for (int i : a){
            sum += i;
        }

        return (sum/a.length);
    }

    static int[] reverseArray(int[] a){
        // with help of swapping
        for (int i = 0; i < a.length/2 ; i++) {
            int temp = a[a.length-1-i];
            a[a.length-1-i] = a[i];
            a[i] = temp;
        }

        // help of print reverse
//        for (int i = 0; i < a.length ; i++) {
//            System.out.print(a[a.length-1-i] + " ");
//        }

        return a;
    }
    static void maxElementArray(int[] a){
        int max = a[0];
        int min = a[0];

        for (int i : a){
            if (max < i){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }

        System.out.println(" the maximum is " + max + " and " + " the minimum is " + min);
    }

    static String sortedOrNot(int[] a){


        for (int i = 0; i < a.length-1 ; i++) {
            if (a[i] > a[i+1]){
                return "Array's Not Sorted";
            }
        }

        return "Array's Sorted";
    }

    static void printName(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] name = new char[str.length()];

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next().charAt(0);
        }

        for (char c : name) {
            System.out.print(c);
        }
    }
}
