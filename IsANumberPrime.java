import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            int n = Integer.parseInt(sc.nextLine());

            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            } else{
                System.out.println("Not Prime");
            }
        }


    }
}
