public class CarringAdigit {
    public static void main(String[] args){
 /*       A carry is a digit that is transferred to left if sum of digits exceeds           9 while adding two numbers from right-to-left one digit at a time.
                You are required to implement the following function.
                Int NumberOfCarries(int num1 , int num2);

        The function accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

        Assumption: num1, num2>=0

        Example:
        Input
        Num 1: 451
        Num 2: 349

        Output
        2      */
        int num1 = 451;
        int num2 = 349;
        System.out.println(NumberOfCarries(num1,num2));
    }
    static int  NumberOfCarries(int num1 , int num2){
            int carry = 0; int count = 0;
            int add;
            while(num1 > 0 && num2 > 0){
                add = num1%10 + num2%10 + carry;
                if(add > 9){
                    carry = 1;
                    count++;
                }
                num1 /= 10; num2 /= 10;
            }

            return count;
    }

}
