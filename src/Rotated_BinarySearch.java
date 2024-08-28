public class Rotated_BinarySearch {
    public static void main(String[] args) {
        int[] arr  = {5,6,1,2,3,4};
        System.out.println(rotated_Search(arr,5));
        System.out.println(searchInRotatedArray(arr,5,0,5));
    }
    // with_out_recursion without find the pivot....
    static int rotated_Search(int[] arr, int target){
        int s = 0, e  = arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;

            if (arr[m] == target){
                return m;
            }
            else if (arr[m] > arr[s]){
                if (target < arr[s] && target > arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
            else if (arr[m] < arr[s]){
                if (target > arr[m] && target < arr[e]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return -1;
    }
    static int searchInRotatedArray(int[] arr, int t, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if (arr[m] == t){
            return m;
        }
        else if (arr[m] >= arr[s]){
            if (t <= arr[s] && t > arr[m]){
                return searchInRotatedArray(arr,t,s,m-1);
            }
            else{
                return searchInRotatedArray(arr,t,m+1,e);
            }
        }

        if (t > arr[m] && t <= arr[e]){
            return searchInRotatedArray(arr,t,m+1,e);
        }
        else {
            return searchInRotatedArray(arr,t,s,m-1);
        }
    }
}
