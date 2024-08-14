
import java.util.ArrayList;

public class ArrayWithSquareSameOrder {
    public static void main(String[] args) {
        int[] a = {-7,-4,-3,-3,-2,1,2,3,4};

        System.out.println(squareArray(a));
    }
    static ArrayList<Integer> squareArray(int[] a){
        ArrayList<Integer> l = new ArrayList<>();
        int cnt = 1;
        l.add(a[0]*a[0]);
        int j = 0;

        for (int i = 1; i <a.length ; i++) {
            while(a[i]*a[i] > l.get(j)){
                j++;
                if(j == cnt){
                    l.add(a[i]*a[i]);
                    break;
                }
            }
            if (j ==  cnt){
                continue;
            }
            l.add(j,a[i]*a[i]);
            cnt++;
        }


        return l;
    }
}
