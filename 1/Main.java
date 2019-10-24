import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
        The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("This program finds the sum of all the multiples of 2 inputted numbers below the max inputted number.");
        System.out.println("Enter the first multiple:");
        int mult1 = sc.nextInt();
        System.out.println("Enter the second multiple:");
        int mult2 = sc.nextInt();
        System.out.println("Enter the max:");
        int max = sc.nextInt();

        sumMults(mult1, mult2, max);
        sc.close();
    }

    private static void sumMults(int mult1, int mult2, int max){
        int sum = 0, mult1Sum = mult1, mult2Sum = mult2;
        while(mult1Sum < max){
            sum += mult1Sum;
            mult1Sum += mult1;
        }
        while(mult2Sum < max){
            sum += mult2Sum;
            mult2Sum += mult2;
        }
        System.out.println("Sum of multiples of " + mult1 + " and " + mult2 + " under " + max + " = " + sum);
    }
}