import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
//        Problem Description:
//        The Binary number system only uses two digits, 0 and 1 and the number system can be called             binary string. You are required to implement the following function:
//        int OperationsBinaryString(char* str);
//        The function accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:
//– A denotes AND operation
//– B denotes OR operation
//– C denotes XOR Operation
//
//        You are required to calculate the result of the string str, scanning the string to right taking one operation at a time, and return the same.
//
//                Note: No order of priorities of operations is required.
//        Length of str is odd.
//                If str is NULL or None (in case of Python), return -1.
//
//        Input:
//        1C0C1C1A0B1
//
//        Output:
//        1
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(OperationsBinaryString(str));
    }
    static int OperationsBinaryString(String str){
        int n = str.length();
        if (n == 0){
            return -1;
        }
        int ans = Integer.parseInt(String.valueOf(str.charAt(0)));


        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'C'){
                ans = ans ^ Integer.parseInt(String.valueOf(str.charAt(i+1)));
            }
            else if(str.charAt(i) == 'A'){
                ans = ans & Integer.parseInt(String.valueOf(str.charAt(i+1)));
            }
            else if(str.charAt(i) == 'B'){
                ans = ans | Integer.parseInt(String.valueOf(str.charAt(i+1)));
            }
        }

        return ans;
    }
}
