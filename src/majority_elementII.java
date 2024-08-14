import java.util.ArrayList;
import java.util.List;

public class majority_elementII {
    public static void main(String[] args) {
        int[] a = {11,22,11,33,22,11,22};
        System.out.println(majority(a));
        System.out.println(majority2(a));

    }
    static List<Integer> majority(int[] a){
        List<Integer> l = new ArrayList<>();

        // extended moore - vooting algorithm
        int  e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
        int  c1 = 0, c2 = 0;


        // this pass for the select the candidates
        for (int i : a){
            if (c1 == 0 && e2 != i){
                e1 = i;
                c1++;
            }
            else if(c2 == 0 && e1 != i){
                e2 = i;
                c2++;
            }
            else if(e1 == i) c1++;
            else if(e2 == i) c2++;
            else{
                c1--;c2--;
            }
        }


        //this pass is for the confirm the candidate
        c1 = 0; c2 = 0;
        for(int i : a){
            if (e1 == i) c1++;
            if (e2 == i) c2++;
        }

        int min = (a.length/3)+1;

        if (c1 >= min) l.add(e1);
        if (c2 >= min) l.add(e2);


        return l;
    }

    static List<Integer> majority2(int[] b){
        List<Integer> l = new ArrayList<>();

        for(int i : b){

            if (l.isEmpty() || l.getFirst() != i) {
                int c = 0;
                for (int j : b) {
                    if (j == i) c++;
                }
                if(c > b.length/3) l.add(i);

            }

            if (l.size() == 2) break;

        }


        return l;


        }
    }
