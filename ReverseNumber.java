//Question Statement:
//        1. You've to display the digits of a number in reverse.
//        2. Take as input "n", the number for which digits have to be display in reverse.
//        3. Print the digits of the number line-wise, but in reverse order.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0){
            int a = n % 10;
            System.out.println(a);
            n /= 10;
        }
    }
}
