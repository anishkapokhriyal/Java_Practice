public class fator {
public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
        int f1 = n * factorial(n - 1);
        return f1;
    }
    public static void main(String args[]) {
     int n = 5; // Example number to calculate factorial
     int result = factorial(n);   
     System.out.println("Factorial of " + n + " is: " + result);
}
}
