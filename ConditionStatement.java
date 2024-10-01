import java.util.Scanner;

public class ConditionStatement {
    public static void main(String args[]){
        int x = 11;
        if(x % 2 == 0){
            System.out.println(x + " is even.");
        }
        else{
            System.out.println(x + " is odd.");
        }

        System.out.println("DONE");

        int n1 = 20;
        int n2 = 30;

        if(n1 == n2){
            System.out.println(n1 + " is equal to " + n2);
        }
        else if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else{
            System.out.println(n1 + " is smaller than " + n2);
        }

        System.out.println("DONE");

        // Practice

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        }
        else if(marks > 80){
            System.out.println("Good");
        }
        else if(marks > 70){
            System.out.println("Fair");
        }
        else if(marks > 60){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Par");
        }
    }
}
