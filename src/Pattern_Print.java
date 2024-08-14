public class Pattern_Print {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(6);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(4);
        pattern11(4);
    }
    static void pattern1(int n){
 /*     *****
        *****
        *****
        *****
        *****    */
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
 /*   *
      * *
      * * *
      * * * *
      * * * * *    */
        for (int i = 1; i <= n; i++){
            for (int  j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
 /*       *****
          ****
          ***
          **
          *      */
        System.out.println();
        for(int i = 1; i<=n; i++){
            for (int j = 1;j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int i = 1; i < 2 * n ; i++) {
            if(i <= n){
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <= n - (i-n) ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
    static void pattern6(int n){
//           *
//        *  *
//     *  *  *
//  *  *  *  *

        for(int i = 1; i <= n; i++){
            // print spaces
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // pattern
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern7(int n){
        for (int i = 1; i < 2*n ; i++) {
            if (i <= n){
                for (int j = 1; j <=n-i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <=i-n ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n - (i-n) ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = 1; i < 2*n ; i++) {
            if (i <= n){
                for (int j = 1; j <= n-i ; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j > 1 ; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= i ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <= i-n ; j++) {
                    System.out.print("  ");
                }
                for (int j = n-(i-n); j > 1 ; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= n - (i-n) ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

    }
    static void pattern10(int n){
        int space = 2*n-2-1;
        for (int i = 1; i < 2*n ; i++) {
            if (i<=n) {
                for (int j = n; j > n - i + 1; j--) {
                    System.out.print(j);
                }
                for (int j = 0; j <= (2 * n - 1) - 2 * i; j++) {
                    System.out.print(n - i + 1);
                }
                for (int j = n - i + 1; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for (int j = n; j > (i-n) ; j--) {
                    System.out.print(j);
                }
                for (int j = 1; j < 2*(i-n) ; j++) {
                    System.out.print((i-n)+1);
                }
                for (int j = i-n+1; j<=n ; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    static void pattern11(int n){
         n = 2*n;
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n ; j++) {
                int everyIndexElement = Math.min(Math.min(i,n-1-i),Math.min(i-1,n-i-1));
                System.out.print(everyIndexElement+ " ");
            }
            System.out.println();
        }
    }

}
