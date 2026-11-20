import java.util.*;
public class find {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size for the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        } 
        System.out.print("Enter the number to search for: ");
        int x= sc.nextInt();
        for(int i = 0; i < numbers.length ; i++) {
            if(numbers[i]==x){
                System.out.println("The number is found at index: " + i);
                return;
            }
        }
        System.out.println("The number is not found in the array.");
    }
}
