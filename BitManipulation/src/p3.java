import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter the number : ");
            int n = in.nextInt();
            if ((n^1)==n+1) {
                System.out.println(n+" is even ");
            }
            else{
                System.out.println(n+" is odd ");
            }
        }
    }
    
}
