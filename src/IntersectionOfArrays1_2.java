import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays1_2 {
    public static void main(String[] args) {
        int[] a  ={2,1,2,1};
        int[] b = {2,2};
        System.out.println(intersection_1(a,b)); // it take the unique result
        System.out.println(intersection_2(a,b)); // it take the duplicate also

    }
    static List<Integer> intersection_1(int[] a, int[] b){
//        / not considered the duplicate ones
        boolean[] hash = new boolean[1001];
        List<Integer> l = new ArrayList<>();
        for(int i : a){
            hash[i] = true;
        }

        for (int i : b){
            if(hash[i]){
                l.add(i);
                hash[i] = false;   // like a switch take it and off the switch
            }
        }

        return l;


    }
    static List<Integer> intersection_2(int[] a, int[] b){
       // in this duplicates also considered give the all intersections
        int[] hash = new int[1001];
        List<Integer> l = new ArrayList<>();

        for (int i : a){
            hash[i]++;  // store the duplicates value repeatation,,
        }

        for(int i : b){
            if(hash[i] != 0){
                l.add(i);
                hash[i]--;
            }
        }

        return l;

    }
}
