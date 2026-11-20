import java.util.*;
public class mark {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("The numbers are:");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
