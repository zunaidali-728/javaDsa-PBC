public class split_Array_LargestSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(largestSumARRAY(a,2));
        long b = (long)Math.sqrt(5);
        System.out.println(b);

    }
    static int largestSumARRAY(int[] a,int m){
        int sum = 0;
        int max = a[0];
        for (int i : a){
            sum += i;
            if (i > max){
                max = i;
            }
        }

        return sumSplitArray(a,max,sum,m);


    }

    static int sumSplitArray(int[] a, int s, int e, int m){
        while(s<e){
            int mid = s + (e-s)/2;
            int subArrays = 0;
            int sum = 0, i = 0;

            while(i < a.length){
                sum += a[i];
                if(sum > mid){
                    subArrays++;
                    sum = 0;
                }
                else if (i == a.length-1){
                    subArrays++;
                    i++;
                }
                else{
                    i++;
                }

            }

            if (subArrays <= m){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }

        return s;
    }

}
