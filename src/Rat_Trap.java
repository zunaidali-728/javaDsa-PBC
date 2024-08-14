import java.util.Scanner;
public class Rat_Trap {
    public static void main(String[] args) {
//        The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area,
//        ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i.
//
//        Note:
//        Return -1 if the array is null.
//        Return 0 if the total amount of food from all houses is not sufficient for all the rats.
//                Computed values lie within the integer range.
//
//        Example:
//        Input:
//        r: 7
//        unit: 2
//        n: 8
//        arr: 2 8 3 5 7 4 1 2
//
//        Output:
//        4
        Scanner sc = new Scanner(System.in);
        int rat = sc.nextInt();
        int unit = sc.nextInt();
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        System.out.println(foodAmount(rat,unit,arr));

    }
    static int foodAmount(int r, int unit, int[] arr){
        int n = arr.length;
        if (n  == 0){
            return -1;
        }
        int total_food = r*unit;
        int current_food_amount = 0; int house = 0;

        for(int  i : arr){
            current_food_amount+= i; house++;
            if (current_food_amount >= total_food){
                return house;
            }
        }

        return 0;

    }

}
