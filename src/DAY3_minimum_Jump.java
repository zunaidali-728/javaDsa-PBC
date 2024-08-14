public class DAY3_minimum_Jump {
    public static void main(String[] args) {
        int[] a = {0,2,6};
        int n = 11;
        System.out.println(minJumps(a,n));
    }
    static int minJumps(int[] arr, int n) {
        // your code here
        if (arr[0] == 0){
            return -1;
        }

        int index = 0;
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if( i != arr.length-1 && index == i){
                if (arr[i] == 0){
                    return -1;
                }

                index = arr[i] + i;
                count++;

                if(index >= arr.length){
                    return count;
                }

            }
        }

        return count;


    }
}
