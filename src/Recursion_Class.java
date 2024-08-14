public class Recursion_Class {
    // java recursion class kunal kushwaha
    public static void main(String[] args) {
//        printNum(1);
//        printReverse(1);
        System.out.print(0 + " " + 1 + " ");
        fibSeriesRecursion(0,1,1,5);

        System.out.println();

        int n = fibNth(4);
        System.out.println(n);
    }
    static int fibNth(int n){
        if (n < 2){
            return n;
        }
        return fibNth(n-1) + fibNth(n-2);
    }
    static void printNum(int n){
        // base condition, where the new call stops
        if (n == 5){
            System.out.println(n);
            return;  // it return the previous call and flow programme handed to line 12 at every back
        }
        System.out.println(n);
        printNum(n+1); // the line where function calling, flow of programme where send to this line, after that it execute the other code line and after complete back to next previous function called....
    }
    static void printReverse(int n){
        if(n == 5){
            return;
        }
        printReverse(n+1); // after the base condition reach then it will come backl to the n = 4 then the flow of programme continue for n = 4 from this line,, it go so on till n = 1 then it return back to the main function
        System.out.println(n);
//        System.out.println("hiiii");// it start the printing from 4
    }
    static void fibSeriesRecursion(int a, int b, int start, int end){
        if (start == end+1){
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        fibSeriesRecursion(b,c,start+1,end);

    }
}
