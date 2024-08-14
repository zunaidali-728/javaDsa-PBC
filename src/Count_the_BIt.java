public class Count_the_BIt {
    public static void main(String[] args) {
        System.out.println(countBit(100));
        System.out.println(countBit1(5));
        System.out.println(countBitBuiltInFunction(8));
        System.out.println(countBitPowerOf2(10));
    }
    static int countBit(int n){
        int count = 0;
    /// time complexity is O(logn)//
        while(n > 0){
            count += n & 1;
            n >>= 1; // n = n>> 1 shift the n by 1 right side ... and take the bit wise of n with 1 and add in counter
        }

        return count;
    }
    static int countBit1(int n){
        // Brian Kernighan’s Algorithm --> count the set bit
        int count = 0;

        while(n > 0){
            n = n&(n-1);  // update the n with n&(n-1) increment count by 1 until it break
            count++;
        }

        return count;

    }
    static int countBitBuiltInFunction(int n){
        // java inbuilt function to count the bit...Integer.bitCount(_number_)
        return Integer.bitCount(n);
    }
    static int countBitPowerOf2(int n){

        // for the large number use the power of 2 method
        int k = findPowerOf2(n); // get the pow(2,k);; largest power of 2, iterate k to 0
        int count = 0;
        for (int i = k; i >= 0; i--){
            int value = (int)Math.pow(2,i); // upgrade the power of 2 and check it with AND bit with n
            int x = value & n;
            if (x > 0){ // if x > 0 after the and operation count increment
                count++;
            }
        }

        return count;

    }
    static int findPowerOf2(int a){
        int i = 0;
        int num = 0;
        int power = (int)Math.pow(2,i);
        while(power <= a){
            num = i; // store the i value power index
            i++;
            power = (int)Math.pow(2,i); // upgrade the power of 2
        }

        return num;
    }
}
