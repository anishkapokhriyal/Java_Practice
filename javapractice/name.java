import java.util.*;
public class name {
    public static void PrintMyName(String name) {
        System.out.println("My name is: " + name);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
