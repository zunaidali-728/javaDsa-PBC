public class SumOfDivisibleOf_m_n {
    public static void main(String[] args) {
/*        You are required to implement the following function:
        Int Calculate(int m, int n);
        The function accepts 2 positive integers ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.

                Note:
        0 < m <= n

        Example
        Input:
        m : 12
        n : 50

        Output
        90
    }  */
//        int m = 12; int n = 50;
        System.out.println(calculate(15,15));
    }
    static int calculate(int m, int n){
        if(m == n && m%3 == 0 && m%5 == 0) return m;

        int sum = 0;
        for (int i = m; i <= n ; i++) {
            if(i%3 == 0 && i%5 == 0) sum += i;
        }
        return sum;
    }
}
