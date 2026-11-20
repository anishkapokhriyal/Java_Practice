import java.util.*;

public class diamond {
    public static void main(String[] args) {
      int n = 5; 
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" "); // Print spaces
          }
          for (int j = 1; j <= 5; j++) {
              System.out.print("*"); // Print stars
          }
          System.out.println(); // Move to the next line
      }
        
    }
    
}
