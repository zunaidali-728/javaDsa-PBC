public class LargestNumber {
    public static void main(String[] args) {
//        int[] a = {1,2,3,6};
//        StringBuilder  sb = new StringBuilder();
//        sb.append(a);
//        System.out.println(sb);
        int[] a = {2,10};
        System.out.println(LargestNum(a));
    }
    static String LargestNum(int[] nums){
        StringBuilder sb = new StringBuilder();
        StringBuilder sc = new StringBuilder();

        int n = nums.length; int in,ij;

        for(int  i = 0; i < n-1; i++){
            sb.replace(0,sb.length(), String.valueOf(nums[i]));
            for(int j = i+1; j<n; j++){
                sc.replace(0,sc.length(),String.valueOf(nums[j]));
                in = 0; ij = 0;

                while(Math.max(in,ij) != Math.max(sb.length()-1,sc.length()-1) && sb.charAt(in) == sc.charAt(ij)){
                    if(in+1 < sb.length()) in++;
                    if (ij+1 < sc.length()) ij++;
                }

                 if(sb.charAt(in) < sc.charAt(ij)){
                        swap(nums,i,j);
                        sb.replace(0,sb.length(), String.valueOf(nums[i]));
                }
            }

        }

        StringBuilder ans = new StringBuilder();

        for(int i  : nums){
            ans.append(i);
        }

        return  ans.toString();


    }

     static void swap(int[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
