//imports Scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //passes the side lengths to be sorted
    Triangle tri = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
    
    //checks if input is a right triangle
    //if invalid, print INVALID
    if(tri.isValid() == false)
      System.out.println("INVALID");
    
    //if valid, calculate probability and print
    else {
      System.out.println(tri.calculate());
    }
  }
}