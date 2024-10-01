import java.awt.*;
import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Hello "+ name + ". Here is the counting.");
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}
