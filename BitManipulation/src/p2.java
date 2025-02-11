// checking odd even using OR
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("enter the value of n : ");
            int n = in.nextInt();
            if ((n | 1)==n) {
                System.out.println(n+" is odd");
            }
            else{
                System.out.println(n+" is even ");
            }
        }
    }
    
}
