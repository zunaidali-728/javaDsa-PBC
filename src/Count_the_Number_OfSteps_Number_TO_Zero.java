public class Count_the_Number_OfSteps_Number_TO_Zero {
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }
    static int countSteps(int n){
        return steps(n ,0);
    }
    static int steps(int n, int count){
        if (n == 0){
            return count;
        }
        if (n % 2 == 0){ // ,when n is even it reduce by 2..
            return steps(n/2,++count);
        }
        return steps(n-1, ++count);  // it is for the odd subtract -1..

    }
}
