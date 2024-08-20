public class PrimeNumber {
    public static void main(String[] args) {

        // it check the n is prime or not
        System.out.println(checkPrimeOrNot(8));


        // prime number between range print it
        int n = 40;
        boolean[] prime = new boolean[n+1]; // because the n is also the index take the size n+1
        print_all_even_between_1_to_n(n,prime);
    }
    static boolean checkPrimeOrNot(int n){
        // first is that run a loop to 2 to n-1 check any number between this is divisible  n or not, if yes it not prime..
//        but in this the time complexity is o(n); lets optimize this
        if (n<1) return false;
        // do same with the while also;;...without the use of inbuilt also..
//        for (int  i = 2; i<= (int)Math.sqrt(n); i++){
//            if (n%i == 0){
//                return false;
//            }
//        }

        // run the loop upto sqtr(n)  time complexity is O(sqrt(n)); optimise then the before
        for (int  i = 2; i*i <= n; i++){
            if (n%i == 0){
                return false;
            }
        }

        return true;

    }
    // we assume that the false will represent the prime, and make it true of multiple of prime
    static void print_all_even_between_1_to_n(int n, boolean[] primeNumbers){

        for (int i = 2; i*i<=n; i++){
            if (!primeNumbers[i]){ // it traverse only the prime one
                for (int j = 2*i; j<=n; j = j+i){// traverse the multiple of prime one except the prime, j is increase the with the i,

                    primeNumbers[j] = true; // true the multiples of prime one

                }
            }
        }

        for (int i = 2; i<= n; i++){
            if (!primeNumbers[i]) {
                System.out.print(i + " ");
            }
        }


    }
}
