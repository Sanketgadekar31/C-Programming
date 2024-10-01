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
