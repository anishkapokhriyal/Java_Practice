import java.util.*;

public class equal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string:");
    String name = sc.nextLine(); 
    System.out.println("Enter the second string:");
    String name1 = sc.nextLine();
    if(name.compareTo(name1) == 0){
        System.out.println("The two strings are equal.");
    } else {
        System.out.println("The two strings are not equal.");
    }
}
}
