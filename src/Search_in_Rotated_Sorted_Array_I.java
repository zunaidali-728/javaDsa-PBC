public class Search_in_Rotated_Sorted_Array_I {
    public static void main(String[] args) {

        int[] a  = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(searchInR(a,2));
//        1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1
    }
    static boolean searchInR(int[] nums, int target){

        int pivot  = searchPivot(nums);

        if (pivot == -1){
            return binaryS(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target) {
            return true;
        }



        if(!binaryS(nums, target, 0, pivot)){
            return binaryS(nums, target, pivot+1, nums.length - 1);
        }

        return true;




    }

    static int searchPivot(int[] a){
        int s = 0;
        int e = a.length - 1;

        /// 2,5,6,0,0,1,2

        while(s <= e){

            int m = s + (e-s)/2;

            if (a[s]==a[e]) {
                if (a[s] > a[s + 1]) {
                    return s;
                }
                s++;
                if (a[e - 1] > a[e]) {
                    return e-1;
                }
                e--;
            }
            else if(m > s && a[m] < a[m-1]){
                return m-1;
            }
            else if (m < e && a[m] > a[m+1]){
                return m;
            }
            else if(a[m] > a[s] || a[m] > a[e]){
                s = m+1;
            }
            else if (a[m] < a[s] || a[m] < a[e]){
                e = m-1;
            }
        }

        return -1;
    }

    static boolean  binaryS(int[] a, int x, int s, int e){

        while(s<=e){
            int  m = s + (e-s)/2;

            if(x == a[m]){
                return true;
            }
            else if(x > a[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }

        }

        return false;

    }
}
