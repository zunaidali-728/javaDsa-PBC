import java.util.ArrayList;
import java.util.Collections;


public class DAY7_addtoformNewArray {
    public static void main(String[] args) {
        int[] a = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(arr(a,1));

    }
    static ArrayList<Integer> arr(int[] num, int k ){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length ; i++) {
            list.add(num[num.length-1-i]);
        }


        int j = 0;

        while(k > 0){
            int n = list.get(j) + k%10;
            int digit = (int)(Math.log10(n)+1);

            if(digit > 1){
                if((j+1)!=list.size()){
                    list.set(j,n%10);
                    int x = list.get(j+1)+n/10;
                    if((int)(Math.log10(x)+1) > 1){

                    }
                    else{
                        list.set(j+1,list.get(j+1)+n/10);
                    }

                }
                else{
                    list.set(j,n%10);
                    list.add(n/10);
                }
            }
            else{
                list.set(j,n);
            }
            k /=10;
            j++;
        }

      Collections.reverse(list);
        return list;

    }


}
