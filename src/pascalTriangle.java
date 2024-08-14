import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(numOfRow(5));
    }
    static List<List<Integer>> numOfRow(int  n){
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i<n; i++){
            l.add(new ArrayList<>());
        }

        int k;

        for (int i = 0; i<n; i++){
            k=0;
            for (int j = 0; j <= i; j++){
                if (i<2){
                    l.get(i).add(1);
                }
                else{
                    if (k == 0 || k == l.get(i-1).size()){
                        l.get(i).add(1);
                        k++;
                    }
                    else{
                        l.get(i).add(l.get(i-1).get(k-1)+l.get(i-1).get(k++));
                    }
                }
            }
        }

        return l;

    }
//    static List<List<Integer>> pascalAngle(int n) {
//     List<List<Integer>> l = new ArrayList<>();
//     for (int i = 0; i < n; i++){
//         l.add(new ArrayList<>());
//     }
//
//     for (int i = 0; i < n; i++){
//         for (int j = 0; j <= i; j++){
//             for (int k = 0; k < n-1-i; k++){
//                 System.out.println(" ");
//             }
//             if (i<2){
//                 System.out.print(1 + " ");
//             }
//             else{
//                 if (j == 0 || j == i){
//                     System.out.print(1 + " ");
//                 }else if(j == 1 || j == i-1){
//                     System.out.print(i + " ");
//                 }
//                 else{
////                     int t = p++ + j;  // p = 1
////                     System.out.print(t + " ");
//                 }
//             }
//         }
//     }
//
//
//    }

//    }
}
