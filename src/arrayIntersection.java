import java.util.Arrays;

public class arrayIntersection {
    public static void main(String[] args) {
        int[] a  = {8,0,4,0};
        int[] b = {2,0,0,0,4};
        System.out.println(Arrays.toString(intersect(a,b)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] a = new int[1001];
        int[] b = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] == 0){
                a[nums1[i]]++;
            }
            else{
                a[nums1[i]] += nums1[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (a[nums2[i]] != 0) {

                if(nums2[i] == 0){
                    a[nums2[i]]--;
                    b[k++] = nums2[i];
                }
                else{

                    a[nums2[i]] -= nums2[i];
                    b[k++] = nums2[i];

                }




            }
        }

        return Arrays.copyOf(b,k);
    }
}
