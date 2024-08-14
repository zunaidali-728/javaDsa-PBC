import java.util.Arrays;

public class DAY4_mergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a));

        for (int j : a) {
            System.out.println(j);
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length ; i++) {
            nums1[m++] = nums2[i];
        }

        Arrays.sort(nums1);

    }
}
