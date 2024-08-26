public class Count_Number_OF_Zeros {
    public static void main(String[] args) {
        System.out.println(count(30204,0));
    }
    static int count(int n, int k){
        if (n%10 == 0) k++; // it count the number of zeros,

        if (n%10 == n){ // it return the k when the n%10 == n
            return k;
        }

        return count(n/10,k);  //it reduce the n by 10 every iteration, update the k also

    }
}
