public class searchinOSortediNFINITEArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,25,26,28,30};
        System.out.println(searchInfiniteArray(a,10));
    }

    static int searchInfiniteArray(int[] a, int target){
        int s = 0;
        int e = 1;

        while(target > a[e]){
            int boxSize = (e-s)+1;
            s = e + 1;
            e += boxSize*2;
        }




        return binarySearchInRange(a,target,s,e);

    }

     static int binarySearchInRange(int[] a, int target, int s, int e) {
        while(s<=e){
            int m = s + (e-s)/2;

            if (a[m] == target){
                return m;
            }
            else if (target > a[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }

        return -1;

    }
}
