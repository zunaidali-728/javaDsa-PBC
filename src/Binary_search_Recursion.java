public class Binary_search_Recursion {
    public static void main(String[] args) {
        // binary Search in rotated array
        int[] a = {4,5,6,0,1,2,3};
        System.out.println(pivot(a));
        System.out.println(binary_search_in_rotatedArray(a,3));
    }
    static int binary_search_in_rotatedArray(int[] a, int target){
        // first find the pivot..
        int n = a.length;
        int pivot = findPivot(a,0,n-1); // finding pivot index
        if (pivot == -1){
            return binarySearch_recursion(a,target,0,n-1);
        }
        // edge case, best one.. if pivot is the target
        if (a[pivot] == target){
            return pivot;
        }

        // for first half
        int i = binarySearch_recursion(a,target,0,pivot-1);

        if (i == -1){ // for second half if it is failed
            return binarySearch_recursion(a,target,pivot,n-1);
        }

        return i;

    }
    static int findPivot(int[] arr, int s, int e){
        int n = arr.length;
        if (s>e){
            return -1; //means array is not rotated
        }
        int  m = s+(e-s)/2;

        if (m < n-1 && arr[m] > arr[m+1]){
            return m+1;
        }
        else if (arr[m] > arr[0]){
            return findPivot(arr,m+1,e);
        }
        return findPivot(arr,0,m-1);

    }
    static int binarySearch_recursion(int[] a,int t, int s, int e){
        if (s>e){
            return -1;
        }
        int m  = s+(e-s)/2;

        if (a[m] == t){
            return m;
        }
        else if(a[m] < t){
           return binarySearch_recursion(a,t,m+1,e);
        }

        return binarySearch_recursion(a,t,0,m-1);


    }

    // without recursion, without duplicates
    static int pivot(int[] a){
        int s = 0;
        int e = a.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if (m < a.length-1 && a[m] > a[m+1]){
                return m+1;
            }
            else if(a[m] > a[0]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
}
