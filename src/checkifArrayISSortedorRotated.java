import java.util.Arrays;

public class checkifArrayISSortedorRotated {
    public static void main(String[] args) {
        int[] a  ={3,6,10,1,8,9,9,8,9};
        System.out.println(sortedCheck(a));
//        System.out.println(Arrays.toString(convertNormalArray(a)));

    }
    static boolean sortedCheck(int[] nums){
        int pivot = pivotIndex(nums);
       if (pivot == -1){
           for (int i = 0; i<nums.length-1; i++){
               if (nums[i] > nums[i+1]){
                   return false;
               }
           }
       }
       else{
           int[] a = convertNormalArray(nums);

           for (int i = 0; i<a.length-1; i++){
               if (a[i] > a[i+1]){
                   return false;
               }
           }
       }

       return true;

    }

     static int pivotIndex(int[] num) {
        int s = 0;
        int e = num.length-1;

        while(s <= e){
            int  m = s + (e-s)/2;


            if(num[s] == num[e]){
                if(s < num.length-1 && num[s] > num[s+1]){
                    return s+1;
                }
                s++;
                if(e > 0 && num[e-1] > num[e]){
                    return e;
                }
                e--;
            }


            if(m > 0 && num[m] < num[m-1]){
                return m;
            }
            else if(num[m] > num[0] || num[m] > num[num.length-1]){
                s = m + 1;
            }
            else if(num[m] < num[0] || num[m] < num[num.length-1]){
                e = m;
            }
        }

        return -1;
    }

    static int[] convertNormalArray(int[] num){
        int pivot = pivotIndex(num);
        int i  = pivot;
        int  j =  0;

        while(pivot != 0 && pivot < num.length){
            int temp = num[i];
            num[i] = num[i-1];
            num[i-1] = temp;
            i--;
            if (i == j){
                pivot++;
                i = pivot;
                j++;
            }
        }

        return num;
    }
}
