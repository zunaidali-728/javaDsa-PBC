import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_Paterrn_List {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }
    static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> l = new ArrayList<>();

        for(int i = 0; i<n; i++){
            l.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            for(int  j = 0; j<=i; j++){
                if (j == 0 || j == i){
                    l.get(i).add(1);
                }
                else{
                    l.get(i).add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
        }

        return l;

    }
}
