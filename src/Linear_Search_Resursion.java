import java.util.ArrayList;
import java.util.Arrays;

class Linear_Search_Recursion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,8,10,22,36,20,52};
        System.out.println(search(a,100,0));

        int[] arr = {1,2,5,6,5,6,5,8,10,12,8,6,3,0};
        ArrayList <Integer> l = new ArrayList<>();
        System.out.println(find(arr,6,0));
//     System.out.println(find(arr,100,0,l));


    }
    static int search(int[] arr, int target, int i){
        if (i == arr.length){ // base condition for the element not exist in the array
            return -1;
        }
        if (arr[i] == target){  // condition for the element found
            return i;
        }

        return search(arr,target,++i); // update the index by 1

    }
    static boolean linear(int[] a, int target, int i){  // valid for the boolean output
        if ( i == a.length){
            return false;
        }
        return a[i] == target || linear(a,target,++i);
    }
    static ArrayList<Integer> find(int[] a, int target, int i, ArrayList<Integer> l){
        if (i == a.length){
            return l;
        }
        if (a[i] == target){
            l.add(i);
        }

        return find(a, target, ++i, l);
    }
    static ArrayList<Integer> find(int[] a, int t, int index){
        ArrayList<Integer> l = new ArrayList<>();
        if (index == a.length){
            return l;
        }
        if (a[index] == t){
            l.add(index);
        }
        ArrayList<Integer> list =  find(a,t,++index);
        // it run when the recursion is reach the base condition
        // when the list is returning it check the current list l is empty or not if it not then it contain the answer so store it in answer list
        if (!l.isEmpty()){
            list.add(l.getFirst());
        }
        return list;

    }
}
