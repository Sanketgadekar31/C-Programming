//Question Statement:
//1. You've to check whether a given number is prime or not.
//2. Take a number "t" as input representing count of input numbers to be tested.
//3. Take a number "n" as input "t" number of times.
//4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(sc.nextLine());

            int count = 0;
            for (int div = 2; div * div <= n; div++) {      //check only up to under-root(n) value
                if (n % div == 0) {
                    count++;
                    break;                  //reduce unwanted looping
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
