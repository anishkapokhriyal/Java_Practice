import java.util.*;
public class fat {
    public static int factorial(int n) {
        if(n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
        }
      int fact = 1;
      for (int i = n; i >= 1; i--) {
          fact *= i;
        }
      return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }
    
}
