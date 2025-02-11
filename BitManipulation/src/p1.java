// checking odd even using AND
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter the value of n : ");
            int n = in.nextInt();
    
            if ((n & 1) == 0) {
                System.out.println(n+" is even ");
            }
            else{
                System.out.println(n+" is odd ");
            }
        }
    }
}
