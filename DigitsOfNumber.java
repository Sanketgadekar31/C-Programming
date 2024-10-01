//Question Statement:
//        1. You've to display the digits of a number.
//        2. Take as input "n", the number for which digits have to be displayed.
//        3. Print the digits of the number line-wise.

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit = 0;
        int temp = n;
        while (temp != 0){
            temp = temp /10;
            digit++;
        }

        int div = (int)Math.pow(10, digit-1);

        while (div != 0){               // 0 will be printed as well
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div /= 10;
        }
    }
}
