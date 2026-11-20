import java.util.*;
public class no {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 4:");
        int button = sc.nextInt();
        //if(button == 1)
        //    System.out.println("hello");
       // else if(button == 2)
        //    System.out.println("namaste");
        //else if(button == 3)
        //    System.out.println("bonjour");
        //else if(button == 4)
        //    System.out.println("hola");
        //else
        //    System.out.println("invalid input");

        switch(button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            case 4:
                System.out.println("hola");
                break;
            default:
                System.out.println("invalid input");
        }


    }
    }
