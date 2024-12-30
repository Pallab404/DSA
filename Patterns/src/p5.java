
import java.util.Scanner;

// *****
// ****
// ***
// **
// *

public class p5 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("enter the no of n : ");
    int n = in.nextInt();

    for (int i = 1; i <=n; i++) {
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
        in.close();
    }
   } 
}
