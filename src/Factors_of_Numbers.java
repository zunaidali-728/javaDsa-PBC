import java.util.ArrayList;
import java.util.Collections;

public class Factors_of_Numbers {
    public static void main(String[] args) {
      factors1(20);
        System.out.println(factors2(20));
    }
    static void factors1(int n){
        for(int  i = 1; i<=n; i++){ // T.C = O(n)
            if (n%i == 0) System.out.print(i + " ");
        }
    }
    static ArrayList<Integer> factors2(int n){
        System.out.println();
        ArrayList <Integer> l = new ArrayList<>();
        int i = 1;
        while(i*i <= n){ //T.C = O(sqrt(n))
            if (n%i == 0){
                if (n/i == i){// ignore the repeating factors
//                    System.out.print(i + " ");
                   l.add(i);
                }
                else {
                    l.add(i); l.add(n/i);
//                    System.out.print(i + " ");
//                    System.out.print(n / i + " "); // quotient also divide the n
                }
            }
            i++;
        }

        Collections.sort(l);

        return l;

    }
}
