import java.util.*;

public class adult {
    public static void main( String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == b){
        System.out.println("Both are equal");
    }
    else{ if(a > b){
        System.out.println("First number is greater");
    }
    else{
        System.out.println("Second number is greater");
    }
}
}
}
